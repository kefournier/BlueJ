
/**
 * BankAccountLab here
 *
 * @author Mrs. Fournier
 * @version January 15, 2021
 */
public class BankAccountLab
{

    private String name;
    private int accountNum;
    private double balance;

    //static variables belong to the class
    private static int bankAccountNum;

    //first constructor with default values
    public BankAccountLab(){
        name = "Madeleine";
        accountNum = 12345;
        balance = 754.32;
        //everytime the constructor is called, the 
        //number of accounts will update
        bankAccountNum++;

    }

    //second constructor in which we initialize the instance variables
    public BankAccountLab(String name, int accountNum, double balance){
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        bankAccountNum++;

    }

    //create our own toString() method
    public String toString(){

        return this.name + ", " + this.balance;
    }


    public double withdraw(int amount){

        double withdrawAmt = 0;

        if (balance > amount) {
            withdrawAmt = this.balance - amount;
        }
            return withdrawAmt;

    }


    public double deposit(int amount){
        double depositBalance = this.balance + amount;
        return depositBalance;
    }


    //method to return BankAccount number
    public static int getCount(){

        return bankAccountNum;
    }


    public int getAccountNum(){

        return accountNum;
    }
}




    