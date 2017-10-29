package Panels;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class Scorepanel extends PappuPanel implements KeyListener {
    public Scorepanel() {
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
