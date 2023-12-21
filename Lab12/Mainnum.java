
/**
 * Write a description of class Mainnum here.
 * javac Mainnum.java
 * java Mainnum
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Mainnum
{
    public static void main(String args[])
    {
        Num menu = new Num();
        
        System.out.println("Pree 0 to Exit");
        System.out.println("Pree 1 to Add Number");
        System.out.println("Pree 2 to Sort Desc to Asc");
        System.out.println("Pree 3 to Sort Asc to Desc");
        System.out.println("Pree 4 to Search Number");
        System.out.println("Pree 5 to Display");
        System.out.println("_______________________________________________");
        
        Scanner s = new Scanner(System.in);
      int inputString;

      do{
          System.out.print("Press: ");
          inputString = s.nextInt();

          switch (inputString) {
          case 1:
          menu.inputValue();
          break;

          case 2:  
          menu.sortBig2Small();
          break;

          case 3: 
            menu.sortSmall2Big();
          break;

          case 4:
          menu.searchNum();
          break;

          case 5:
          menu.printAll();
          break;

          case 0:  
          break;
        } 
      }while(inputString != 0);
    }
}
