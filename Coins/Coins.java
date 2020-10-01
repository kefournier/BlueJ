
/**
 * Program to determine number of coins
 *
 * @author Kirsten Fournier
 * @version September 24, 2020
 */
public class Coins
{
    public static void main(String[] args){
        
        int totalCents = 137;
        int quarters = 137 / 25;
        int moneyLeft = 137 % 25;
        int dimes = moneyLeft / 10;
        moneyLeft = moneyLeft % 10;
        int nickels = moneyLeft / 5;
        int pennies = moneyLeft % 5;
        
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
        
    }
}
