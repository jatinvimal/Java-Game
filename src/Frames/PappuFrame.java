package Frames;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class PappuFrame extends JFrame {
    private static final int WINDOW_WIDTH=1000;
    private static final int WINDOW_HEIGHT=500;

    //private MenuPanel menuPanel;

    public PappuFrame(){
        setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
