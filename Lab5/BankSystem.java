
/**
 * Write a description of class BankSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankSystem
{ 
    
      public static void main(String[] args)
    {
        Bank ac1 = new Bank();
        ac1.withdraw(100);
        System.out.println(ac1.getBalance());
    }  

}
