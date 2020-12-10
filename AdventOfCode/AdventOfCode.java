
/**
 * AdventOfCode 2020
 *
 * @author Mrs. Fournier
 * @version December 3, 2020
 */

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays; 

public class AdventOfCode
{
    public static void main(String[] args) {
        //create new object of the file class
        //be sure to save that text file in your project folder
        File myObj = new File("input.txt");
    
        //The try statement allows you to define 
        //a block of code to be tested for errors 
        //while it is being executed

        //The catch statement allows you to define 
        //a block of code to be executed, if an error 
        //occurs in the try block. Kind of like a built-in
        //debugger
        
        try{ 
            Scanner puzzleInput = new Scanner(myObj);
            //hasNextLine() method returns true if there 
            //is another line in the input of this scanner
            while (puzzleInput.hasNextLine()) {
                //creating a string object to hold the contents
                //of the puzzleInput file
                String data = puzzleInput.nextLine();
                //printing out the content of the puzzleInput file
                //I did this to check and make sure the file imported
                System.out.println(data);
            }
            //closing the Scanne
            puzzleInput.close();
            
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
        
        //use a while loop here to interate through 
        //while file? And see which numbers add to 2020
        
        //how to get contents of file into and array
        int fileData[] = new int[500];
       
        try {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        
        
        //initialize index counter
        int i = 0;
        while (scanner.hasNextInt()) {                
            fileData[i] = scanner.nextInt();
            i++;
        }
        //added some print statements to make
        //sure my array actually populated
        System.out.println("First line:"+ fileData[0]);
        System.out.println("Second line:"+ fileData[1]);
        //closing the scanner
        scanner.close();
      
      //error message that will print if 
      //input file not found
    } catch (FileNotFoundException error) {
        error.printStackTrace();
    }   
    
    int length = fileData.length;
    int product = 0;
    //this is where I will want to program
    //some nested loops to work through the list
    for(int i = 0; i < length - 2; i++){
        
        for (int j = i + 1; j < length - 1; j++){
            
            for (int k = j + 1; k < length; k++){
            
                //if (fileData[i] + fileData[j] == 2020){
                if (fileData[i] + fileData[j] + fileData[k] == 2020){
                
                    //product = fileData[i] * fileData[j];
                    product = fileData[i] * fileData[j] * fileData[k];
                }
            }
        }
    }
    System.out.println(product);
        
    
}
}

/* 
Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.

For example, suppose your expense report contained the following:

1721
979
366
299
675
1456
In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.

Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?
*/
