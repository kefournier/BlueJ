
/**
 * ArrayListExamplesOrange 
 *
 * @author Mrs. Fournier
 * @version March 2, 2021
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListExamplesOrange
{
    public static void main(String[] args){
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Zach");
        myList.add("Tora");
        myList.add("Srikar");
        
        System.out.println(myList);
        
        Collections.addAll(myList, "Frank", "Joel", "Tanisha");
        System.out.println(myList);
        
        myList.add(1, "Vasishta");
        System.out.println(myList);
        
        myList.set(2, "Anshu");
        myList.set(3, "Anshu");
        System.out.println(myList);
        
        System.out.println(myList.get(3));
        
        myList.remove(5);
        System.out.println(myList);
        
        //myList.removeAll(myList);
        System.out.println(myList);
        
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        
        System.out.println();
        
        for(String name: myList){
            System.out.println(name);
        }
        
        System.out.println();
        ArrayList<String> myPlurals = new ArrayList<String>();
        Collections.addAll(myPlurals, "books", "shoes", "cookies", "games", "hat", "pizza");
        
        System.out.println(myPlurals);
        
        for(int i = 0; i < myPlurals.size(); i++){
            String word = myPlurals.get(i);
            if(word.substring(word.length() - 1).equals("s")){
                myPlurals.remove(i);
                i--;
            }
        }
        
        System.out.println(myPlurals);
        
        for(int i = myPlurals.size() - 1; i >= 0; i--){
            String word = myPlurals.get(i);
            if(word.substring(word.length() - 1).equals("s")){
                myPlurals.remove(i);
            }
        }
        
        System.out.println(myPlurals);
        
        
        
    }
        
    
}
