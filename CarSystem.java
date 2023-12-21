
/**
 * Write a description of class CarSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarSystem
{
   public static void main (String args[]){
    Car card1 = new Car();
    card1.loadgas(100);
    card1.drive(5);

    System.out.println(card1.checkGas());
    System.out.println(card1.checkliter());
 }
}
