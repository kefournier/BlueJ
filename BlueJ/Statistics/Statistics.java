
/**
 * Program to calculate variance and 
 * standard deviation
 *
 * @author Kirsten Fournier
 * @version September 24, 2020
 */
public class Statistics
{
    public static void main(String[] args){
        
        int grade1 = 97;
        int grade2 = 83;
        int grade3 = 92;
        
        int sum = grade1 + grade2 + grade3;
        double average = (double)sum / 3;
        
        System.out.println(average);
        
        double diff1 = grade1 - average;
        double diff2 = grade2 - average;
        double diff3 = grade3 - average;
        
        double variance = (Math.pow(diff1, 2) + Math.pow(diff2, 2)+ Math.pow(diff3, 2))/3;
        
        double stdDev = Math.sqrt(variance);
        
        System.out.println(variance);
        System.out.println(stdDev);
        
        System.out.printf("%.2f", variance);
        System.out.println();
        System.out.printf("%.2f", stdDev);
    }
}
