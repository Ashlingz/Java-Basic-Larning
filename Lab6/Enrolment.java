
/**
 * Write a description of class Enrolment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enrolment
{
    private int Id;
    private String Name;
    private String Gender;
    private Double Contact;
    private String Address;
    
    public Enrolment(){
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
    }
    
    public int getID(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public String getGender(){
        return Gender;
    }
    public String getaddress(){
        return Address;
    }
    public Double getContact(){
        return Contact;
    }
    public void InputEnrol(String stuName, String stuAddress, String stuGender, int stuId, Double stuContact ){
        Id = stuId;
        Name = stuName;
        Address = stuAddress;
        Gender = stuGender;
        Contact = stuContact;
    }
    
    

}
