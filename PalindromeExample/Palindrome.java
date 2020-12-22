
/**
 * Palindrome example program
 *
 * @author Mrs. Fournier
 * @version December 16, 2020
 */
import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(String word){
        int length = word.length();
        int last = length - 1;
        
        int i = 0;
        while(i < last){
            if (word.charAt(i) != word.charAt(last)){
                return false;
            }
            i++;
            last--;
          }
        return true;
       
    }
    
    public static void main(String[] args){
        
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("fournier"));
        
        Scanner userName = new Scanner(System.in);
        System.out.println("What is your name? ");
        String theName = userName.nextLine();
        
        System.out.println(isPalindrome(theName));
        
    }
            
}
