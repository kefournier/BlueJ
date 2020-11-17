
/**
 * FRQ Practice Units 1 & 2: Thing Snack
 *
 * @author Mrs. Fournier
 * @version October 27, 2020
 */
public class Thing extends Main
{
    // instance variables - replace the example below with your own
    private String name;
    
    public Thing(String myName){
        name = myName;
    }
    
    public String getName(){
        return name;
    }
    
    public String setName(String newName){
        name = newName;
        return name;
    }
    
    public static String printMessage(){
        String message = " is great.";
        return message;
    }
    
    /*
    //Part C
    public static String characters(String snack){
        String characters = snack.substring(2, 6);
        return characters;
    }
    */

    public String characters(String snack){
        String characters = snack.substring(2, 6);
        return characters;
    }
    
}
