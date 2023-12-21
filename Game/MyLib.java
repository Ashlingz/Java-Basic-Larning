
/**
 * Write a description of class Mylib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
 

public class MyLib
{
    public final static void clearConsole() {
        try {

        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}
    }  
}