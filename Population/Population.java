
/**
 * Population programming problem
 *
 * @author Mrs. Fournier
 * @version December 21, 2020
 */

import java.util.Scanner;

public class Population
{
    public static void main(String[] args){
    
    int startYear = 2014;    
    double startPopulation = 123.8;
    
    double growth = 1.005;
    
    Scanner userPopulation = new Scanner(System.in);
    System.out.println("What is the target population? ");
    double targetPopulation = userPopulation.nextDouble();
    
    int newYear = 0;
    
    while (startPopulation < targetPopulation){
        startPopulation = startPopulation * growth;
        newYear++;
    }
    
    int endYear = startYear + newYear;
    
    System.out.println("The target population will be reached in " + endYear + ".");


}
}
