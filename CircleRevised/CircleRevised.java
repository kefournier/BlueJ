
/**
 * Circle Program Revised to Use Multiple Class Files
 *
 * @author Mrs. Fournier
 * @version October 14, 2020
 */
public class CircleRevised
{
    // instance variable
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public CircleRevised(int circleRadius)
    {
        // initialise instance variables
        radius = circleRadius;
    }
    
    public int getRadius(){
        
        return radius;
    }
        
    //since I know I will be working with the value of PI
    //in my equation, I want to return a double for this method
    //which means my method signature also needs to indicate double
    public double getArea(){
        
        double area = 2 * Math.PI * Math.pow(radius, 2);
        return area;
    }    

  
}
