
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private double liter;
    private double gas;
    private double efficiency;
    
    public  Car()
    {
        liter = 0;
        gas = 0;
        efficiency = 0.07;
       
       }
    

    public void drive(double km){
        liter = liter + km;
        gas = gas - (km * 0.07);

    }
    public void loadgas(double lt){
        gas = gas + lt;
    }
    public void changeEiffiency(double e){
        efficiency = e;
    }
    public double checkGas(){
        return gas;
    }
    public double checkliter(){
        return liter;
    }

}
