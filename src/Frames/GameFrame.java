package Frames;

import Panels.GamePanel;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class GameFrame extends PappuFrame {
    public GameFrame() {
        setContentPane(new GamePanel());
        pack();
        setVisible(true);
    }
}
