
/**
 * Write a description of class Electric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Scanner;
public class Electric
{
    String cusId;
    String cusName;
    double currentMeter;
    double usage;
    
    public Electric(){
        this.cusId = cusId;
        this.cusName = cusName;
        this.currentMeter = currentMeter;
        this.usage = usage;
        
    }
    
    public void calUsage(){

        Scanner meter = new Scanner(System.in);
        System.out.print("Enter Current Used : ");
        currentMeter = meter.nextDouble();
        
        if(currentMeter <= 50){
            currentMeter = currentMeter * 500;
        }
        else if(currentMeter <= 100){
            currentMeter = currentMeter * 1000;
        }else if(currentMeter <=150){
            currentMeter = currentMeter * 1500;
        }else if(currentMeter <=200){
            currentMeter = currentMeter * 2000;
        }else{
            currentMeter = currentMeter * 2500;
        }

        System.out.println("_______________________________________________");
        System.out.println("Total Payment This Month: $" + currentMeter);
        System.out.println("_______________________________________________");


    }

    

    public void Display(){
        System.out.println("Customer");
        System.out.println("_______________________________________________");
        System.out.println("ID       : " + cusId);
        System.out.println("Name     : " + cusName);
        System.out.println("Payment  : $" + currentMeter);
        System.out.println("_______________________________________________");
    }

    public void ChangeName(){
        System.out.println("_______________________________________________");
        System.out.println("Name  : " + cusName);

        Scanner dppp = new Scanner(System.in);
        System.out.print("Change Name : ");
        cusName = dppp.nextLine();

        System.out.println("_______________________________________________");
        System.out.println("Changed Completed");
        System.out.println("Name  : " + cusName);
        System.out.println("_______________________________________________");


    }

    public void EnterName()
   {
    System.out.println("_______________________________________________");
        Scanner dp = new Scanner(System.in);
        System.out.print("Enter ID : ");
        cusId = dp.nextLine();

        Scanner dpp = new Scanner(System.in);
        System.out.print("Enter Name : ");
        
        cusName = dpp.nextLine();
        System.out.println("_______________________________________________");
        System.out.println("Login Customer");
        System.out.println("_______________________________________________");
        System.out.println("ID    : " + cusId);
        System.out.println("Name  : " + cusName);
        System.out.println("_______________________________________________");

   }
}
