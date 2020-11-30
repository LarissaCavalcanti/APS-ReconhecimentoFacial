package oficial;

import java.io.File;
import java.nio.IntBuffer;
import org.bytedeco.javacpp.opencv_core;
import static org.bytedeco.javacpp.opencv_core.CV_32SC1;
import org.bytedeco.javacpp.opencv_face;
import static org.bytedeco.javacpp.opencv_face.createLBPHFaceRecognizer;
import static org.bytedeco.javacpp.opencv_imgcodecs.CV_LOAD_IMAGE_GRAYSCALE;
import static org.bytedeco.javacpp.opencv_imgcodecs.imread;
import static org.bytedeco.javacpp.opencv_imgproc.resize;

public class Treinamento {

    private static int classe; 
    
    public Treinamento(){
        
        File diretorio = new File("src\\fotos");//Onde estão salvas as fotos tiradas
        
        File[] arquivos = diretorio.listFiles();
        
        if(arquivos.length != 0){
            opencv_core.MatVector fotos = new opencv_core.MatVector(arquivos.length);//aqui eu passo a quantidade de fotos que eu tenho
            opencv_core.Mat rotulos = new opencv_core.Mat(arquivos.length, 1, CV_32SC1);//
            IntBuffer rotulosBuffer = rotulos.createBuffer();
            IntBuffer rotulosBuffer2 = rotulos.createBuffer();
            int contador = 0;

            for(File imagem : arquivos){
                opencv_core.Mat foto = imread(imagem.getAbsolutePath(), CV_LOAD_IMAGE_GRAYSCALE);//Faz a leitura da imagem já convertendo para a imagem cinza
              
                classe = Integer.parseInt(imagem.getName().substring(0,1));//o substring 7,9 serve para pegar somente o ID da imagem, toda seguem o msm padrão
                resize(foto, foto, new opencv_core.Size(160,160));//Redimensiono a imagem, todas as fotos tem que estar com a msm dimensão
                fotos.put(contador, foto);
                rotulosBuffer.put(contador, classe);
                contador++;                                
            }
                
            opencv_face.FaceRecognizer lbph = createLBPHFaceRecognizer(12, 10, 15, 15, 0);
            lbph.train(fotos, rotulos);
            lbph.save("src\\recursos\\classificadorLBPHYale.yml");
            System.out.println("terminei1");
        }
    }   
}
