
/**
 * Example of Scanner class use here.
 *
 * @author Mrs. Fournier
 * @version October 19, 2020
 */
//Importing the Scanner class
import java.util.Scanner;  

public class ScannerExample {
  public static void main(String[] args) {
    //Creating a Scanner object
    //System.in means to take input from the keyboard or user
    Scanner userName = new Scanner(System.in);  
    
    //Giving user a prompt to respond to
    System.out.println("Please enter your name: ");
    
    //Reading user input
    String name = userName.nextLine(); 
    
    
    //how can I just extract their first name
    Scanner firstName = new Scanner(System.in);  
    System.out.println("Please enter your name again: ");
    String first = firstName.next();
  

    Scanner userAge = new Scanner(System.in);
    System.out.println("What is your age? ");
  
    //getting user input of the integer type
    int age = userAge.nextInt();

    //after you are done using the Scanner class don't forget to close it out
    userAge.close();

    System.out.println("Hello, " + name); 
    System.out.println("Hello again, " + first);
    System.out.println("You are " + age + " years old"); 
  }
}