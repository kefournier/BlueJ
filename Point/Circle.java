
/**
 * Circle Class
 *
 * @author Kirsten Fournier
 * @version January 5, 2021
 */
public class Circle
{
    private int x;
    private int y;
    double radius;
    
    public Circle(int circleX, int circleY){
        x = circleX;
        y = circleY;
    }
    
    public Circle(int circleX, int circleY, double circleRadius){
        x = circleX;
        y = circleY;
        radius = circleRadius;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public void tripleTheRadius(){
        radius *= 3;
    }
    
    public double getArea(){
        return 3.14 * Math.pow(this.radius, 2);
    }
    
    public boolean isInCircle(int a, int b){
        double inCircle = Math.sqrt(Math.pow((a - this.x), 2) + Math.pow((b - this.y), 2));
        if (inCircle >= this.radius){
            return false;
        }
        return true;
    }
    
    
}
