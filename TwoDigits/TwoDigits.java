
/**
 * Program to find the number 13
 *
 * @author Mrs. Fournier
 * @version November 15, 2020
 */
public class TwoDigits
{
    public static void printTwoDigits(int n){
        
        int randomNum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            randomNum = (int)(Math.random() * 10) + 10;
            System.out.println(randomNum);
            
                if(randomNum == 13){
                    count++;
                    //System.out.println("The number 13 was not found.");
                }
            }
            
            if(count > 0){
                System.out.println("The number 13 was found.");
            }
            else {
                System.out.println("The number 13 was not found.");
            }
    }
    
    public static void main(String[] args){
        
        printTwoDigits(4);
    }
            
}
