
/**
 * Circle Program - Unit 2
 *
 * @author Mrs. Fournier
 * @version October 14, 2020
 */
public class Circle
{
    // instance variable
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int circleRadius)
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
        
    public static void main(String[] args){
        
        Circle myCircle = new Circle(6);
        
        //Demonstrating how to get at the radius value of myCircle object
        System.out.println(myCircle.radius);
        
        //If our main method was in a separate file, we would 
        //need to use a getter method like getRadius to get at
        //that private instance variable of radius
        System.out.println(myCircle.getRadius());
        
        //calling my getArea method on the myCircle object
        System.out.println(myCircle.getArea());
        
        //using printf (just like in C!) to limit the decimal places
        System.out.printf("%.2f", myCircle.getArea());
        
        
        
    }
        
        

  
}
