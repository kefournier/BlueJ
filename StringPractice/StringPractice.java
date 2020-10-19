
/**
 * Program to practice working with Strings 
 *
 * @author Mrs. Fournier
 * @version October 17, 2020
 */

import java.util.Scanner;  // Import the Scanner class

public class StringPractice
{
    //method to get last 4 digits of credit card
    public static String last4(String creditCard){
        
        String last4digits = creditCard.substring(15);
        return last4digits;
    }
    
    //method to get last 5 digits of credit card
    //be aware of needing to skip over the space!
    public static String last5(String creditCard){
        
        String last5digits = creditCard.substring(13,14) + creditCard.substring(15);
        return last5digits;
    }
    
    //method to take a string, chop off the first
    //letter, and add it to the end
    public static String scroll(String userString){
        
        String newString = userString.substring(1) + userString.substring(0,1);
        return newString;
    }
    
    public static String convertName(String userName){
    
    //calling the built in Java trim method
    //just in case the user used any trailing
    //white spaces when they entered their string    
    String newName = userName.trim();
    //easiest to find the index of the comma first
    //because then you know where the separation is
    //between the last and first names
    int findComma = newName.indexOf(",");
    //now you can use the substring method to get
    //at the first name. Start the substring at 
    //the index that is one past the comma.
    //Then add a space after it before you tack
    //on the last name which will have started
    //at index 0 and gone up until the comma.
    String newString = newName.substring(findComma + 1) + " " + newName.substring(0, findComma);
    
    return newString;
   
    }
    
    public static void main(String[] args){
    
        String ccNumber = "4111 1111 1111 1111";
        
        //doing without a method
        String last4 = ccNumber.substring(15);
        System.out.println(last4);
        
        //another way you could do it by using a method
        System.out.println(last4(ccNumber));
        
        //doing without a method
        String last5 = ccNumber.substring(13,14) + ccNumber.substring(15);
        System.out.println(last5);
        
        //another way you could do it by using a method
        System.out.println(last5(ccNumber));
        
        //The Scanner class lets us get user input!
        Scanner userCC = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your credit card number: ");
        String userCreditCard = userCC.nextLine();// Read user input
        
        //closing Scanner
        userCC.close(); 
        
        System.out.println(last4(userCreditCard));
        System.out.println(last5(userCreditCard));
        
        //The Scanner class lets us get user input!
        Scanner userStringInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your string: ");
        String userText = userStringInput.nextLine();// Read user input
        
        //closing Scanner
        userStringInput.close();
        
        System.out.println(scroll(userText));
        
        Scanner userName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your last name, first name: ");
        String userNameInput = userName.nextLine();// Read user input
        
        System.out.println(convertName(userNameInput));
    }
   
}
