/**
 * Program to demonstrate classes, objects, and methods 
 *
 * @author Mrs. Fournier
 * @version October 14, 2020
 */
public class PotatoHeadMethods
{
    //declaring the instance variables of the PotatoHeadMethods class
    private String hat; 
    private String eyes;
    private int age;
    private String hair;
    private int height;

    /**
     * Constructor for objects of class PotatoHeadMethods
     */
    public PotatoHeadMethods(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
    }
    
   
    //my overloaded constructor
    public PotatoHeadMethods(String hisHair, int hisHeight){
        
        hair = hisHair;
        height = hisHeight;
        
    }
    
    //Method to add three ages together and average them
    //Notice that my method signature uses double, which 
    //means my method has to return a double value
    public static double averageTheirAges(int age1, int age2, int age3){
        
        double totalAge = (double)(age1 + age2 + age3)/3;
        return totalAge;
        
    }
    
    public int getAge(){
        return age;
    }
    
   
    public int setAge(){
        int personAge = getAge();
        personAge++;
        return personAge;
    }
    

}