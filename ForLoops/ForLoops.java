
/**
 * For Loops practice
 *
 * @author Kirsten Fournier
 * @version December 8, 2020
 */
import java.util.Scanner;

public class ForLoops
{
    //method using a for loop to remove spaces from a string
    public static String removeSpaces(String myString){
    
        String newString = "";
        
        //the for loop starts with an empty string and
        //then builds up the string as it iterates through
        //the loop, with the spaces of myString removed
        for(int i = 0; i < myString.length(); i++){
            String letter = myString.substring(i, i + 1);
            if (!letter.equals(" ")){
                newString = newString + letter;
            } 
        }
        return newString;
    }  
    
    public static void main(String[] args){
        //Write a for loop that will 
        //print the following to the screen: 
        //5, 10, 15, 20, 25, 30
        for (int i = 5; i <= 30; i = i + 5){
            if (i != 30){
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    
      System.out.println();
      
      //Write a program that uses a 
      //for loop to print the following 
      //to the screen: Counting down 
      //10, 9, 8, 7, 6, 5, 4, 3, 2, 1, blastoff! 
        System.out.print("Counting down ");
        
        for (int i = 10; i > 0; i--){
            System.out.print(i + ", ");
        }
        System.out.print("blastoff!");
            
        System.out.println();
        
        //Knowing what we already know 
        //about strings, use a while loop to 
        //remove spaces from a given string.  
        String holiday = "The winter break is almost here";
        
        //want to get the length of the string holiday
        int stringLength = holiday.length();
        
        //if an index of a character = -1 it means
        //it doesn't actually exist in the string!
        while (holiday.indexOf(" ") != -1){
            //by getting the index of the first
            //space encountered, I can then use
            //that value in a substring method later
            int space = (holiday.indexOf(" "));
            String first = holiday.substring(0, space);
            String second = holiday.substring(space + 1);
            //overwriting the original holiday string with
            //the first part of the string minus the first
            //space, plus the remainder of the string.
            //The loops keeps cycling through this process
            //until there are no spaces left
            holiday = first + second;
        }   
        
        //printing out the result of the while loop
        //to remove spaces
        System.out.println(holiday);
        
        //This is where I am testing the for loop method
        //I created to remove spaces
        Scanner testString = new Scanner(System.in);
        System.out.println("What is your string?");
        String theString = testString.nextLine();
        
        System.out.println(removeSpaces(theString));

    }  

}
