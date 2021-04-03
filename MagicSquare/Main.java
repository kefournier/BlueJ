
/**
 * Main class for MagicSquare
 *
 * @author Mrs. Fournier
 * @version March 30, 2021
 */
import java.util.Arrays;

public class Main
{
    public static void main(String[] args){
        
        //creating a 2D array of our MagicSquare values
        int[][] magicSquare = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}}; 
        
        //creating an instance/object of the MagicSquare class
        //so we can call our methods - we are constructing the 
        //object with the magicSquare 2D array we created above
        MagicSquare testArray = new MagicSquare(magicSquare);
        
        System.out.println(testArray.rowSum(1));
        System.out.println(testArray.colSum(2));
        System.out.println(testArray.diagSums(34));
        
        //this not working?
        System.out.println(testArray.exactlyOnce());
    }
}
