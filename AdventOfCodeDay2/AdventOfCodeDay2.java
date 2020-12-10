
/**
 * AdventOfCode Day 2 Puzzles
 *
 * @author Kirsten Fournier
 * @version December 3, 2020
 */

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.util.BufferedInputStream;
//import java.util.FileInputStream;
import java.util.ArrayList;
import java.lang.String;


public class AdventOfCodeDay2
{
    public static void main(String[] args) {
        //create new object of the file class
        //be sure to save that text file in your project folder
        File myObj = new File("input2.txt");
    
        //The try statement allows you to define 
        //a block of code to be tested for errors 
        //while it is being executed

        //The catch statement allows you to define 
        //a block of code to be executed, if an error 
        //occurs in the try block. Kind of like a built-in
        //debugger
        
        try{ 
            Scanner puzzle2Input = new Scanner(myObj);
            //hasNextLine() method returns true if there 
            //is another line in the input of this scanner
            while (puzzle2Input.hasNextLine()) {
                //creating a string object to hold the contents
                //of the puzzleInput file
                String data = puzzle2Input.nextLine();
                //printing out the content of the puzzleInput file
                //I did this to check and make sure the file imported
                System.out.println(data);
            }
            //closing the Scanne
            puzzle2Input.close();
            
        //Signals that an attempt to open the file 
        //referenced by a specified pathname has failed
            } catch (FileNotFoundException error) { //creating object "error" of the FileNotFoundException class
            System.out.println("An error occurred.");
            //calling the printStackTrace method on the 
            //FileNotFoundException object
            error.printStackTrace();
            //printStackTrace() method in Java is a tool 
            //used to handle exceptions and errors. It is 
            //a method of Java’s throwable class which prints 
            //the throwable along with other details like the 
            //line number and class name where the exception 
            //occurred
        }
        
        ArrayList<String> contents = new ArrayList<String>();
        
        try {
        File file = new File("input2.txt");
        Scanner scanner = new Scanner(file);
        
        //initialize index counter
        int i = 0;
        while (scanner.hasNextLine()) {                
            contents.add(scanner.nextLine()); 
            i++;
        }
        
        //added some print statements to make
        //sure my array actually populated
        System.out.println("First line:"+ contents.get(0));
        System.out.println("Second line:"+ contents.get(1));
        //closing the scanner
        scanner.close();
        //error message that will print if 
        //input file not found
      } catch (FileNotFoundException error) {
        error.printStackTrace();
      }   
           
      //Next extract the numbers to the right and 
      //left of the "-" can use charAt maybe to
      //determine lower and upper range of letter 
      //occuring. But have to treat these as integers
      //not strings. parseInt maybe? Could use substring
      //to isolate the characters to parse?
      int countValid = 0;
      boolean validPassword;
            
      for (int i = 0; i < contents.size() - 1; i++){
          String currentLine = contents.get(i);
          String lowerRange = currentLine.substring(0, 1);
          int lower = Integer.parseInt(lowerRange);
          
          int indexHyphen = currentLine.indexOf("-");
          String higherRange = currentLine.substring(indexHyphen + 1, indexHyphen + 2);
          //String higherRange = contents.get(i).substring(indexHyphen, indexHyphen + 1);
          int higher = Integer.parseInt(higherRange);
          
          int colon = currentLine.indexOf(":");
          
          String letter = currentLine.substring(colon - 1, colon);
          
          String longString = currentLine.substring(colon + 2);
          
          //maybe comment out all beneath this text and 
          //also add some System.out.println statements to
          //help debug?
          
          for (int j = 0; j < longString.length() - 1; j++);
          
          int countLetter = 0;
          
          
          if (longString.indexOf(letter) == -1){
              System.out.println("Letter not found.");
            }
            //should this just be the else condition?
          if (longString.substring(i, i + 1) == letter){
              countLetter++;
            }
            
            
            if (countLetter < lower || countLetter > higher){
                validPassword = false;
            }
            else {
                validPassword = true;
                countValid++;
            }
               
        }
        System.out.println("There are " + countValid + " passwords in the file.");
          //another for loop here to iterate through the 
          //long string looking for a particular character?
          //if a letter isn't there, won't it return - 1?
          //so could use an if condition and a counter variable
          //to track how many times the letter appears in the 
          //string and if that count is within range
          
      //The character before the : is the letter 
      //you are looking at. Use charAt and the colon?
      
      //then could treat remaining letters as their own string
      //index through each letter maining a running
      //count the number of times the letter occurs
      //then could have a Boolean value that flips to true
      //or false depending on criteria?
      
      //keep a running count of those passwords
      //that are true
    }
}
