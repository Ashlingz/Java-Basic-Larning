
/**
 * Write a description of class MainElectric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MainElectric
{
    public static void main(String[] args){
        Electric menu = new Electric();
        System.out.println("Pree 0 to Exit");
        System.out.println("Pree 1 to Login Application");
        System.out.println("Pree 2 to Calculate Electricity");
        System.out.println("Pree 3 to Change Name");
        System.out.println("Pree 4 to Display Info");
        System.out.println("_______________________________________________");
        
        Scanner s = new Scanner(System.in);
      int inputString;

      do{
          System.out.print("Press: ");
          inputString = s.nextInt();

          switch (inputString) {
          case 1:
          menu.EnterName();
          break;

          case 2:  
          menu.calUsage();
          break;

          case 3: 
          menu.ChangeName(); 
          break;

          case 4:
          menu.Display();
          break;

          case 0:  
          break;
        } 
      }while(inputString != 0);
        
    }
}
