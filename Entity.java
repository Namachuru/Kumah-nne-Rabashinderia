//Isaac Gershon 8th Aug 2023
//Entity interface
import java.awt.Graphics;

public interface Entity {

   public void tick();
   public void render(Graphics g);
   
   public double getX();
   public double getY();
}