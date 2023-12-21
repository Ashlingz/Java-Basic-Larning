
/**
 * Write a description of class Rate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.*;
public class Rate
{
    double rielToDollar;
    double bahtToDollar;
    double euroToDollar;

    public Rate(){
        this.rielToDollar = rielToDollar;
        this.bahtToDollar = bahtToDollar;
        this.euroToDollar = euroToDollar;
    }

    public void Exreil(){
        System.out.println("_______________________________________________");
        System.out.println("4100 Reil = 1 Dollar");
        System.out.println(" ");
        
        Scanner riel = new Scanner(System.in);
        System.out.print("Enter in Reil = ");
        rielToDollar = riel.nextDouble();
        rielToDollar = rielToDollar / 4100;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Total = $" + df.format(rielToDollar));
        System.out.println("_______________________________________________");

    }

    public void Exbaht(){
        System.out.println("_______________________________________________");
        System.out.println("38.01 Baht = 1 Dollar");
        System.out.println(" ");
        
        Scanner baht = new Scanner(System.in);
        System.out.print("Enter in Baht = ");
        bahtToDollar = baht.nextDouble();
        bahtToDollar = bahtToDollar / 38.01;
        DecimalFormat dff = new DecimalFormat("#.##");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Total = $" + dff.format(bahtToDollar));
        System.out.println("_______________________________________________");

    }
    
    public void Exeuro(){
        System.out.println("_______________________________________________");
        System.out.println("1.02 Euro = 1 Dollar");
        System.out.println(" ");
        
        Scanner euro = new Scanner(System.in);
        System.out.print("Enter in Euro = ");
        euroToDollar = euro.nextDouble();
        euroToDollar = euroToDollar / 1.02;
        DecimalFormat dfff = new DecimalFormat("#.##");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Total = $" + dfff.format(euroToDollar));
        System.out.println("_______________________________________________");

    }
}
