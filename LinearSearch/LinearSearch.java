
/**
 * Write a description of class LinearSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class LinearSearch
{
    //linear search of an array of books
    public static int theBook (String[] books, String target){

        for (int i = 0; i < books.length; i++){
            if (books[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

//linear search of an ArrayList of books
    public static String theBookList (ArrayList<String> booklist, String target){
        for (int i = 0; i < booklist.size(); i++){
            if(booklist.get(i).equals(target)){
                return "Found!";
            }
        }
        return "Not Found :(";
    }

    
    public static void main(String[] args){
        
        String[] myListBooks = {"Divergent", "Allegient", "Harry Potter", "Animal Farm"};
            
        System.out.println(theBook(myListBooks, "Allegient"));
        
        System.out.println(theBook(myListBooks, "Lord of the Rings"));
        
        ArrayList<String> myOtherList = new ArrayList<String>();
        
        Collections.addAll(myOtherList, "Divergent", "Allegient", "Harry Potter", "Animal Farm");
        
        System.out.println(theBookList(myOtherList, "Allegient"));
        
        System.out.println(theBookList(myOtherList, "Lord of the Rings"));
        
        
        
     
        
    }
}
