package oficial;

import Modelos.Usuario;
import SQLite.ConectarBanco;
import javax.swing.JOptionPane;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_core.Rect;
import org.bytedeco.javacpp.opencv_core.RectVector;
import org.bytedeco.javacpp.opencv_core.Scalar;
import org.bytedeco.javacpp.opencv_core.Size;
import static org.bytedeco.javacpp.opencv_imgcodecs.imwrite;
import static org.bytedeco.javacpp.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.rectangle;
import static org.bytedeco.javacpp.opencv_imgproc.resize;
import org.bytedeco.javacpp.opencv_objdetect.CascadeClassifier;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class TelaFoto {
    static int idPessoa;
    
    private static OpenCVFrameConverter.ToMat converteMat = new OpenCVFrameConverter.ToMat();
    private static OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0);
    private static CascadeClassifier detectorFace = new CascadeClassifier("src\\oficial\\haarcascade_frontalface_alt.xml");
    private static CanvasFrame cFrame;
    private static Frame frameCapturado = null;
    private static Mat imagemColorida = new Mat();
    private ConectarBanco bd;
    private final Usuario usuario;
       
    private int limiteFotos;
    private int contadorFotos;

    public TelaFoto(Usuario usuario) throws FrameGrabber.Exception, InterruptedException {
        this.usuario = usuario;
        inicializar();
    }

    private void inicializar() throws FrameGrabber.Exception, InterruptedException {
        startWebCam();
        tirandoFoto();       
        cFrame.dispose();
        camera.stop();   
        treinamento();
        cFrame = new CanvasFrame("Tela foto", CanvasFrame.getDefaultGamma() / camera.getGamma());
    }

    private void startWebCam() throws FrameGrabber.Exception 
    {       
        converteMat = new OpenCVFrameConverter.ToMat();
        camera = new OpenCVFrameGrabber(0);

        camera.start();     
        
        detectorFace = new CascadeClassifier("src\\oficial\\haarcascade_frontalface_alt.xml");       
    }

    private void tirandoFoto() throws FrameGrabber.Exception {
        frameCapturado = null;
        imagemColorida = new Mat();

        limiteFotos = 25;
        contadorFotos = 1;

        while ((frameCapturado = camera.grab()) != null) {
            imagemColorida = converteMat.convert(frameCapturado);
            Mat imagemCinza = new Mat();
            cvtColor(imagemColorida, imagemCinza, COLOR_BGRA2GRAY);
            RectVector facesDetectadas = new RectVector();
            detectorFace.detectMultiScale(imagemCinza, facesDetectadas, 1.1, 1, 0, new Size(150, 150), new Size(500, 500));

            for (int i = 0; i < facesDetectadas.size(); i++) {
                Rect dadosFace = facesDetectadas.get(0);
                rectangle(imagemColorida, dadosFace, new Scalar(0, 0, 255, 0));

                Mat faceCapturada = new Mat(imagemCinza, dadosFace);
                resize(faceCapturada, faceCapturada, new Size(160, 160));
                if (contadorFotos <= limiteFotos) {
                    idPessoa = usuario.getId();

                    imwrite("src\\fotos\\" + idPessoa + "_" + contadorFotos + "_" + usuario.getNome() + ".jpg", faceCapturada);
                    contadorFotos++;
                }
            }

            if (cFrame.isVisible()) {
                cFrame.showImage(frameCapturado);
            }

            if (contadorFotos > limiteFotos) {
                break;
            }
        }
    }
    
    public void treinamento(){
        int cont = 0;
        
        JOptionPane.showMessageDialog(null, "Começando o treinamento do LBPH");
        Treinamento treinamento = new Treinamento();
        cont += 1;

        if(cont == 1){
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setVisible(true);
        }
    }
}
