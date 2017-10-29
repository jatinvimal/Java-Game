package Panels;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class GamePanel extends PappuPanel implements KeyListener {

    private static final int WINDOW_X = 0;
    private static final int Window_Y = 0;
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 500;
    private static int p = 2;

    private static final int PLAYER_Y = 280;
    private static final int PLAYER_X = 40;

    private Rectangle Plank_top_rectangle;
    private Rectangle Plank_mid_rectangle;
    private Rectangle Plank_bot_rectangle;

    private BufferedImage pappu1 = GamePanel.loadImage("pappu1.png");
    private BufferedImage pappu2 = GamePanel.loadImage("pappu2.png");
    private BufferedImage pappu3 = GamePanel.loadImage("pappu3.png");
    private BufferedImage pappu4 = GamePanel.loadImage("pappu4.png");
    private BufferedImage pappu5 = GamePanel.loadImage("pappu5.png");
    private BufferedImage pappu6 = GamePanel.loadImage("pappu6.png");
    private BufferedImage pappu7 = GamePanel.loadImage("pappu7.png");
    private BufferedImage pappu8 = GamePanel.loadImage("pappu8.png");
    private BufferedImage background = GamePanel.loadImage("bg_combined.png");
    private BufferedImage ground = GamePanel.loadImage("ground.png");
    private BufferedImage Log = GamePanel.loadImage("log.png");
    private BufferedImage stand = GamePanel.loadImage("stand.png");
    private BufferedImage dig = GamePanel.loadImage("dig.png");
    private BufferedImage planktop = GamePanel.loadImage("plank_top.png");
    private BufferedImage plankmid = GamePanel.loadImage("plank_mid.png");
    private BufferedImage plankbot = GamePanel.loadImage("plank_bot.png");
    private BufferedImage playerpappu[] = {pappu1, pappu2, pappu3, pappu4, pappu5, pappu6,
            pappu7, pappu8, pappu7, pappu6, pappu5, pappu4, pappu3, pappu2, pappu1};
    private static int index = 0;

    public GamePanel() {
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(this);

    }

    protected void paintComponent(Graphics g) {

        index++;
        index = index % 14;
        g.fillRect(WINDOW_X, Window_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.drawImage(background, 0, 0, null);
        g.drawImage(Log, 50, 320, null);
        g.drawImage(playerpappu[index], PLAYER_X, PLAYER_Y, null);
        g.drawImage(ground, 0, -20, null);
        g.drawImage(dig, 804, 430, null);
        g.drawImage(stand, 800, 80, null);
        g.drawImage(planktop, 720, 120, null);
        g.drawImage(plankmid, 720, 210, null);
        g.drawImage(plankbot, 720, 290, null);


        Font font1 = new Font("Serif", Font.BOLD, 36);
        g.setFont(font1);
        g.setColor(Color.white);
        g.drawString("START", 770, 165);

        Font font2 = new Font("Serif", Font.BOLD, 36);
        g.setFont(font2);
        g.setColor(Color.white);
        g.drawString("QUIT", 780, 255);

        Font font3 = new Font("Serif", Font.BOLD, 36);
        g.setFont(font3);
        g.setColor(Color.white);
        g.drawString("HELP", 770, 340);


    }

    private void hidehomepanel() {

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
