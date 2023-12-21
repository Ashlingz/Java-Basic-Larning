
/**
 * Write a description of class musicMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class musicMain
{
    
    public static void main(String args[])throws UnsupportedAudioFileException, IOException, LineUnavailableException{
      
        musicSystem menu = new musicSystem();
        Scanner in = new Scanner(System.in);
        
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\TUF\\Documents\\3.Java\\Final\\music\\1.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
      
        String response = "";
        
        System.out.println("Lady Gaga Full Album");
        System.out.println("Please Press 1 to Login");
        while(!response.equals("0")) {
           
           response = scanner.next();
           response = response.toUpperCase();
           
        switch(response) {
            case ("1"): 
                MyLib.clearConsole();
                menu.List();
                System.out.print("Enter your choice: ");
            break;
            case ("2"):
                menu.musicList();
                String list = scanner.next();
                clip.stop();
                File file1 = new File("C:\\Users\\TUF\\Documents\\3.Java\\Final\\music\\"+ list +".wav");
                AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
                Clip clip1 = AudioSystem.getClip();
                clip1.open(audioStream1);
                clip = clip1;
                
                clip.start();
                System.out.println("_______________________________________________");
                System.out.println("Music Played");
                System.out.println("_______________________________________________");
                System.out.print("Enter your choice: ");
                
            break;
            
            
            case ("P"): 
                clip.start();
                System.out.println("_______________________________________________");
                System.out.println("Music Played");
                System.out.println("_______________________________________________");
                System.out.print("Enter your choice: ");
            break;
            case ("S"): 
                clip.stop();
                System.out.println("_______________________________________________");
                System.out.println("Music Paused");
                System.out.println("_______________________________________________");
                System.out.print("Enter your choice: ");
            break;
            case ("R"): 
                clip.setMicrosecondPosition(0);
                System.out.println("_______________________________________________");
                System.out.println("Music Reset");
                System.out.println("_______________________________________________");
                System.out.print("Enter your choice: ");
            break;
            case ("0"): 
                clip.close();
            break;
            case ("L"): 
                clip.loop(clip.LOOP_CONTINUOUSLY);
                System.out.println("_______________________________________________");
                System.out.println("Music Loop Enchanted");
                System.out.println("_______________________________________________");
                System.out.print("Enter your choice: ");
            break;
            
            default: System.out.println("Not a valid response");
           }
       
        }
        System.out.println("_______________________________________________");
        System.out.println("Gaga Out!"); 
    }
          
          
          
              
    
}
