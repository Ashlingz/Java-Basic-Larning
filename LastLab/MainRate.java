
/**
 * Write a description of class MainRate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MainRate
{
    public static void main(String[] args){
        Rate menu = new Rate();
        System.out.println("Pree 0 to Exit");
        System.out.println("Pree 1 to Exchange Reil to Dollar");
        System.out.println("Pree 2 to Exchange Baht to Dollar");
        System.out.println("Pree 3 to Exchange Euro to Dollar");
        System.out.println("_______________________________________________");

        Scanner s = new Scanner(System.in);
        int inputString;

        do{
            System.out.print("Press: ");
            inputString = s.nextInt();

            switch (inputString) {
            case 1:
            menu.Exreil();
            break;

            case 2:
            menu.Exbaht();
            break;

            case 3:
            menu.Exeuro();
            break;

            case 0:  
            break;
            } 
        }while(inputString != 0);


    }  
}
