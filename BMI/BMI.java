
/**
 * Write a description of class BMI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class BMI
{
    
    public static double bmi(double height, double weight){
        
        double bmiValue = (weight/Math.pow(height, 2)) * 703;
        return bmiValue;
    }
    
    public static String weightClass(double height, double weight){
        if (bmi(height, weight) < 18.5){
            return "underweight";
        }
        else if (bmi(height, weight) >= 18.5 && bmi(height, weight) < 25){
            return "normal";
        }
        else if (bmi(height, weight) >= 25 && bmi(height, weight) < 30){
            return "overweight";
        }
        else {
            return "obese";
        }
    }
        
    
    public static void main(String[] args){
        
        System.out.println(bmi(67, 150));
        System.out.println();
        Scanner userHeight = new Scanner(System.in);
        System.out.println("Please enter your height, in inches: ");
        double userInches = userHeight.nextDouble();
        
        
        userHeight.close();
        
        Scanner userWeight = new Scanner(System.in);
        System.out.println("Please enter your weight, in pounds: ");
        double userPounds = userWeight.nextDouble();
        
        userWeight.close();
        
        System.out.println("Height (in inches): " + userInches);
        
        System.out.println("Weight (in pounds): " + userPounds);
        
        
        System.out.println("BMI = " + bmi(userInches, userPounds));
        
        System.out.println(weightClass(userInches, userPounds));
    }
}
