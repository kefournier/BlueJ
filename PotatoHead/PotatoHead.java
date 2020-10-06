
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

    public static void main(String[] args){
        
        //Creating object of the PotatoHead class datatype
        //Think of the class name as your datatype (like an int, double, or string, etc.)
        //Use the "new" keyword to call the constructor and initialize the object
        //Note, the order of your attributes must correspond to the 
        //order of parameters in your constructor
        PotatoHead nicholas = new PotatoHead("baseball", "green", 15);
        PotatoHead rocky = new PotatoHead("helmet", "brown", 17);
        
        //another object created using the overloaded constructor
        //Notice the different number of attributes
        PotatoHead jack = new PotatoHead("blond", 65);
        
        //this is referred to as dot notation
        System.out.println(nicholas.hat);
        System.out.println(rocky.age);
        System.out.println(jack.height);
        
        //using dot notation to update the value of jack's height
        jack.height = 70;
        
        //printing the new value of Jack's height
        System.out.print(jack.height);
    }
}
