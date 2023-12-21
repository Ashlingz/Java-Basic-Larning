
/**
 * Write a description of class Class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class
{
    private int studentId;
    private String Name;
    private String Grade;
    private int totalMarks;
    
    public Class(){
        this.studentId = studentId;
        this.Name = Name;
        this.Grade = Grade;
        this.totalMarks = totalMarks;
    }
    
    public int getIdStudent(){
        return studentId;
    }
        public int gettotalMarks(){
        return totalMarks;
    }
    public String getName(){
        return Name;
    }
    public String getGrade(){
        return Grade;
    }
    
    public void ClassInfo(String stuName, String stGrade, int stuId, int totals){
        studentId =stuId;
        Name = stuName;
        Grade = stGrade;
        totalMarks = totals;
        
    }
}
