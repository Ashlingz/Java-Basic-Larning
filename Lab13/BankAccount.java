
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;
    private String accName;
    private String delete;
    private int status;
    
    public BankAccount()
    {
        balance = 0;
        status = 1;
    }
    
    public void setAccName(String accName)
    {
        this.accName = accName;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Not enough balance to withdraw!");
    }
    public String getAccName()
    {
        return accName;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getStatus(){
        return status;
    }
    public void setNew(String accName){
        this.accName = accName;
    }
    public void setStatus(int status){
        this.status = status;
    }
    
  
}
