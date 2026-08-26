//Isaac Gershon 1st Feb 2023
//Game Class
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
   
   public static final int WIDTH = 320;
   public static final int HEIGHT = WIDTH / 12 * 9;
   public static final int SCALE = 2;
   public final String TITLE = "Kumah-nne-Rabashinderia";
   
   private boolean running = false;
   private Thread thread;
   
   private synchronized void start(){
      if(running)
         return;
         
      running = true;
      thread = new Thread (this);//Ended Here ++++ #2 9:59
      thread.start();
   }
   
   private synchronized void stop(){
      if (!running)
         return;
      
      running = false;
      try {
         thread.join();
      }
      catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.exit(1);
   }
   
   //Run Method
   public void run() {
      
      while(running){
         
      }
      stop();
   }
   
   public static void main (String [] args){
      Game game = new Game();
      
      game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
      game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
      game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
      
      JFrame frame = new JFrame(game.TITLE);
      frame.add(game);
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      game.start();
   }
}