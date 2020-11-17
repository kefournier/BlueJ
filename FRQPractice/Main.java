
/**
 * Main class for FRQ Practice
 *
 * @author Mrs. Fournier
 * @version October 27, 2020
 */
public class Main
{
    public static void main(String[] args){
        
        //Part A
        Thing snack = new Thing("potato chips");
        
        //Part B
        Thing favFood = new Thing("pizza");
        System.out.println(favFood.getName() + Thing.printMessage());
        
        //Testing Part C
        //System.out.println(Thing.characters(snack.getName()));
        System.out.println(snack.characters(snack.getName()));
        //Testing Part D
        //String newSnack = Thing.characters(snack.getName()) + " " + "skins";
        String newSnack = snack.characters(snack.getName()) + " " + "skins";
        System.out.println(newSnack);
    }
}
