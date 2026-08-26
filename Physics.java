//Isaac Gershon 10th Aug 2023
//Physics class
import java.util.LinkedList;
import body.EntityA;
import body.EntityB;

public class Physics {
   
   public static boolean Collision (EntityA enta, EntityB entb){
   
      if(enta.getBounds().intersects(entb.getBounds())){
         return true;         
      }
      return false;
   }
   
   public static boolean Collision (EntityB entb, EntityA enta){
   
      if(entb.getBounds().intersects(enta.getBounds())){
         return true;
      }
      return false;
   }
}