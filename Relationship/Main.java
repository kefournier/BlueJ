
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        
        Kid nell = new Kid("Jon");
        Kid arlo = new Kid("Kirsten");
        Kid madeleine1 = new Kid("Kirsten");
        Kid madeleine2 = madeleine1;
        
        //static method so have to reference the class
        //with dot notation
        Kid.determineRelationship(nell, arlo);
        Kid.determineRelationship(arlo, madeleine1);
        
        System.out.println();
        Kid.determineRelationship(madeleine1, madeleine2);
    }
    
     
}
