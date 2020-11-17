
/**
 * Program to practice Boolean logic.
 *
 * @author Mrs. Fournier
 * @version November 3, 2020
 */
public class BooleanExpressions
{
    //method to find largest of three numbers
    public static int max(int x, int y, int z){
        if (x > y && x > z){
            return x;
        }
        else if (y > x && y > z){
            return y;
        }
        else{
            return z;
        }
    }
    
    //method to find largest of three numbers using Math.max method
    public static int max2(int x, int y, int z){
        return Math.max(x,(Math.max(y,z)));
    }
    
    //method to check if n is a perfect square
    public static boolean square(int n){
        //need to use typecasting here because Math functions return doubles
        int nSquareRoot = (int)Math.round(Math.sqrt(n));
        int nSquare = (int)Math.pow(nSquareRoot, 2);
        if (n != nSquare){
            return false;
        }
        return true;
    }
        
    
    public static void main(String[] args){
        System.out.println(max(5, 9, 8));
        
        System.out.println(max2(12, 17, 13));
        
        System.out.println(square(25));
    }
  }
        

