
/**
 * Write a description of class ExamBase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamBase
{
    
    private int j;
    private int c;
    private int cc;
    private int ccc;
    private int p;
    private String accName;
    private int total;
    private String grade;
    
    public ExamBase()
    {
        j = 0;
        c = 0;
        cc = 0;
        ccc = 0;
        p = 0;
        total = 0;
        grade ="Process...";
    }
    
    public void setAccName(String accName)
    {
        this.accName = accName;
    }
    public void deposit(int Jamount, int Camount, int CCamount, int CCCamount, int Pamount)
    {
        j = Jamount;
        c = Camount;
        cc = CCamount;
        ccc = CCCamount;
        p = Pamount;
        total = j + c + cc + ccc + p;
        
        if(total == 500){
            grade = "A";
        }else if(total >=400){
            grade = "B";
        }else if(total >=300){
            grade = "C";
        }else if(total >=200){
            grade = "D";
        }else if(total >=100){
            grade = "E";
        }else{
            grade = "F";
        }
    }
    
    
    public void withdraw(int amount)
    {
        if(j >= amount)
            j -= amount;
        else
            System.out.println("Not enough balance to withdraw!");
    }
    public String getAccName()
    {
        return accName;
    }
    public int getJ()
    {
        return j;
    }
    public int getC()
    {
        return c;
    }
    public int getCC()
    {
        return cc;
    }
    public int getCCC()
    {
        return ccc;
    }
    public int getP()
    {
        return p;
    }
    public int getTotal()
    {
        return total;
    }
    public String getGrade()
    {
        return grade;
    }

    public void setNew(String accName){
        this.accName = accName;
    }

    
  

}
