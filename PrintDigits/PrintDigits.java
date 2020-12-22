
/**
 * PrintDigits here
 *
 * @author Mrs. Fournier
 * @version December
 */

import java.util.Scanner;

public class PrintDigits
{
    public static void PrintTwoDigits(int n){
        for (int i = 1; i <= n; i++){
            int randomNumber = (int)(Math.random()*10)+10;
            System.out.println(randomNumber);
            
            if (randomNumber != 13){
                System.out.println("Thirteen was not found!");
            } else {
                System.out.println("Thirteen found!");
            }
    }
}
    
    public static void main (String[] args){
        
        Scanner myNumber = new Scanner(System.in);
        
        System.out.println("How many numbers should I print? ");
        int userNumber = myNumber.nextInt();
        
        PrintTwoDigits(userNumber);
    }
}



//Write a static method named 
//printTwoDigits that accepts 
//an integer n as a parameter 
//and that prints a series of 
//n randomly generated numbers. 
//The method should use Math.random() 
//to select numbers in the range 
//of 10 to 19 inclusive where each 
//number is equally likely to be 
//chosen.  

//After displaying each number, 
//the method should indicate 
//whether the number 13 has 
//appeared ("The number 13 was found!") 
//or not ("The number 13 was not found.").  
//You may assume that the value of 
//n passed is at least 0. 

