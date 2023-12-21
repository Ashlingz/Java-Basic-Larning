
/**
 * Write a description of class LightBullSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightBullSwitch
{  
    
 public static void main(String[] args){
     LightBull Sw = new LightBull();
     
     //1 to unlimit= Off; 0= On;
     Sw.Switch(1);
     System.out.println(Sw.getLight());
 }

}
