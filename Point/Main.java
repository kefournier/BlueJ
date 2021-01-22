
/**
 * Main Class
 *
 * @author Mrs. Founrier
 * @version January 21, 2021
 */
public class Main{

    public static void main(String[] args){
    
    //testing Point class
    Point newPoint1 = new Point();
    Point newPoint2 = new Point(3, 5);
    Point newPoint3 = new Point(8, 10);
    //calling the toString method on the newPoint3 object
    System.out.println("The coordinates of this point are: ");
    System.out.println(newPoint3.toString());
    System.out.println();
    
    newPoint3.translate(1, 1);
    System.out.println("The new coordinates of this point are: ");
    System.out.println(newPoint3.toString());
    System.out.println();
    
    
    newPoint1.translate(2, 4);
    newPoint2.translate(10, 12);
    
    
    newPoint1.printTranslate();
    newPoint2.printTranslate();
    newPoint3.printTranslate();
    
    System.out.println(newPoint1.distanceToOrigin());
    System.out.println(newPoint2.distanceToOrigin());
    System.out.println(newPoint3.distanceToOrigin());

    //testing Circle class
    Circle newCircle1 = new Circle(3, 6);
    Circle newCircle2 = new Circle(4, 7, 3);
    
    newCircle1.translate(2, 3);
    newCircle2.translate(4, 5);
    
    newCircle1.tripleTheRadius();
    newCircle2.tripleTheRadius();
    
    System.out.println("Area of the circles:");
    System.out.println(newCircle1.getArea());
    System.out.println(newCircle2.getArea());
    
    System.out.println("Testing isInCircle method:");
    
    System.out.println(newCircle2.isInCircle(10, 2));
    
    System.out.println(newCircle2.isInCircle(5, 6));
    
    System.out.println(newCircle2.radius);
    System.out.println(newCircle2.getX());
    System.out.println(newCircle2.getY());
    
    
    
    
    

}
    
    

    
}
