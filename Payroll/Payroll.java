
/**
 * Unit 6 FRQ Progress Check: Payroll
 *
 * @author Mrs. Fournier
 * @version February 17, 2021
 */

import java.util.Arrays;

public class Payroll
{
    
    // instance variables 
    private int[] itemsSold;
    private double[] wages;
    
    public Payroll(int[] itemsSold){
        this.itemsSold = itemsSold;
        wages = new double[10];
    }
    
    //part a FRQ#2
    public double computeBonusThreshold(){
        double largest = itemsSold[0];
        double smallest = itemsSold[0];
        
        for(int i = 1; i < itemsSold.length; i++){
            if(itemsSold[i] > largest){
                largest = itemsSold[i];
            }
            if(itemsSold[i] < smallest){
                smallest = itemsSold[i];
            }
        }
        
        double sum = 0.0;
        
        for (int j = 0; j < itemsSold.length; j++){
            sum = sum + itemsSold[j];
        }
         
        double threshold = (sum - largest - smallest)/(itemsSold.length - 2);
        return threshold;
    }
    
    public void computeWages(double fixedWage, double perItemWage){
        for(int i = 0; i < itemsSold.length; i++){
            if(itemsSold[i] < computeBonusThreshold()){
                wages[i] = fixedWage + perItemWage * itemsSold[i];
            } else {
                wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
            }
        }
    }
    
    public void printWages(){
        for(int i=0; i<wages.length; i++){
            System.out.printf("%.2f\n", wages[i]);
        }
    }
    
}
    
    
    