package Panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class PappuPanel extends JPanel {
    public PappuPanel() {
    }

    protected static BufferedImage loadImage(String filename){
        BufferedImage img = null;
        try{
            img = ImageIO.read(GamePanel.class.getResourceAsStream("/" + filename));
        } catch (IOException e) {
            System.out.println("Error in finding file" + filename);
            e.printStackTrace();
        }
        return img;
    }
}
