/**
 * ArrayListExamples
 *
 * @author Mrs. Fournier
 * @version March 1, 2021
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples
{

  //write a method smallest that returns the smallest
  //value in an ArrayList
  public static int smallest(ArrayList<Integer> list){
  int smallest = list.get(0);
  
  for(int item: list){
      if (item < smallest){
          smallest = item;
      
        }
    }
    return smallest;
}

public static String longest(ArrayList<String> words){
    //get the length of the first word in the list
    int longestWord = words.get(0).length();
    //create an empty string
    String otherWord = "";
    
    for(int i = 0; i < words.size(); i++){
        //if the current longestWord is less
        //than the length of the word at the next
        //index then update the longestWord to be
        //that one
        if(longestWord < words.get(i).length()){
            //update longest word length with the new longest word
            longestWord = words.get(i).length();
            //store the longest work found in otherWord
            otherWord = words.get(i);
        }
    }
    return otherWord;
 
}

//method to remove all occurrences of an integer from a list
//and then return the remaining list
public static ArrayList<Integer> remove(ArrayList<Integer> list, int x){
    
    for(int i = 0; i < list.size(); i++){
        if(list.get(i) == x){
            list.remove(i);
            //I need this i-- because every time I remove a number, the list
            //shifts to the left
            i--;
        }
    }
    return list;
}

  
  public static void main(String[] args) {
      
    ArrayList<Integer> numberRemove = new ArrayList<Integer>();
    Collections.addAll(numberRemove, 8, 8, 7, 4, 3, 3, 2, 1);
    System.out.println(numberRemove);
    
    System.out.println();
    
    remove(numberRemove, 3);
    System.out.println(numberRemove);
    
    System.out.println();
    
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    
    Collections.addAll(numberList, 7, 5, 6, 3, 1, 2);
    System.out.println(numberList);
    System.out.println(smallest(numberList));
      
    ArrayList<String> myList = new ArrayList<String>();
    
    myList.add("Archita");
    myList.add("Gurleen");
    myList.add("Nathan");

    System.out.println(myList);
    
    myList.add(1, "Shishir");
    System.out.println(myList);
    
    myList.set(2, "Tobin");
    System.out.println(myList);
    
    //testing longest method
    System.out.println(longest(myList));
    
    myList.get(3);
    
    myList.remove(1);
    System.out.println(myList);
    
    System.out.println();
    System.out.println();
    
    //classes example
    //creating an ArrayList
    ArrayList<String> myClasses = new ArrayList<String>();
    
    //adding my current classes to the list
    myClasses.add("AP CSA");
    myClasses.add("AP CSP");
    myClasses.add("Intro to CS");
    //printing out the contents of the list
    System.out.println(myClasses);
    
    //adding 4 more classes to my list
    myClasses.add("Web Design");
    myClasses.add("Data Viz");
    myClasses.add("Adobe Illustrator");
    myClasses.add("JavaScript");
    //printing out updated list
    System.out.println(myClasses);
    
    System.out.println(myClasses);
    //not tested on AP Exam but an easy way to 
    //add multiple items to a list at once
    //Need to import the Collections class to do it
    Collections.addAll(myClasses, "Data Science", "CSS");;
    System.out.println(myClasses);
    
    //printing out class at index 6
    System.out.println(myClasses.get(6));
    //overwriting class at index 6 with a new class name
    myClasses.set(6, "Python");
    //printing out updated contents of list
    System.out.println(myClasses);
    //replacing class at index 1 with a new class
    myClasses.set(1, "SQL");
    //removing class at index 3
    myClasses.remove(3);
    //printing out updated contents of list
    System.out.println(myClasses);
    //printing out the size of the list
    System.out.println("The size of my list is: " + myClasses.size());
    
    System.out.println();
    System.out.println();
    
    //if I wanted to traverse my current arraylist
    for(int i = 0; i < myClasses.size(); i++){
        System.out.println(myClasses.get(i));
    }
    
    System.out.println();
    System.out.println();
    
    //could also use a for each loop to traverse the list
    for(String className: myClasses){
        System.out.println(className);
    }
    
    
    System.out.println();
    System.out.println();
    //removing all plurals from an arraylist
    
    ArrayList<String> myPlurals = new ArrayList<String>();
    
    Collections.addAll(myPlurals, "books", "shoes", "cookies", "games", "hat", "pizza");
    
    System.out.println(myPlurals);
    
    //does this work to remove all plurals?
    for(int i = 0; i < myPlurals.size(); i++){
        String word = myPlurals.get(i);
        if(word.substring(word.length() - 1).equals("s")){
            myPlurals.remove(i);
        }
    }
    
    System.out.println(myPlurals);
    
    //how about this...will this work?
    for(int i = 0; i < myPlurals.size(); i++){
        String word = myPlurals.get(i);
        if(word.substring(word.length() - 1).equals("s")){
            myPlurals.remove(i);
            //need to add decrementer because
            //everytime you remove one the list
            //shifts to the left  
            i--;
        }
    }
    
    System.out.println(myPlurals);
    
    System.out.println();
    System.out.println();
    
    //could do this too!
    for(int i = myPlurals.size() - 1; i >= 0; i--){
        String word = myPlurals.get(i);
        if(word.substring(word.length() - 1).equals("s")){
            myPlurals.remove(i);
            //don't need a decrementer here
            //because you are picking words off from
            //the end
        }
    }
    System.out.println(myPlurals);
      
}
}

