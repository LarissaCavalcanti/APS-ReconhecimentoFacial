package oficial;

import Modelos.Usuario;
import SQLite.ConectarBanco;
import java.io.File;
import javax.swing.JOptionPane;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.IntPointer;
import static org.bytedeco.javacpp.opencv_core.FONT_HERSHEY_PLAIN;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_core.Point;
import org.bytedeco.javacpp.opencv_core.Rect;
import org.bytedeco.javacpp.opencv_core.RectVector;
import org.bytedeco.javacpp.opencv_core.Scalar;
import org.bytedeco.javacpp.opencv_core.Size;
import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createLBPHFaceRecognizer;

import static org.bytedeco.javacpp.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.putText;
import static org.bytedeco.javacpp.opencv_imgproc.rectangle;
import static org.bytedeco.javacpp.opencv_imgproc.resize;
import org.bytedeco.javacpp.opencv_objdetect.CascadeClassifier;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class TelaReconhecimento {

    private static int contador;
    private static String nome;

    private static OpenCVFrameConverter.ToMat converteMat = new OpenCVFrameConverter.ToMat();
    private static OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0);
    private static CascadeClassifier detectorFace = new CascadeClassifier("src\\oficial\\haarcascade_frontalface_alt.xml");
    private static FaceRecognizer reconhecedor = createLBPHFaceRecognizer();
    private static CanvasFrame cFrame;
    private static Frame frameCapturado = null;
    private static Mat imagemColorida;
    private static Usuario usuario;
    private static ConectarBanco banco;

    public TelaReconhecimento() throws FrameGrabber.Exception, InterruptedException {
        File diretorio = new File("src\\fotos");
        File[] arquivos = diretorio.listFiles();

        if (arquivos.length > 1) {      
            inicializar();
        } else {
            JOptionPane.showMessageDialog(null, "Não a nenhum cadastro feito");
            new TelaInicial().setVisible(true);
        }
    }

    private void inicializar() throws FrameGrabber.Exception, InterruptedException {

        banco = new ConectarBanco();

        startWebCam();
        fazendoReconhecimentoDoUsuario();

        cFrame.dispose();
        camera.stop();
    }

    public void startWebCam() throws FrameGrabber.Exception {
        converteMat = new OpenCVFrameConverter.ToMat();
        camera = new OpenCVFrameGrabber(0);
        detectorFace = new CascadeClassifier("src\\oficial\\haarcascade_frontalface_alt.xml");

        reconhecedor = createLBPHFaceRecognizer();
        reconhecedor.load("src\\recursos\\classificadorLBPHYale.yml");
        reconhecedor.setThreshold(750);

        cFrame = new CanvasFrame("Reconhecimento", CanvasFrame.getDefaultGamma() / camera.getGamma());
        camera.start();
    }

    public void fazendoReconhecimentoDoUsuario() throws FrameGrabber.Exception {
        frameCapturado = null;
        imagemColorida = new Mat();
        contador = 0;

        while ((frameCapturado = camera.grab()) != null) {
            imagemColorida = converteMat.convert(frameCapturado);
            Mat imagemCinza = new Mat();
            cvtColor(imagemColorida, imagemCinza, COLOR_BGRA2GRAY);

            RectVector facesDetectadas = new RectVector();
            detectorFace.detectMultiScale(imagemCinza, facesDetectadas, 1.1, 2, 0, new Size(100, 100), new Size(500, 500));

            for (int i = 0; i < facesDetectadas.size(); i++) {
                Rect dadosFace = facesDetectadas.get(i);
                rectangle(imagemColorida, dadosFace, new Scalar(0, 255, 0, 0));
                Mat faceCapturada = new Mat(imagemCinza, dadosFace);
                resize(faceCapturada, faceCapturada, new Size(160, 160));

                IntPointer rotulo = new IntPointer(1);
                DoublePointer confianca = new DoublePointer(1);
                reconhecedor.predict(faceCapturada, rotulo, confianca);

                Integer predicao = rotulo.get(0);

                usuario = banco.getUser(predicao);

                if (usuario == null) {
                    nome = "Desconhecido";
                } else {
                    if (predicao == usuario.getId()) {
                        TelaUsuario tela = new TelaUsuario(usuario);                 
                        tela.setVisible(true);
                        cFrame.dispose();
                        return;
                    }
                }

                int x = Math.max(dadosFace.tl().x() - 10, 0);
                int y = Math.max(dadosFace.tl().y() - 10, 0);
                putText(imagemColorida, nome, new Point(x, y), FONT_HERSHEY_PLAIN, 1.4, new Scalar(0, 255, 0, 0));
            }

            if (cFrame.isVisible()) {
                cFrame.showImage(frameCapturado);
            }
        }
    }
}
