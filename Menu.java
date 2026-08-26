//Isaac Gershon 15th Aug 2023
//Menu class
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class Menu{
   
   public Rectangle playButton = new Rectangle (Game.WIDTH / 2 + 120, 150, 100, 50);
   public Rectangle helpButton = new Rectangle (Game.WIDTH / 2 + 120, 250, 100, 50);
   public Rectangle quitButton = new Rectangle (Game.WIDTH / 2 + 120, 350, 100, 50);
   
   public void render (Graphics g){
      Graphics2D g2d = (Graphics2D) g;
      
      Font fnt0 = new Font ("arial", Font.BOLD, 40);
      g.setFont (fnt0);
      g.setColor (Color.white);
      g.drawString ("Kumah-nne-Rabashinderia", Game.WIDTH / 4, 100);
      
      Font fnt1 = new Font ("arial", Font.BOLD, 20);
      g.setFont (fnt1);
      g.drawString ("Play", playButton.x + 29, playButton.y + 33);
      g2d.draw(playButton);
      g.drawString ("Help", helpButton.x + 29, helpButton.y + 33);
      g2d.draw(helpButton);
      g.drawString ("Quit", quitButton.x + 29, quitButton.y + 33);
      g2d.draw(quitButton);
   }
}