package suporte;

import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;

public class TirarPrintDaTela {

    public static void tirarPrint(){
        try{
            Robot rbt = new Robot();
            Rectangle rct = new Rectangle(0, 0, 1920, 1080);
            BufferedImage screenshot = rbt.createScreenCapture(rct);
            
            ImageIO.write(screenshot, "PNG", new File("C:\\Users\\felip\\OneDrive\\Documentos\\Screenshots\\" + GerarDataHora.geradorDeDataHora() + ".png"));

        }catch(Exception e){
            System.out.println("Erro ao tirar print da tela: " + e.getMessage());
        }
        
    }
}
