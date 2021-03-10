
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch{

    public static int moreBooks(String[] books, String target){
        
        int left = 0;
        int right = books.length - 1; //end of list
        
        while(left <= right){ //while left is less than or equal to right
            
            int middle = (left + right)/2;
            
            if(target.compareTo(books[middle]) < 0){ //if target is alphabetically before word at middle
                
                //reset the right to be one less than the middle, getting rid of half the list
                right = middle - 1;
            }
            else if (target.compareTo(books[middle]) > 0){
                
                left = middle + 1; 
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    
    
    //for ArrayLists
    public static int evenMoreBooks(ArrayList<String> books, String target){
        
        int left = 0;
        int right = books.size() - 1; //end of list
        
        while(left <= right){ //while left is less than or equal to right
            
            int middle = (left + right)/2;
            
            if(target.compareTo(books.get(middle)) < 0){ //if target is alphabetically before word at middle
                
                //reset the right to be one less than the middle, getting rid of half the list
                right = middle - 1;
            }
            else if (target.compareTo(books.get(middle)) > 0){
                
                left = middle + 1; 
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        
        String[] myBooks = {"Allegiant", "Animal Farm", "Anne of Green Gables", "Divergent", "Harry Potter", "Little Women", "The Phantom Tollbooth"};
        
        System.out.println(moreBooks(myBooks, "Lord of the Rings"));
        
        System.out.println(moreBooks(myBooks, "Divergent"));
        
        System.out.println();
        System.out.println();
        
        ArrayList<String> myListBooks = new ArrayList<String>();
        
        Collections.addAll(myListBooks, "Allegiant", "Animal Farm", "Anne of Green Gables", "Divergent", "Harry Potter", "Little Women", "The Phantom Tollbooth");
        
        System.out.println(evenMoreBooks(myListBooks, "Lord of the Rings"));
        
        System.out.println(evenMoreBooks(myListBooks, "Divergent"));  
        
    }
}
        
        
    