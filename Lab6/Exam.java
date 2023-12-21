
/**
 * Write a description of class Exam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam
{
    private String Name;
    private int Score1;
    private int Score2;
    private String Grade;
    private Double Total;
    
    public Exam(){
        Name = Name;
        Score1 = Score1;
        Score2 = Score2;
        Total = Total;
    }
    
        public int getScore1(){
        return Score1;
    }
    public int getScore2(){
        return Score2;
    }
    public String getName(){
        return Name;
    }
    public Double getTotal(){
        return Total;
    }
    
    public void Tscore1(int stuScore){
        Score1 = stuScore;
    }
    public void Tscore2(int stuScore){
        Score2 = stuScore; 
        
    }

    
    public void ExamInfo(String stuName, int stuScore1, int stuGrade ){
        Name =stuName;
        Score1 = stuGrade;
        
        if(stuGrade > 100){
            System.out.println("Grade A+");
        }
        if(stuGrade > 90){
            System.out.println("Grade A");
        }
        if(stuGrade > 80){
            System.out.println("Grade B");
        }
        if(stuGrade > 70){
            System.out.println("Grade C");
        }
        if(stuGrade > 60){
            System.out.println("Grade D");
        }
        if(stuGrade > 50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
