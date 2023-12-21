import java.util.Date;
import java.util.Scanner;

/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String itemBarcode;
    private char itemStatus; // 0. Delete 1. Normal 2. Loan 
    private String loanDate;
    private String returnDate;
    
    public Item()
    {
        itemBarcode = "0000000";
        itemStatus = '1' ;
        
    }
    public void addItem()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Item Barcode : " );
        itemBarcode = in.nextLine();
        System.out.print("Done...");
        MyUtil.pressAnyKey();
    }
    public void editItem()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Item Barcode : " );
        String itemBarcode = in.nextLine();
        this.itemBarcode = (itemBarcode.trim().equals("")?this.itemBarcode:itemBarcode);
        System.out.print("Done...");
        MyUtil.pressAnyKey();
    }
    public void displayItem()
    {
        System.out.println("Item Barcode : " + itemBarcode);
        System.out.println("Item Status : " + (itemStatus=='0'?"Delete":(itemStatus=='1'?"Normal":"Loan")));
        System.out.println("-------------------------------");
    }
    public void loanItem()
    {
        
    }
    public void returnItem()
    {
        
    }
    public void deleteItem()
    {
        
    }
    
}
