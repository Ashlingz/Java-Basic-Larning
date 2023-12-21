
/**
 * Write a description of class ExamSystemManagemnet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ExamSystemManagemnet
{
    public static void main(String args[])
    {
        Exam b = new Exam();
        Design designTo = new Design();
        Scanner in = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
        String response = "";
        
        designTo.Board();

        while(!response.equals("l")){
            System.out.print("Press:  ");
            response = ini.nextLine();
            
            String accName;
            int amount;
            switch(response)
            {
                case "1":
                        designTo.DesignAddStudents();
                        
                    System.out.print("Enter Student Name: ");
                    accName = ini.nextLine();
                    b.AddStudents(accName);
                    System.out.println("Student ["+ accName +"] Has Been Added!");
                    System.out.println("---------------------------------------------");
                    break;
                    
                    case "3":
                        designTo.DesignAddPoints();
                        
                    System.out.print("Enter Student Name: ");
                    accName = in.nextLine();
                    b.AddPoints(accName);
                    break;
                        
                    case "2":
                        designTo.DesignDisplay();
                    b.displayAllAcc();
                    System.out.println("---------------------------------------------");
                    break;
                    
                case("c"):
                    MyUlti.clearConsole();
                    designTo.Board();
                    break;
                    
                case("6"):
                    double total = (60 )*0.5 +(1.800)*0.2;
                    System.out.println(total);
                    break;
            }
        }
    }
}
