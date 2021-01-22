
/**
 * Main class here, with my main method
 *
 * @author Mrs. Fournier
 * @version January 15, 2021
 */
public class Main
{
    public static void main(String[] args){
        BankAccountLab acct1 = new BankAccountLab();
        BankAccountLab acct2 = new BankAccountLab("Nell", 234567, 600.15);

        BankAccountLab acct3 = new BankAccountLab("Adrienne", 345678, 500.25);
        BankAccountLab acct4 = new BankAccountLab("Rocky", 456789, 400.22);

        System.out.println(acct1.withdraw(100));
        System.out.println(acct1.deposit(200));

        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        System.out.println(acct3.toString());
        System.out.println(acct4.toString());

        System.out.println(acct1.getAccountNum());

        //I included this because I wanted to print how many accounts were created
        //Notice how I am calling getCount on the class because the static variable
        //bankAccountNum is the same for the the entire class, it will update every
        //time a new BankAccountLab object is created
        System.out.println(BankAccountLab.getCount());
    }
}




