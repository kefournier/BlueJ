
/**
 * Loops example
 *
 * @author Mrs. Fournier
 * @version November 20, 2020
 */

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args){
    
        Scanner loopValue = new Scanner(System.in);
        System.out.println("Please enter the value of n: ");
        
        int userValue = loopValue.nextInt();

        for(int i = 1; i <= userValue; i ++)  // outer loop
        {
            for(int j = 1; j <= 5; j++)  // inner loop
            {
                System.out.print(i * j); // printing the value.
            }
       System.out.println();
    }
    
   }  
}
