import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private int libraryId;
    private String libraryName;
    private String libraryAddress;
    
    private ArrayList<Book> book;
    private ArrayList<Patron> patron;
    
    public Library(int libraryId, String libraryName, String libraryAddress)
    {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        
        book = new ArrayList<Book>();
        patron = new ArrayList<Patron>();
    }
    
    public void libraryMenu()
    {
        Scanner in = new Scanner(System.in);
        String cmd;
        do{
            MyUtil.clearScreen();
            System.out.println("******************* Library Management System *********************" );
            System.out.println("Welcome to " + libraryName );
            System.out.println("Menu : ");
            System.out.println("1. Book ");
            System.out.println("2. Item ");
            System.out.println("3. Patron ");
            System.out.println("4. Circulation ");
            System.out.println("0. Exit ");
            System.out.println("Select your option : ");
            cmd = in.nextLine();
            switch(cmd)
            {
                case "1":
                    bookMenu();
                    break;
                case "2":
                    itemMenu();
                    break;
                case "3":
                    patronMenu();
                    break;
                case "4":
                    circulationMenu();
                    break;
            }
        }while(!cmd.equals("0"));
        
    }
    public void bookMenu()
    {
        Scanner in = new Scanner(System.in);
        String cmd;
        do{
            MyUtil.clearScreen();
            
            System.out.println("Book Management");
            System.out.println("Menu : ");
            System.out.println("1. Add New Book ");
            System.out.println("2. Edit Book ");
            System.out.println("3. Delete Book ");
            System.out.println("4. Search Book ");
            System.out.println("5. List All Books" );
            System.out.println("0. Back ");
            System.out.println("Select your option : ");
            cmd = in.nextLine();
            switch(cmd)
            {
                case "1": 
                    Book tmpBook = new Book();
                    tmpBook.addBook();
                    book.add(tmpBook);
                    break;
                case "2":
                    System.out.print("Input Book ID to Edit : " );
                    int bookId = Integer.valueOf(in.nextLine());
                    int ind = searchBook(bookId);
                    if(ind == -1)
                    {
                        System.out.println("Book is not found!");
                        MyUtil.pressAnyKey();
                    }
                    else
                    {
                        tmpBook = book.get(ind);
                        tmpBook.editBook();
                        book.set(ind, tmpBook);
                    }
                    break;
                case "3":
                    System.out.print("Input Book ID to Delete : " );
                    bookId = Integer.valueOf(in.nextLine());
                    ind = searchBook(bookId);
                    if(ind == -1)
                    {
                        System.out.println("Book is not found!");
                        MyUtil.pressAnyKey();
                    }
                    else
                    {
                        tmpBook = book.get(ind);
                        if(MyUtil.confirmYesNo("Are you sure you want to delete this book?"))
                        {
                            tmpBook.setStatus(false);
                            book.set(ind, tmpBook);
                        }
                    }
                    break;
                case "4":
                     System.out.print("Input Book ID to find : " );
                    bookId = Integer.valueOf(in.nextLine());
                    ind = searchBook(bookId);
                    if(ind == -1)
                    {
                        System.out.println("Book is not found!");
                        
                    }
                    else
                    {
                        tmpBook = book.get(ind);
                        tmpBook.displayBook();
                        
                    }
                    MyUtil.pressAnyKey();
                    break;
                case "5":
                    for(Book b:book)
                    {
                        b.displayBook();
                    }
                    MyUtil.pressAnyKey();
                    break;
            }
        }while(!cmd.equals("0"));
        
    }
    public void itemMenu()
    {
        Scanner in = new Scanner(System.in);
        String cmd;
        do{
            MyUtil.clearScreen();
            
            System.out.println("Item Management");
            System.out.println("Menu : ");
            System.out.println("1. Add New Item ");
            System.out.println("2. Edit Item ");
            System.out.println("3. Delete Item ");
            System.out.println("4. Search Search ");
            System.out.println("5. List All Items" );
            System.out.println("0. Back ");
            System.out.println("Select your option : ");
            cmd = in.nextLine();
            
            switch(cmd)
            {
                case "1":
                    System.out.print("Input Book ID to add item : " );
                    int bookId = Integer.valueOf(in.nextLine());
                    int ind = searchBook(bookId);
                    if(ind == -1)
                    {
                        System.out.println("Book is not found!");
                        
                    }
                    else
                    {
                        Item tmpItem = new Item();
                        tmpItem.addItem();
                        book.get(ind).addItem(tmpItem);
                        
                    }
                    MyUtil.pressAnyKey();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    for(Book b:book)
                    {
                        System.out.println("Book -------------" );
                        b.displayBook();
                        System.out.println("Item -------------");
                        b.displayAllItem();
                    }
                    MyUtil.pressAnyKey();
                    break;
            }
            
        }while(!cmd.equals("0"));     
    }
    public void patronMenu()
    {
        Scanner in = new Scanner(System.in);
        String cmd;
        do{
            MyUtil.clearScreen();
            
            System.out.println("Patron Management");
            System.out.println("Menu : ");
            System.out.println("1. Add New Patron ");
            System.out.println("2. Edit Patron ");
            System.out.println("3. Delete Patron ");
            System.out.println("4. Search Patron ");
            System.out.println("5. List All Patron " );
            System.out.println("0. Back ");
            System.out.println("Select your option : ");
            cmd = in.nextLine();
            
        }while(!cmd.equals("0"));
        
    }
    public void circulationMenu()
    {
        Scanner in = new Scanner(System.in);
        String cmd;
        do{
            MyUtil.clearScreen();
            System.out.println("Circulation Management");
            System.out.println("Menu : ");
            System.out.println("1. Loan ");
            System.out.println("2. Return ");
            System.out.println("0. Back ");
            System.out.println("Select your option : ");
            cmd = in.nextLine();
            
        }while(!cmd.equals("0"));
        
    }
    public int searchBook(int bookId)
    {
        int i=0;
        for(Book b:book)
        {
            if(b.getBookId() == bookId)
            {
                return i;
            }
            i++;
        }
        return -1;
    }
}
