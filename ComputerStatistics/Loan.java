
/**
 * ComputerStatistics Kiva Lab
 *
 * @author Mrs. Fournier
 * @version March 4, 2021
 */
public class Loan
{
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;
    
    public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders){
        this.ID = ID;
        this.loanAmount = loanAmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }
    
    public int getID(){
        return ID;
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
    public String getCountry(){
        return country;
    }
    
    public int getDaysToFund(){
        return daysToFund;
    }
    
    public int getNumLenders(){
        return numLenders;
    }
    
    public String toString(){
        return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " Days to fund: " + daysToFund + " num lenders: " + numLenders;
    
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public void setDaysToFund(int daysToFund){
        this.daysToFund = daysToFund;
    }
    
    public void setNumLenders(int numLenders){
        this.numLenders = numLenders;
    }
}
