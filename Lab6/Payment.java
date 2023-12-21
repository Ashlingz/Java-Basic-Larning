
/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment
{
    private double pay;
    
    public Payment(){
        pay = pay;
    }
    
    public Double getPayment(){
        return pay;
    }
    
    public void InputPayment(double stupay){
        pay = stupay;
        
        if(stupay >= 390){
            System.out.println("Payment Completed");
        }
        else{
            System.out.println("Sorry Payment not Enough");
        }
    }
}
