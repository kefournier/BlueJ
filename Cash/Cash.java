/**
 * Cash program
 *
 * @author Mrs. Fournier
 * @version November 20, 2020
 */
import java.util.Scanner;

public class Cash
{
    public static void main(String[] args){
        
        Scanner change = new Scanner(System.in);
        System.out.println("How much change are you owed?");
        double userChange = change.nextDouble();
        
        change.close();
        //int newUserChange = (int)userChange * 100;
        //make these all double
        
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int coins = 0;
        
        userChange = userChange * 100;
        
        while (userChange >= 25){
            userChange = userChange - 25;
            quarters++;
            coins = coins + quarters;
        }
        System.out.println("Quarters: " + quarters);
        
        
        
        while (userChange >= 10 && userChange < 25){
            userChange = userChange - 10;
            dimes++;
            coins = coins + dimes;
        }
        System.out.println("Dimes: " + dimes);
        
        while (userChange >= 5 && userChange < 10){
            userChange = userChange - 5;
            nickels++;
            coins = coins + nickels;
        }
        System.out.println("Nickels: " + nickels);
        
        while (userChange > 0 && userChange < 5){
            userChange = userChange - 1;
            pennies++;
            coins = coins + pennies;
        }
        System.out.println("Pennies: " + pennies);
        System.out.println("Total coins: " + coins);
    }
}
