
/**
 * Program to demonstrate PotatoHead classes and objects.
 *
 * @author Mrs. Fournier
 * @version October 5, 2020
 */
public class PotatoHeadGreen //our class
{
    // instance variables of the class being declared here
    //The keyword private keeps your instance variables secure
    private String hat;
    private String eyes;
    private int age;
    private int height;
    private String shoes;

    /**
     * Constructor for objects of class PotatoHeadGreen
     */
    public PotatoHeadGreen(String hisHat, String hisEyes, int hisAge)//parameters of the constructor
    {
        // initialise instance variables in order to create objects later
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
        
    }
    
    //Overloaded constructor - use when creating object of the same class
    //with different attributes
    public PotatoHeadGreen(int hisHeight, String hisShoes){
        height = hisHeight; //intializing instance variable with parameter of the constructor
        shoes = hisShoes;
    }
    
    public static void main(String[] args){
        
        PotatoHeadGreen nicholas = new PotatoHeadGreen("baseball", "green", 15);
        PotatoHeadGreen rocky = new PotatoHeadGreen("helmet", "brown", 17);
        
        //use overloaded constructor to create another object
        PotatoHeadGreen jack = new PotatoHeadGreen(65, "sneakers");
        
        System.out.println(nicholas.hat);
        System.out.println(rocky.age);
        System.out.println(jack.shoes);
    }
}
