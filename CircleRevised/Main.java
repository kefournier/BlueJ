
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
 
      public static void main(String[] args){
        
        CircleRevised myCircle = new CircleRevised(6);
        
        /*
        //Demonstrating how to get at the radius value of myCircle object
        System.out.println(myCircle.radius);
        */
       
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

    