//Isaac Gershon 17th Feb 2023
//Key Input Class
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
   
   Game game;
   
   public KeyInput (Game game){
      this.game = game;
   }
   
   public void keyPressed (KeyEvent e){
      game.keyPressed(e);
   }
   
   public void keyReleased (KeyEvent e){
      game.keyReleased(e);
   }
}