
/**
 * Sample program using the Double wrapper class
 *
 * Mrs. Fournier
 * @version November 6, 2020
 */
public class WrapperDouble
{
   public static void main (String[] args){
       Double score1 = new Double(89.45); //creating new object
       System.out.println("Score1: " + score1); //displaying object
       Double score2 = new Double(92.38);
       Double score3 = new Double(101.0);
       Double meanScore = (score1 + score2 + score3) / 3;
       System.out.println("Double meanScore: " + meanScore);
       
       //can do it this way too! creating a primitive
       //variable to hold the value of the meanScore 
       //object - this is an example of auto-unboxing
       //occurring
       double mean2 = meanScore.doubleValue(); //double method
       System.out.println("double mean2: " + mean2); //display result
    }
}
