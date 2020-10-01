import java.util.Scanner;  // Import the Scanner class

/**
 * Write a description of class RockPaper here.
 *
 * This is a simple Rock, Paper, Scissors program.
 * For their summer assignment, the AP CSA class
 * wrote a Rock, Paper, Scissors program in C.
 * 
 * @author Kirsten Fournier
 * @version 8/18/20
 */
public class RockPaper
{
 
    public static void main(String [] args){
    
    int userRPSValue = 0;
    
    Scanner userChoice = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Do you choose rock, paper, or scissors? ");

    String userRPS = userChoice.nextLine();  // Read user input
    
    String userRPSLowerCase = userRPS.toLowerCase();
    
    //converting user string input to numeric value
    if (userRPSLowerCase.equals("rock")){
        userRPSValue = 1;
    }
    else if (userRPSLowerCase.equals("paper")){
        userRPSValue = 2;
    }
    else {
        userRPSValue = 3;
    }
    
    //range = (max-min) + 1, using Math.random class to create computer choice
    int compChoice = (int)(Math.random() * 3) + 1; 
    
    String computerChoice = "";
    
    if (compChoice == 1){
        computerChoice = "rock";
        System.out.println("The computer chose rock!");
    }
    else if (compChoice == 2){
        computerChoice = "paper";
        System.out.println("The computer chose paper!");
    }
    else {
        computerChoice = "scissors";
        System.out.println("The computer chose scissors!");
    }
    
    
    //here is where you now have to compare the user's choice 
    //with the computer's choice
    
    if (userRPSValue == 1 && compChoice == 3){
        System.out.println("You won! Rock crushes scissors!\n");
    }
    else if (userRPSValue == 1 && compChoice == 2){
        System.out.println("The computer outsmarted you...paper covers rock.\n");
    }
    else if (userRPSValue == 2 && compChoice == 1){
        System.out.println("You won! Paper covers rock!\n");
    }
    else if (userRPSValue == 2 && compChoice == 3){
        System.out.println("The computer outsmarted you...scissors cuts paper.\n");
    }
    else if (userRPSValue == 3 && compChoice == 1){
        System.out.println("The computer outsmarted you...rock crushes scissors.\n");
    }
    else if (userRPSValue == 3 && compChoice == 2){
        System.out.println("You won! Scissors cuts paper!\n");
    }
    else {
        System.out.println("It's a draw! Play again?\n");
    }
        
}
}
