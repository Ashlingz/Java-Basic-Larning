
/**
 * Write a description of class MyLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Scanner;

public class MyUtil
{
    private final static Scanner in = new Scanner(System.in);
    
    public final static void clearScreen() {
        try {

        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}
    }
    public static void pressAnyKey()
    {
        System.out.print("Press any key to continue ...");
        in.nextLine();
        
    }
    public static boolean confirmYesNo(String msg)
    {
        System.out.print(msg + " [Y/N] : " );
        String cmd = in.nextLine();
        if(cmd.equalsIgnoreCase("y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
