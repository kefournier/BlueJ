
/**
 * Palindrome program
 *
 * @author Mrs. Fournier
 * @version December 11, 2020
 */
public class Palindrome
{
    public static boolean isPalindrome(String str){
        int length = str.length();
        
        for(int i = 0; i < length; i++){
            String character = str.substring(i, i + 1);
            String opposite = str.substring(length - 1 - i, length - i);
            if(!character.equals(opposite)){
                return false;
            }
        }
        return true;
    }
        
        public static void main(String[] args){
            
            System.out.println(isPalindrome("racecar"));
            System.out.println(isPalindrome("computer"));
            System.out.println(isPalindrome("1212"));
            System.out.println(isPalindrome("2112"));
            System.out.println(isPalindrome("1234"));
        }
}
