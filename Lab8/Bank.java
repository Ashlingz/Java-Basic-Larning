
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Scanner;
public class Bank
{
    
       private double balance;
       
       public Bank(){
         balance = 1000;
         
        }

      public double ShowBalance(){
        return balance;
      } 
       
    public void getBalance()
    {
        System.out.println("Balance: " + balance);
    }
    public void deposit()
    {
        Scanner dp = new Scanner(System.in);
        System.out.print("Deposit Amount of:");
        //double Deposit = dp.nextDouble();
        balance = balance + dp.nextDouble();

        System.out.println("Deposit : " + balance);
        
    }
    public void withdraw()
    {
        Scanner dp = new Scanner(System.in);
        System.out.print("Withdraw Amount of:");
        balance = balance - dp.nextDouble();
        
        if(balance <=0)
        {
            System.out.println("Sorry not Enough Amount: " + balance);
        }
        else
        { 
            System.out.println("Withdraw amount exceed account balance: ");

        }
    }

    public void Username(){
        Scanner dp = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String name = dp.nextLine();

        System.out.println("Username: " + name);
    }
}
