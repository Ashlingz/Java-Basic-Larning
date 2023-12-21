
/**
 * Write a description of class Exam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Exam
{
    private ArrayList<ExamBase> acc;
    
    public Exam(){
        acc = new ArrayList<ExamBase>();
    }
    
    public void AddStudents(String accName)
    {
        ExamBase newAcc = new ExamBase();
        newAcc.setAccName(accName);

        acc.add(newAcc);
    }
    
 
    public ExamBase findAcc(String accName)
    {
        for(int i=0; i < acc.size(); i++)
        {
            if(acc.get(i).getAccName().equals(accName))
                return acc.get(i);
        }
        return null;
    }
    
    public void displayAllAcc()
    {
        for(int i=0; i<acc.size(); i++)
        {
            System.out.printf("%d " ,(i+1));
            System.out.printf("   %s \n" ,acc.get(i).getAccName());
            System.out.printf("   [C: %d]" ,acc.get(i).getC());
            System.out.printf("   [C++: %d]" ,acc.get(i).getCC());
            System.out.printf("   [C#: %d]" ,acc.get(i).getCCC());
            System.out.printf("   [Java: %d]" ,acc.get(i).getJ());
            System.out.printf("   [Python: %d]" ,acc.get(i).getP());
            System.out.printf("   [Total: %d]" ,acc.get(i).getTotal());
            System.out.printf("   [Grade : %s]\n" ,acc.get(i).getGrade());
            System.out.println("---------------------");
            
            
        }
    }
    
    public void AddPoints(String accName){
        Scanner in = new Scanner(System.in);
        
            ExamBase tmp = findAcc(accName);
            if( accName == accName){
                
                System.out.print("Java  : ");
                int Jamount = in.nextInt();
                System.out.print("C     : ");
                int Camount = in.nextInt();
                System.out.print("C++   : ");
                int CCamount = in.nextInt();
                System.out.print("CC    : ");
                int CCCamount = in.nextInt();
                System.out.print("Python: ");
                int Pamount = in.nextInt();
                if(tmp == null){
                    System.out.println("Student Not In List");
                    System.out.println("---------------------------------------------");
                    
                }else{
                    tmp.deposit(Jamount,Camount,CCamount,CCCamount,Pamount);
                    System.out.println("Points Sumbitted");
                    System.out.println("---------------------------------------------");
                }
                
            }else{
                System.out.println("Student Not In List");
            }
        
    }
}
