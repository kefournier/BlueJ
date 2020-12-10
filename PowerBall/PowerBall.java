
/**
 * Unit 3 PowerBall program
 *
 * @author Mrs. Fournier
 * @version November 22, 2020
 */
import java.util.Scanner;

public class PowerBall
{
    public static int randomNumber(int min, int max){
        int random = (int)(Math.random() * (max - min + 1)) + 1;
        return random;
    }
    
    public static void main(String[] args){
    
    Scanner userNumber1 = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int firstUserNumber = userNumber1.nextInt();
    
    userNumber1.close();
    
    Scanner userNumber2 = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int secondUserNumber = userNumber2.nextInt();
    
    userNumber1.close();
    
    Scanner userNumber3 = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int thirdUserNumber = userNumber3.nextInt();
    
    userNumber1.close();
    
    Scanner userNumber4 = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int fourthUserNumber = userNumber4.nextInt();
    
    userNumber1.close();
    
    Scanner userNumber5 = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int fifthUserNumber = userNumber5.nextInt();
    
    userNumber1.close();
    
    int userPowerBall = randomNumber(1, 39);
    
    int computerNumber1 = randomNumber(1, 59);
    int computerNumber2 = randomNumber(1, 59);
    int computerNumber3 = randomNumber(1, 59);
    int computerNumber4 = randomNumber(1, 59);
    int computerNumber5 = randomNumber(1, 59);
    
    int computerPowerBall = randomNumber(1, 39);
    //can use this to test the positive case
    //int userPowerBall = computerPowerBall;
    int winningAmount = 0;
    
    System.out.println("The winning number combination is: ");
    System.out.println(computerNumber1 + "\t" + computerNumber2 + "\t" + computerNumber3 + "\t" + computerNumber4 + "\t" + computerNumber5 + "\t" + "Power Ball: " + computerPowerBall);
    
    System.out.println();
    
    System.out.println("Your number combination is: ");
    System.out.println(firstUserNumber + "\t" + secondUserNumber + "\t" + thirdUserNumber + "\t" + fourthUserNumber + "\t" + fifthUserNumber + "\t" + "Power Ball: " + userPowerBall);

    //using non-mutually exclusive if statements to 
    //maintain a running total of winning amount
    if (firstUserNumber == computerNumber1){
        winningAmount += 50;
    }
    if (secondUserNumber == computerNumber2){
        winningAmount += 50;
    }
    if (thirdUserNumber == computerNumber3){
        winningAmount += 50;
    }
    if (fourthUserNumber == computerNumber4){
        winningAmount += 50;
    }
    if (fifthUserNumber == computerNumber5){
        winningAmount += 50;
    }
    
    if (userPowerBall == computerPowerBall){
        winningAmount += 500;
    }
    
    System.out.println();
    
    if (winningAmount > 0){
    System.out.println("Congratulations! Your Prize is $" + winningAmount);
    }else{
    System.out.println("Sorry, you did not win.");
}

   
    
}
}

