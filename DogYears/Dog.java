
/**
 * FRQ Practice #1: DogYears 
 *
 * @author Mrs. Fournier
 * @version October 25, 2020
 */

import java.lang.Math;

public class Dog
{
    private int dogAge;
    
    public Dog(int ageOfDog){
        dogAge = ageOfDog;
    }
    
    public static int humanAge(int myDogAge){
        double humanAge = 0;
        
        if (myDogAge <= 1){
            humanAge = 13;
            return (int)humanAge;
        }
        else {
            //double calcHumanAge = myDogAge * (16/3);
            //humanAge = Math.round(calcHumanAge);
            humanAge = 13 + ((myDogAge-1) * ((double)16/3));
            return (int)(Math.round(humanAge));
        }
    }
        
    public static void main(String[] args){
        Dog daisy = new Dog(1);
        Dog fifi = new Dog(6);
        Dog spot = new Dog(10);
        Dog barney = new Dog(4);
        Dog margo = new Dog(13);
            
        System.out.println(humanAge(daisy.dogAge));
        System.out.println(humanAge(fifi.dogAge));
        System.out.println(humanAge(spot.dogAge));
        System.out.println(humanAge(barney.dogAge));
        System.out.println(humanAge(margo.dogAge));
    }    
}
