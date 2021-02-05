
/**
 * Write a description of class UnitTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;

public class UnitTest
{
    // instance variables 
    private String[] answerKey = {"B","D","C","A","E","A","B","A","E","B","B","E","E","D","D","A","C","C","A","E"};
    private String[] studentAns;
    
    public UnitTest(String[] studentResponse){
        studentAns = new String[studentResponse.length];
        for(int i = 0; i < studentResponse.length; i++){
            studentAns[i] = studentResponse[i].toUpperCase();
        }
    }
    
    public String[] getStudentAns(){
        return studentAns;
    }
    
    public int totalCorrect(){
        int count = 0;
        for(int i = 0; i < answerKey.length; i++){
            if(answerKey[i].equals(studentAns[i])){
                count++;
            }
        }
        return count;
    }
    
    public int totalMistakes(){
        int count = 0;
        for(int i = 0; i < answerKey.length; i++){
            if(!answerKey[i].equals(studentAns[i])){
                count++;
            }
        }
        return count;
    }
    
    public boolean isPassing(){
        if (totalCorrect() >= 14){
            return true;
        }
        return false;
    }
    
    public String toString(){
        String output = "ANSWER KEY\tStudent's Answers";
        String restOutput = "";
        
        for(int i = 0; i < answerKey.length; i++){
            restOutput = restOutput + (i + 1) + ")"+ answerKey[i] + "\t\t" + (i + 1) + ")" + studentAns[i] + "\n";    
        }
        return output + "\n" + restOutput;
    }
    
    
    public static void main(String[] args){
        String[] answerArray = new String[20];
        
        Scanner userAnswers = new Scanner(System.in);
        
        for(int i = 0; i < 20; i++){
            System.out.println("Enter your answer for question " + (i + 1) + ":");
            answerArray[i] = userAnswers.nextLine();
        }
    
        UnitTest u = new UnitTest(answerArray);
        System.out.println(u);
        
        System.out.println("Number of Correct Answers: " + u.totalCorrect());
        System.out.println("Number of Mistakes: " + u.totalMistakes());
  
        if(u.isPassing()){
            System.out.println("The student PASSED");
          } else {
            System.out.println("The student FAILED");
        }
        
        System.out.println();
        //will print out a memory address
        System.out.println(answerArray);
        
        System.out.println();
        //using the Arrays.toString method will print out
        //the contents of the array
        System.out.println(Arrays.toString(answerArray));
    
        
    }   
    
}
