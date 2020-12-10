
/**
 * CoinFlip program - Heads or Tails
 *
 * @author Mrs. Fournier
 * @version November 19, 2020
 */
public class CoinFlip
{
    public static void fourHeads(int n){
        int heads = 0;
        int tails = 0;
        
        //create an extra variable here to reset
        //value back to 0 if tails encountered?
        //maybe have value of heads be 1?
        
        int flip = (int)(Math.random() * 2) + 1;
        
        while(heads < 4){
            if (flip == 1){
                heads++;
                System.out.print("H ");
                    if (heads == 4){
                        System.out.print("Four heads in a row!");
                        break;
                    }
            }else{
                    System.out.print("T ");
                    break;
                }
                
            }
            System.out.print("Four heads in a row!");
        }
        
     public static void main(String[] args){
         fourHeads();
        }
    }
        
    /*
Write a static method named fourHeads 
that repeatedly flips a coin until 
four heads in a row are seen.  You 
should use Math.random() to give an 
equal chance to a head or a tail 
appearing.  Each time the coin is 
flipped, what is seen is displayed 
(H for heads, T for tails).  When four 
heads in a row are flipped a 
congratulatory message is printed.  
Here are possible outputs of two calls 
to fourHeads:

T T T H T H H H H
Four heads in a row!
 
T H T H T T T T T H H T H H H H 
Four heads in a row! 
*/


