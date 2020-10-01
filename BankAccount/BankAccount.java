public class BankAccount
{

   private String name;
   private int acctNumber;
   private double balance;
    
   public BankAccount(){
        
        name = "Nell";
        acctNumber = 12345;
        balance = 312.50;
    }
    
    public BankAccount(String name, int acctNumber, double balance){
        
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }
    
    
    
    public String toString(){
        return this.name + " " + this.acctNumber + " " + this.balance;
    }
    
    public double withdraw(double amount){
        
        double withdrawAmt = 0.0;
        
        if (this.balance > amount){
            withdrawAmt = amount;
            this.balance = this.balance - withdrawAmt;
        }
        return this.balance;
    }
    
    public double deposit(double amount){
        
        this.balance = this.balance + amount;
        
        return this.balance;
    }
            

    public static void main(String[] args){
        
        BankAccount account = new BankAccount("Adrienne", 23456, 220.50);
        System.out.println(account.toString());
        System.out.println(account.withdraw(10.0));
        System.out.println(account.deposit(20.0));
        
    }
        
}
