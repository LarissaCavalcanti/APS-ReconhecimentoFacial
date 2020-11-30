package oficial;

import SQLite.ConectarBanco;
import org.bytedeco.javacv.FrameGrabber;

public class Main {
    public static void main(String[] args) throws FrameGrabber.Exception, InterruptedException{
        ConectarBanco conectarBanco = new ConectarBanco();
        new TelaInicial().setVisible(true);     
    }
}
