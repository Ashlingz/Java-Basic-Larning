
/**
 * Write a description of class Bank here.
 *
 * @author (Leom Singly)
 * @version (12/15/2022-12:00)
 
import java.util.*;
public class Bank
{
    private static final int MAX = 100;
    private BankAccount[] acc;
    private int accNum;
    Scanner in = new Scanner(System.in);
    public Bank(){
        acc = new BankAccount[MAX];
        accNum = 0;
    }
    
    public void openAccount(String accName, double initBal,int status)
    {
        acc[accNum] = new BankAccount();
        acc[accNum].setAccName(accName);
        acc[accNum].deposit(initBal);
        accNum++;
        status = 0;
    }
    public BankAccount findAcc(String accName)
    {
        for(int i=0; i < accNum; i++)
        {
            if(acc[i].getAccName().equals(accName))
                return acc[i];
        }
        return null;
    }
    public void deposit(String accName, double amount)
    {
        BankAccount tmp = findAcc(accName);
        if(tmp != null){
            if(tmp.getStatus()==1){
                tmp.deposit(amount);
                System.out.println("Amount has been deposited successfully!");
            }
            else{
                System.out.println("Account have been closed");
            }
            
        }
        else{
            System.out.println("Account does not existed!");
        }
    }
    public void withdraw(String accName, double amount)
    {
        BankAccount tmp = findAcc(accName);
        if(tmp != null){
            if(tmp.getStatus()==1){
                tmp.withdraw(amount);
                System.out.println("Amount has been withdrawed successfully!");
            }
            else{
                System.out.println("Account have been closed");
            }
        }
        
        else{
            System.out.println("Account does not existed!");
        }
    }
    public void displayAllAcc()
    {
        for(int i=0; i<accNum; i++)
        {
            System.out.printf("Account No: %d \n" ,(i+1));
            System.out.printf("Account Name: %s \n" ,acc[i].getAccName());
            System.out.printf("Account No: %f \n" ,acc[i].getBalance());
            if(acc[i].getStatus()== 1){
                System.out.println("status: Account is currently activate");
            }else{
                System.out.println("status: Account is closed");
            }
            
            System.out.printf("------------------------- \n");
        }
    }
    public void balanceEnquiry(String accName){
        BankAccount tmp = findAcc(accName);
        if(tmp != null){
            if(tmp.getStatus()==1){
                System.out.println("Account Name: "+ tmp.getAccName());
                System.out.println("Account Balance: "+tmp.getBalance());
                System.out.printf("------------------------- \n");
            }
            else{
                System.out.println("Account have been closed");
            }
        }
       
        else{
            System.out.println("Account does not existed!");
        }
    }
    public void close(String accName){
        BankAccount tmp = findAcc(accName);
        if(tmp != null){
            if(tmp.getStatus()==1){
                tmp.setStatus(0);
                System.out.println("Account have been close successfully!");
            }
            else{
                System.out.println("Account have already been closed");
            }
        }
        else{
            System.out.println("Account does not existed!");
        }
    }
    public void modify(String accName){
        BankAccount tmp = findAcc(accName);
        if(tmp != null){
            if(tmp.getStatus()==1){
                System.out.print("Input new account's name : ");
                String naccName = in.nextLine();  
                tmp.setNew(naccName);  
                System.out.println("Account have been modify successfully!");
            }  
            else{
                System.out.println("Account have been closed");
            }
        } 
        else{
            System.out.println("Account does not existed!");
        }
    }
 
}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Bank
{
    private ArrayList<BankAccount> acc;
    
    public Bank(){
        acc = new ArrayList<BankAccount>();
    }
    
    public void openAccount(String accName, double initBal)
    {
        BankAccount newAcc = new BankAccount();
        newAcc.setAccName(accName);
        newAcc.deposit(initBal);
        acc.add(newAcc);
    }
    
    public BankAccount findAcc(String accName)
    {
        for(int i=0; i < acc.size(); i++)
        {
            if(acc.get(i).getAccName().equals(accName))
                return acc.get(i);
        }
        return null;
    }
    public void deposit(String accName, double amount)
    {
        BankAccount tmp = findAcc(accName);
        if(tmp != null)
            tmp.deposit(amount);
        else
            System.out.println("Account does not existed!");
    }
    public void withdraw(String accName, double amount)
    {
        BankAccount tmp = findAcc(accName);
        if(tmp != null)
            tmp.withdraw(amount);
        else
            System.out.println("Account does not existed!");
    }
    public void displayAllAcc()
    {
        for(int i=0; i<acc.size(); i++)
        {
            System.out.printf("Account No: %d \n" ,(i+1));
            System.out.printf("Account Name: %s \n" ,acc.get(i).getAccName());
            System.out.printf("Account No: %f \n" ,acc.get(i).getBalance());
            System.out.printf("------------------------- \n");
        }
    }
    
    public void Close(String accName){
        for(int i=0; i<acc.size(); i++){
            
            if( accName == accName){
                acc.remove(i);
                
                System.out.println("Account Closed");
            }else{
                System.out.println("Account Not Found");
            }
        }
    }
    
    public void update(String accName){
        Scanner in = new Scanner(System.in);
        
            BankAccount tmp = findAcc(accName);
            if( accName == accName){
                
                System.out.print("New Name: ");
                String Newname = in.nextLine();
                
                tmp.setNew(Newname);
                
                System.out.println("Account Updated");
            }else{
                System.out.println("Account Not Found");
            }
        
    }
}



