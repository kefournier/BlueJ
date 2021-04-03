
/**
 * Write a description of class ComputingStatistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   //instance variable
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   //this is the constructor
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   //an overloaded constructor
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
   
   public double avgLoan(){
       double amount = 0.0;
       for (int i = 0; i < data.size(); i++){
           amount = amount + data.get(i).getLoanAmount();
        }
        
        return (double)amount/data.size();
    }
    
   public double largestLoan(){
       double largest = data.get(0).getLoanAmount();
       
       for (int i = 1; i < data.size(); i++){
           if (data.get(i).getLoanAmount() > largest){
               largest = data.get(i).getLoanAmount();
            }
        }
        return largest;
    }
    
   public double smallestLoan(){
       double smallest = Double.MAX_VALUE;
       
       for (int i = 0; i < data.size(); i++){
           if(data.get(i).getLoanAmount() < smallest){
               smallest = data.get(i).getLoanAmount();
            }
        }
        return smallest;
    }
    
   public String largestLoanCountry(){
       double largest = data.get(0).getLoanAmount();
       int index = 0;
       
       for (int i = 1; i < data.size(); i++){
           if (data.get(i).getLoanAmount() > largest){
               largest = data.get(i).getLoanAmount();
               index = i;
            }
        }
        return data.get(index).getCountry();
    }
    
   public String smallestLoanCountry(){
       double smallest = data.get(0).getLoanAmount();
       int index = 0;
       
       for(int i = 1; i < data.size(); i++){
           if(data.get(i).getLoanAmount() < smallest){
               smallest = data.get(i).getLoanAmount();
               index = i;
            }
        }
        return data.get(index).getCountry();
    }
   
   public double avgDaysToFund(){
       
       double totalDays = 0.0;
       
       for(int i = 0; i < data.size(); i++){
           totalDays = totalDays + data.get(i).getDaysToFund();
        }
        
        return (double)totalDays/data.size();
    }
    
   public double largestLoanKenya(){
       
       double largestLoan = Double.MIN_VALUE;
       
       
           for(int i = 0; i < data.size(); i++){
               if(data.get(i).getCountry().equals("Kenya")){
                   if(data.get(i).getLoanAmount() > largestLoan){
                       largestLoan = data.get(i).getLoanAmount();
                    }
                }
            }
            return largestLoan;
        }
           
        
   public double avgLoanPhilippines(){
       
       double totalPhilippines = 0.0;
       int count = 0;
       
       for (int i = 0; i < data.size(); i++){
           if(data.get(i).getCountry().equals("Philippines")){
               totalPhilippines = totalPhilippines + data.get(i).getLoanAmount();
               count++;
            }
        }
        return (double)totalPhilippines/count;
    }
    
   public String longestToFundCountry(){
       
       int longestDays = 0;
       int index = 0;
       
       for(int i = 0; i < data.size(); i++){
           if(data.get(i).getDaysToFund() > longestDays){
               longestDays = data.get(i).getDaysToFund();
               index = i;
            }
        }
        return data.get(index).getCountry();
    }
    
   public String mostLoansFunded(){
       
       int elSalvador = 0;
       int kenya = 0;
       int indexEl = 0;
       int indexKen = 0;
       
       for(int i = 0; i < data.size(); i++){
           if(data.get(i).getCountry().equals("El Salvador")){
               elSalvador++;
               indexEl = i;
           }
           if (data.get(i).getCountry().equals("Kenya")){
               kenya++;
               indexKen = i;
           }
        }
        
        if(kenya > elSalvador){
            return data.get(indexKen).getCountry();
        }
        return data.get(indexEl).getCountry();
    }
    
    
    //added these extra two methods to check counts
    public int countKen(){
        
        int countKen = 0;
        
        
        for (int i = 0; i < data.size(); i++){
            if(data.get(i).getCountry().equals("Kenya")){
                countKen++;
            }
            
        }
        
        return countKen++;
    }
        
    public int countEl(){
        
        int countEl = 0;
        
        
        for (int i = 0; i < data.size(); i++){
            if(data.get(i).getCountry().equals("El Salvador")){
                countEl++;
            }
            
        }
        
        return countEl++;
    } 
    
    public double variance(){
        double average = 0.0;
        //int count = 0;
        
        double variance = 0.0;
        
        double total = 0.0;
        double totalForVariance = 0.0;
        
        for(int i = 0; i < data.size(); i++){
            total = total + data.get(i).getLoanAmount();
        }
        
        average = (double)total/data.size();
        
        for (int j = 0; j < data.size(); j++){
            
            totalForVariance = totalForVariance + Math.pow((data.get(j).getLoanAmount() - average), 2);
            
        }
        
        variance = (double)totalForVariance/data.size();
        
        return variance;
    }
    
    public double standardDeviation(){
        
        double variance = variance();
        return Math.sqrt(variance);
    }
        
    /*
    public double standardDeviation(){
        
        double average = 0.0;
        //int count = 0;
        
        double variance = 0.0;
        
        double total = 0.0;
        double totalForVariance = 0.0;
        
        for(int i = 0; i < data.size(); i++){
            total = total + data.get(i).getLoanAmount();
        }
        
        average = (double)total/data.size();
        
        for (int j = 0; j < data.size(); j++){
            
            totalForVariance = totalForVariance + Math.pow((data.get(j).getLoanAmount() - average), 2);
            
        }
        
        variance = (double)totalForVariance/data.size();
        
        return Math.sqrt(variance);
    }
    */
    
      public boolean empiricalRule(){
          
      double mean = avgLoan();
      double standardDeviation = standardDeviation();
      
      double oneStandDevNeg = mean - standardDeviation;
      double oneStandDevPos = mean + standardDeviation;
      double twoStandDevNeg = mean - (2 * standardDeviation);
      double twoStandDevPos = mean + (2 * standardDeviation);
      double threeStandDevNeg = mean - (3 * standardDeviation);
      double threeStandDevPos = mean + (3 * standardDeviation);
        
      double loanSum1 = 0.0;
      double loanSum2 = 0.0;
      double loanSum3 = 0.0; 
      double outliers = 0.0;
      double totalLoanSum = 0.0;
      
      for(Loan item: data)
      {
         double loanAmt = item.getLoanAmount();
         
         //1 standard deviation
         if(loanAmt >= oneStandDevNeg && loanAmt <= oneStandDevPos)
         {
            loanSum1 += loanAmt;
         }
         
         //2 standard deviations
         if(loanAmt >= twoStandDevNeg && loanAmt <= twoStandDevPos)
         {
            loanSum2 += loanAmt;
         }
         
         //3 standard deviations
         if(loanAmt >= threeStandDevNeg && loanAmt <= threeStandDevPos)
         {
            loanSum3 += loanAmt;
         }
         else
         {
            outliers +=loanAmt;
         }
         
         totalLoanSum += loanAmt;

      }

      return ((loanSum1/totalLoanSum) * 100 < 69) &&
             ((loanSum2/totalLoanSum) * 100 < 96) && 
             ((loanSum3/totalLoanSum) * 100 < 99.8);
    }

}
