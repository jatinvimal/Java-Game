package Frames;

import Panels.MenuPanel;

import javax.swing.*;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class MenuFrame extends PappuFrame {
    private MenuPanel menuPanel = new MenuPanel();


    public MenuFrame() {
        this.menuPanel = menuPanel;
        JLabel label  = new JLabel(new ImageIcon("plan"));
    }
}
