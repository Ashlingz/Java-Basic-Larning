import java.util.Scanner;

  public class ABABank{

    public static void main(String[] args){
      Bank menu = new Bank();
      System.out.println("--------ABA Bank--------");
      System.out.println("Welcome to our System");
      System.out.println("1-To Input your Name");
      System.out.println("2-To Deposit");
      System.out.println("3-To Withdraw");
      System.out.println("4-To Show Balance");
      System.out.println("5-Exit");


      Scanner s = new Scanner(System.in);
      int inputString;

      do{
          System.out.print("Press: ");
          inputString = s.nextInt();

          switch (inputString) {
          case 1:
          menu.Username();
          break;
          case 2:
          menu.deposit();
          break;
          case 3:
          menu.withdraw();
          break;
          case 4:
          menu.getBalance();   
          break;
          case 5:  
          break;
        } 
      }while(inputString != 5);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    

  }