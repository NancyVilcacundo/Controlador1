/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class Fondo implements Border{
    BufferedImage fon;
 
    public Fondo(){
        try {
            URL imagePath = new URL(getClass().getResource("/imagen/fondo.jpg").toString());
            fon = ImageIO.read(imagePath);
        } catch (Exception ex) {
            Logger.getLogger(cargarImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(fon, (x + (width - fon.getWidth())/2),(y + (height - fon.getHeight())/2), null);
    }
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return true;
    }
}
