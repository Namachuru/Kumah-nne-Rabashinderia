//Isaac Gershon 23rd Feb 2023
//Bullet Class
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import body.EntityA;
import body.EntityB;
import action.Animation;

public class Bullet extends GameObject implements EntityA {
   
   private Textures tex;
   private Game game;
   
   Animation anim;
   
   public Bullet(double x, double y, Textures tex, Game game){
      super(x, y);
      this.tex = tex;
      this.game = game;
      
      anim = new Animation(1, tex.missile[0], tex.missile[1]);
   }
   
   public void tick(){
      y -= 10;
      
      anim.runAnimation();
   }
   
   public Rectangle getBounds(){
      return new Rectangle ((int)x, (int)y, 32, 32);
   }
   
   public void render (Graphics g){
      anim.drawAnimation(g, x, y, 0);
      //g.drawImage(tex.missile, (int) x, (int) y, null);
   }
   
   public double getX(){
      return x;
   }
   
   public double getY(){
      return y;
   }
}