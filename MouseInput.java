//Isaac Gershon 16th Aug 2023
//MouseInput class
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseInput implements MouseListener{
   public void mouseEntered (MouseEvent arg0){
      //TODO Auto-generated method stub
      
   }
   
   @Override
   public void mouseExited (MouseEvent arg0){
      //TODO Auto-generated method stub
      
   }
   
    @Override
   public void mouseClicked (MouseEvent arg0){
      //TODO Auto-generated method stub
      
   }
   
   public void mousePressed (MouseEvent e){      
      int mx = e.getX();
      int my = e.getY();
      
      /**
         public Rectangle playButton = new Rectangle (Game.WIDTH / 2 + 120, 150, 100, 50);
         public Rectangle helpButton = new Rectangle (Game.WIDTH / 2 + 120, 250, 100, 50);
         public Rectangle quitButton = new Rectangle (Game.WIDTH / 2 + 120, 350, 100, 50);
      */
      
      //Play Button
      if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220)
      {
         if (my >= 150 && my <=  200)
         {
            //Pressed Play Button
            Game.State = Game.STATE.GAME;
         }
      }
      
      //Quit Button
      if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220){
         if (my >= 350 && my <=  400){
            //Pressed Quit Button
            System.exit(1);
         }
      }
   }
   
   @Override
   public void mouseReleased (MouseEvent arg0){
      //TODO Auto-generated method stub
      
   }
}