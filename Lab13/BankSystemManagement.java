
/**
 * Write a description of class BankSystemManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BankSystemManagement
{
    
   public static void main(String args[])
    {
        Bank b = new Bank();
        Scanner in = new Scanner(System.in);
        String cmd;
        System.out.println("******************************");
        System.out.println(" Bank System " );
        System.out.println("******************************" );
        System.out.println("1. Add New Account" );
        System.out.println("2. Deposit money to an account" );
        System.out.println("3. Withdraw money to an account" );
        System.out.println("4. Balance Enquiry" );
        System.out.println("5. Display All Account" );
        System.out.println("6. Close an Account" );
        System.out.println("7. Modify an Account" );
        System.out.println("0. Exit");
        System.out.println("Select Your Option (0-4)" );
        System.out.println("******************************" );
        
        
        do{
            System.out.print("Press:  ");
            cmd = in.nextLine();
            String accName;
            double amount;
            switch(cmd)
            {
                case "1":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    System.out.print("Input intial balance : ");
                    double initBal = in.nextDouble();
                    int status = 1;
                    b.openAccount(accName, initBal);
                    System.out.println("A bank account has been created successfully!");
                    break;
                case "2":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    System.out.print("Input amount to deposit : ");
                    amount = in.nextDouble();
                    b.deposit(accName, amount); 
                    break;
                case "3":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    System.out.print("Input amount to withdraw : ");
                    amount = in.nextDouble();
                    b.withdraw(accName, amount);          
                    break;
                    /*
                case "4":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    b.balanceEnquiry(accName);
                    break;
                    */
                case "5":
                    b.displayAllAcc();
                    break;
                case "6":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    b.Close(accName);
                    break;
                case "7":
                    System.out.print("Input account's name : ");
                    accName = in.nextLine();
                    b.update(accName);
                    break;  
            }
        }while(!cmd.equals("0"));
    }
    
}
