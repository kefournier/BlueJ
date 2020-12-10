
/**
 * GuessingGame program
 *
 * @author Mrs. Fournier
 * @version November 20, 2020
 */

import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args){
        
        int computerNumber = (int)(Math.random() * 100) + 1;
        
        Scanner guess = new Scanner(System.in);
        System.out.println("What is your guess?");
        int userGuess = guess.nextInt();
        
        while(userGuess != computerNumber){
            if(userGuess > computerNumber){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Too low!");
            }
            System.out.println("What is your guess?");
            userGuess = guess.nextInt();
                
                if (userGuess == computerNumber){
                    System.out.println("You got it!");
        }
    }   
}   
}
