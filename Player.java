//Isaac Gershon 17th Feb 2023
//Player Class
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import body.EntityA;
import body.EntityB;
import action.Animation;

public class Player extends GameObject implements EntityA {
   
   private int velX = 0;
   private int velY = 0;
   private Textures tex;
   
   Game game;
   Controller controller;
   Animation anim;
   
   public Player (double x, double y, Textures tex, Game game, Controller controller){
      super(x, y);
      this.tex = tex;
      this.game = game;
      this.controller = controller;
      
      anim = new Animation(1, tex.player[0], tex.player[1]);
   }
   
   public void tick(){
      x+=velX;
      y+=velY;
      
      if (x <= 0)
         x = 0;
      if (x >= 640 - 60)
         x = 640 - 60;
      if (y <= 0)
         y = 0;
      if (y >= 480 - 70)
         y = 480 - 70; 
      
      for (int i = 0; i < game.eb.size(); i++)
      {
         EntityB tempEnt = game.eb.get(i);
         
         if (Physics.Collision (this, tempEnt)){
            controller.removeEntity (tempEnt);
            Game.HEALTH -= 10;
            game.setEnemy_killed(game.getEnemy_killed() + 1);
         }
      }
      
      anim.runAnimation();  
   }
   
   public Rectangle getBounds(){
      return new Rectangle ((int)x, (int)y, 32, 32);
   }
   
   public void render (Graphics g){
      anim.drawAnimation(g, x, y, 0);
      //g.drawImage (tex.player, (int)x, (int)y, null);
   }
   
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public void setX (double x){
      this.x = x;
   }
   public void setY (double y){
      this.y = y;
   }
   public void setVelX(int velX){
      this.velX = velX;
   }
   public void setVelY(int velY){
      this.velY = velY;
   }
}  