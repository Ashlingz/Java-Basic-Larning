
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Test
{
     public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
  
      Scanner scanner = new Scanner(System.in);
  
      File file = new File("C:\\Users\\TUF\\Documents\\3.Java\\Final\\music\\nxde.wav");
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      
      String response = "";
      
    while(!response.equals("Q")) {
       
   
       response = scanner.next();
       response = response.toUpperCase();
   
       switch(response) {
        case ("P"): clip.start();
        break;
        case ("S"): clip.stop();
        break;
        case ("R"): clip.setMicrosecondPosition(0);
        break;
        case ("Q"): clip.close();
        break;
        case ("L"): clip.loop(clip.LOOP_CONTINUOUSLY);
        break;
        default: System.out.println("Not a valid response");
       }
   
      }
      System.out.println("Byeeee!"); 
     }  
}

