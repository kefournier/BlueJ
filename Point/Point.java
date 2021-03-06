
/**
 * Unit 5 - Point Class
 *
 * @author Mrs. Fournier
 * @version January 5, 2021
 */
public class Point {
   private int x;
   private int y;

   public Point(){
       x = 0;
       y = 0;
   }
   public Point(int x, int y){
       this.x = x;
       this.y = y;
   }
   public void translate(int dx, int dy){
       x += dx;
       y += dy;
   }
   public double distanceToOrigin(){
       return Math.sqrt(x * x + y * y);
   }

   //accessor method
   public void printTranslate(){
       System.out.println(x + " " + y);
   }
   
   
   public String toString(){
       return this.x + "," + this.y;
    }
    
}
