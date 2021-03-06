
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
    
    //this method does not return a value because of the 
    //word void in the method signature
    public static void objectFriends(){
        System.out.println("My objects are all friends!");
    }
    
    //Method to add three ages together and average them
    //Notice that my method signature uses double, which 
    //means my method has to return a double value
    public static double addTheirAges(int age1, int age2, int age3){
        
        double totalAge = (double)(age1 + age2 + age3)/3;
        return totalAge;
        
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
        PotatoHead eddie = new PotatoHead("top hat", "blue", 14);
        
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
        System.out.println(jack.height);
        
        //using the addTheirAges method to add their ages, using dot notation
        System.out.println(addTheirAges(rocky.age, nicholas.age, eddie.age));
        
        //I ran the addTheirAges method again, but this time I 
        //used System.out.printf to limit the decimal places of
        //the answer to just 2 spots.
        System.out.printf("%.2f", addTheirAges(rocky.age, nicholas.age, eddie.age));
        
       
        
        //calling my objectFriends method
        objectFriends();
    }
}
