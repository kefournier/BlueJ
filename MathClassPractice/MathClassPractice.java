
/**
 * Program to practice some Math class methods
 *
 * @author Mrs. Fournier
 * @version November 6, 2020
 */
public class MathClassPractice
{
    public static void main(String[] args){
        
        int num1 = -64;
        double num2 = 26.8;
        double expo = 4;
        double result1 = Math.abs(-144);
        int result2 = Math.abs(-123);
        System.out.println(Math.abs(-144));
        
        System.out.println(result1);
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));
        System.out.println(Math.pow(result1, expo));
        //first number is the base, and the second number is the exponent
        System.out.println(Math.pow(144,4));
        System.out.println(Math.sqrt(result1));
        
        
        System.out.println(Math.random());
        
        //this produces a random number between 1 and 10
        int random = (int)(Math.random()* 10) + 1;
        //this produces a random number between 5 and 15
        int random2 = (int)(Math.random()* 10) + 5;
        System.out.println(random);
        System.out.println(random2);
    }
    
}
