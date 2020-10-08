/**
 * Adding a class to my PotatoHead project
 * to demonstrate use of getter methods
 * (otherwise known as accessor methods) here.
 *
 * @author Mrs. Fournier
 * @version October 8, 2020
 */
public class MoreAges
{
  
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
        //System.out.println(nicholas.hat);
        System.out.println(rocky.getAge());
        //System.out.println(jack.height);
        
        //System.out.println(rocky.setAge());
        //int rockyAge = rocky.getAge();
        //int nicholasAge = nicholas.getAge();
        //int eddieAge = eddie.getAge();
        
        //using dot notation to update the value of jack's height
        //jack.height = 70;
        
        //printing the new value of Jack's height
        //System.out.println(jack.height);
        
        //trying to use a method to add their ages, using dot notation
          //System.out.println(averageTheirAges(rockyAge, nicholasAge, eddieAge));
        
        //I ran the addTheirAges method again, but this time I 
        //used System.out.printf to limit the decimal places of
        //the answer to just 2 spots.
        //System.out.printf("%.2f", averageTheirAges(rocky.getAge(), nicholas.getAge(), eddie.getAge()));
        
    }
}



