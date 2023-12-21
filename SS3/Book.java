import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private String bookPublicationYear;
    private boolean bookStatus;
    private ArrayList<Item> bookItem;
    
    public Book(){
        bookId = 0;
        bookTitle = "No Title";
        bookAuthor = "No Author";
        bookPublisher = "No Publisher" ;
        bookPublicationYear = "0000" ;
        bookStatus = true;
        bookItem = new ArrayList<Item>();
    }
    
    public void addBook()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("======== Add New Book ========");
        System.out.print("Book ID : ");
        int bookId = Integer.valueOf(in.nextLine());
        System.out.print("Book Title : ");
        String bookTitle = in.nextLine();
        System.out.print("Book Author : ");
        String bookAuthor = in.nextLine();
        System.out.print("Book Publisher : " );
        String bookPublisher = in.nextLine();
        System.out.print("Book Publication Year : " );
        String bookPublicationYear = in.nextLine();
        
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookPublicationYear = bookPublicationYear;
        
        MyUtil.pressAnyKey();    
    }
    public void editBook()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("======== Edit Book ========");
        System.out.println("Book ID : " + bookId);
        System.out.print("Book Title : ");
        String bookTitle = in.nextLine();
        System.out.print("Book Author : ");
        String bookAuthor = in.nextLine();
        System.out.print("Book Publisher : " );
        String bookPublisher = in.nextLine();
        System.out.print("Book Publication Year : " );
        String bookPublicationYear = in.nextLine();
        
        this.bookTitle = (bookTitle.trim().equals("")?this.bookTitle:bookTitle);
        this.bookAuthor = (bookAuthor.trim().equals("")?this.bookAuthor:bookAuthor);
        this.bookPublisher = (bookPublisher.trim().equals("")?this.bookPublisher:bookPublisher);
        this.bookPublicationYear = (bookPublicationYear.trim().equals("")?this.bookPublicationYear:bookPublicationYear);
        
        MyUtil.pressAnyKey();
    }
    public void displayBook()
    {
        System.out.println("Book ID: "  + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book Publisher: " + bookPublisher);
        System.out.println("Publication Year: "  + bookPublicationYear);
        System.out.println("Book Status: " + (bookStatus==true?"Available":"Delete" ));
        System.out.println("------------------------------------------------");
    }
    public int getBookId()
    {
        return bookId;
    }
    public void setStatus(Boolean bookStatus)
    {
        this.bookStatus = bookStatus;
    }
    public void addItem(Item item)
    {
        bookItem.add(item);
    }
    public void displayAllItem()
    {
        for(Item i:bookItem)
        {
            i.displayItem();
        }
    }
}
