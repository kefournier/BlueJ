
/**
 * ExamplesArrayLists 
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Collections;

public class ExamplesArrayLists
{
   public static void main(String[] args){
       
       ArrayList<String> myList = new ArrayList<String>();
       
       myList.add("Archita");
       myList.add("Gurleen");
       myList.add("Nathan");
       
       System.out.println(myList);
       
       myList.add(1, "Shishir");
       System.out.println(myList);
       
       myList.set(2, "Tobin");
       System.out.println(myList);
       
       System.out.println(myList.get(3));
       
       myList.remove(1);
       System.out.println(myList);
       
       Collections.addAll(myList, "Alexa", "Aidan", "Kush");
       System.out.println(myList);
       
       System.out.println("The size of my list is : " + myList.size());
       
       for(int i = 0; i < myList.size(); i++){
           System.out.println(myList.get(i));
        }
        
       System.out.println();
        
       for(String name: myList){
           System.out.println(name);
        }
       
}
}
