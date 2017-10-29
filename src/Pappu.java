import Frames.GameFrame;

/**
 * Created by jatin kumar vimal on 05/10/2017.
 */
public class Pappu  {
    public static void main(String[] args) {
        startGame();
    }
    public static void startGame(){
        GameFrame gameFrame= new GameFrame();
        while (true){
            gameFrame.getContentPane().repaint();
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
