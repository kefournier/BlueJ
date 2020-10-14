/**
 * Adding a class to my PotatoHead project
 * to demonstrate use of getter and setter methods
 * (otherwise known as accessor and mutator methods)
 *
 * @author Mrs. Fournier
 * @version October 14, 2020
 */
public class Main
{
  
    public static void main(String[] args){
        
        //Creating objects of the PotatoHead class datatype
        //Think of the class name as your datatype (like an int, double, or string, etc.)
        //Use the "new" keyword to call the constructor and initialize the object
        //Note, the order of your attributes must correspond to the 
        //order of parameters in your constructor
        PotatoHeadMethods nicholas = new PotatoHeadMethods("baseball", "green", 15);
        PotatoHeadMethods rocky = new PotatoHeadMethods("helmet", "brown", 17);
        PotatoHeadMethods eddie = new PotatoHeadMethods("top hat", "blue", 14);
        
        //another object created using the overloaded constructor
        //Notice the different number of attributes
        PotatoHeadMethods jack = new PotatoHeadMethods("blond", 65);
        
        /**
         * getter and setter methods (also called accessor
         * and mutator methods) must be used to get at 
         * private instance variables, when not in the 
         * enclosing class
         */
        
        int nicholasAge = nicholas.getAge(); //gets nicholas's age
        int rockyAge = rocky.getAge(); //gets rocky's age
        int eddieAge = eddie.getAge(); //gets eddie's age
        
        //Using my getter method to get rocky's age
        System.out.println(rockyAge);
        
        //Using my setter method to increase rocky's age
        //But not storing in a variable, so his age increments
        //for this print statement only
        System.out.println(rocky.setAge());
        
        //creating a new variable to hold the result of calling the 
        //averageTheirAges method of the PotatoHeadMethods class. Since is
        //is a static method, I have to use dot notation and the class
        //name to call the method
        double ageAverage = PotatoHeadMethods.averageTheirAges(rockyAge, nicholasAge, eddieAge);
        
        System.out.println(ageAverage);
        
        //instead of creating an extra variable, can also just use a 
        //System.out.println statement to call the averageTheirAges
        //method of the PotatoHeadMethods class on objects of the class.
        //Notice that I had to use the getAge() method with each
        //of the objects since the PotatoHeadMethods class and instance
        //variable declarations are in a different file
        //I also used printf to limit the decimal places (just like in C!)
        System.out.printf("%.2f", PotatoHeadMethods.averageTheirAges(rocky.getAge(), nicholas.getAge(), eddie.getAge()));
        
        
    }
}



