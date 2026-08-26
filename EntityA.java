//Isaac Gershon 8th Aug 2023
//EntityA interface
package body;

import java.awt.Graphics;
import java.awt.Rectangle;

public interface EntityA {
   public void tick();
   public void render(Graphics g);
   public Rectangle getBounds();
   
   public double getX();
   public double getY();
}