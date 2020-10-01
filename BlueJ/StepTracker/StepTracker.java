
/**
 * AP 2019 StepTracker FRQ
 *
 * @author Kirsten Fournier
 * @version July 13, 2020
 */
public class StepTracker
{
    // instance variables - replace the example below with your own
    private int minNumSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;

    /**
     * Constructor for objects of class StepTracker
     */
    public StepTracker(int minNumSteps)
    {
        // initialise instance variables
        this.minNumSteps = minNumSteps;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
        
    }

    /**
     * Method to calucate daily steps
     */
    public void addDailySteps(int dailySteps)
    {
        // put your code here
        totalSteps = totalSteps + dailySteps;
        numDays++;
        
        if(dailySteps >= minNumSteps){
            numActiveDays++;
       
        }
       
    }
    
    /**
     * Getter method to return number of active days
     */
    public int getActiveDays(){
        return numActiveDays;
    }
    
    /**
     * Method to calculate daily average steps
     */
    public double averageSteps(){
        
        double averageSteps = 0.0;
        
        if (totalSteps == 0){
            averageSteps = 0.0;
        }
        else{
            
        averageSteps = (double)totalSteps/numDays;
    }
        return averageSteps;
    }
    
    /**
     * Main method
     */
     public static void main(String[] args){
         StepTracker tr = new StepTracker(10000);
         System.out.println(tr.getActiveDays());
         System.out.println(tr.averageSteps());
         tr.addDailySteps(9000);
         tr.addDailySteps(5000);
         System.out.println(tr.getActiveDays());
         System.out.println(tr.averageSteps());
         tr.addDailySteps(13000);
         System.out.println(tr.getActiveDays());
         System.out.println(tr.averageSteps());
         tr.addDailySteps(23000);
         tr.addDailySteps(1111);
         System.out.println(tr.getActiveDays());
         System.out.println(tr.averageSteps());
         
        }
    
}
