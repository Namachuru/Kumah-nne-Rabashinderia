//Isaac Gershon 25th Feb 2023
//Textures Class
import java.awt.image.BufferedImage;

public class Textures {
   
   public BufferedImage[] player = new BufferedImage[2];
   public BufferedImage[] missile = new BufferedImage[2];
   public BufferedImage[] enemy = new BufferedImage[2];
   private SpriteSheet ss;
   
   public Textures(Game game){
      ss = new SpriteSheet(game.getSpriteSheet());
      
      getTextures();
   }
   
   private void getTextures(){
      player[0] = ss.grabImage(1, 1, 70, 70);
      player[1] = ss.grabImage(1, 2, 70, 70);
      
      missile[0] = ss.grabImage(2, 1, 70, 70);
      missile[1] = ss.grabImage(2, 2, 70, 70);
      
      enemy[0] = ss.grabImage (3, 1, 70, 70);
      enemy[1] = ss.grabImage (3, 2, 70, 70);
   }
}