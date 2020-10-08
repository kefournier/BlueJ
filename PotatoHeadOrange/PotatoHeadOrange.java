
/**
 * Program to demonstrate classe and objects PotatoHeadOrange
 *
 * @author Mrs. Fournier
 * @version October 6, 2020
 */
public class PotatoHeadOrange
{
    // instance variables 
    private String hat; //declaring instance variables of the PotatoHeadOrange class
    private String eyes; //instance variables define the attributes of your objects
    private int age;
    private String hair; //adding these instance variables for my new objects
    private int height;

    /**
     * Constructor for objects of class PotatoHeadOrange
     */
    public PotatoHeadOrange(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
        
    }
    
    //this is an overloaded constructor
    public PotatoHeadOrange(String hisHair, int hisHeight){
        
        hair = hisHair;
        height = hisHeight;
    }

    public static void main(String[] args){
        
        /**
         * PotatoHeadOrange is like the datatype, and nicholas is the name 
         * of the variable/object. The new is a keyword used by Java to create
         * the new object nicholas of the PotatoHeadOrange class datatype.
         * The attribute values I give my objects MUST correspond to the 
         * constructor parameters.
         */
        PotatoHeadOrange nicholas = new PotatoHeadOrange("baseball", "green", 15);
        PotatoHeadOrange rocky = new PotatoHeadOrange("helmet", "brown", 17);
        
        //creating an object with my overloaded constructor
        PotatoHeadOrange jack = new PotatoHeadOrange("blond", 65);
        
        //this is referred to as "dot notation"
        System.out.println(nicholas.hat);
        System.out.println(rocky.age);
        System.out.println(jack.height);
        
        jack.height = 70;
        System.out.println(jack.height);
    }
}
