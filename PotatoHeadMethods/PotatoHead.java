/**
 * Program to demonstrate classes and objects 
 *
 * @author Mrs. Fournier
 * @version October 6, 2020
 */
public class PotatoHead
{
    // instance variables 
    private String hat; //declaring the instance variables of the PotatoHead class
    private String eyes;
    private int age;
    private String hair;
    private int height;

    /**
     * Constructor for objects of class PotatoHead
     */
    public PotatoHead(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
    }
    
   
    //my overloaded constructor
    public PotatoHead(String hisHair, int hisHeight){
        
        hair = hisHair;
        height = hisHeight;
        
    }
    
    //Method to add three ages together and average them
    //Notice that my method signature uses double, which 
    //means my method has to return a double value
    public double averageTheirAges(int age1, int age2, int age3){
        
        double totalAge = (double)(age1 + age2 + age3)/3;
        return totalAge;
        
    }
    
    public int getAge(){
        return age;
    }
    
    /**
     * This is not working!!!
     */
    /*
    public int setAge(){
        int personAge = age++;
        
        return personAge;
    }
*/

}