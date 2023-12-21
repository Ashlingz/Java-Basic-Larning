
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bank
{
       private double balance;
       
       public Bank(){
         balance = 100;
         
        }
       
       
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        if((balance - amount)<0)
        {
            System.out.println("Sorry not Enough Amount.");
        }
        else
        { 
            System.out.println("Withdraw amount exceed account balance");

        }
    }
}
