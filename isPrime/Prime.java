
/**
 * Program to detect prime numbers
 *
 * @author Mrs. Fournier
 * @version November 23, 2020
 */
public class Prime
{
    public static int countFactors(int n){
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPrime(int myNum){
        if(countFactors(myNum) > 2){
            return false;
        }
        return true;
    }
    
    //method to return the number of prime
    //numbers between 2 and n
    public static int countPrimes(int n){
        int primesCount = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                primesCount++;
                //System.out.println(i);
            }
        }
    return primesCount;
   }

   //Extra method to print the prime numbers
   //between 2 and n
   public static void printPrimes(int n){
        for(int i = 2; i <= n; i++){
            if (countFactors(i) == 2){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        
        int testNumber = 24;
        int otherTestNumber = 13;
        
        System.out.println(countFactors(testNumber));
        System.out.println();
        System.out.println(countFactors(otherTestNumber));
        
        System.out.println();
        
        System.out.println(isPrime(testNumber));
        System.out.println(isPrime(otherTestNumber));
     
        System.out.println();
      
        System.out.println(isPrime(27));
        System.out.println(isPrime(47));
        System.out.println();
        
        System.out.println(countPrimes(47));
        System.out.println();
        printPrimes(47);
    }
}
