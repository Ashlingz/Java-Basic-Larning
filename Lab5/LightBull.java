
/**
 * Write a description of class LightBull here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightBull
{
      private double Light;

    
    public LightBull(){
      Light = 1;
      
    }
    
    public void Switch(double Swi){
        if((Light + Swi) > 1){
            System.out.println("Light Switch Off");
        }
        else{
             System.out.println("Light Switch On");
        }
    }
    public double getLight(){
        return Light;
    }
    
    

}
