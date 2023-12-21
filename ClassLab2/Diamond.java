
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args){
     Scanner a = new Scanner(System.in);
     
     
    int i, j, rows; 
 	System.out.print("Enter Rows =  ");
 	rows = a.nextInt();

    
	for(i = 1; i <= rows; i++)
	{
		for(j = 1; j <= rows - i; j++)
		{
			System.out.print(" ");
		}
        for(j = 1; j <= i * 2 - 1; j++)
        {
            System.out.print("*");
        }
		System.out.print("\n");
	}

    for(i = rows - 1; i > 0; i--)
	{
		for(j = 1; j <= rows - i; j++)
		{
			System.out.print(" ");
		}
        for(j = 1; j <= i * 2 - 1; j++)
        {
            System.out.print("*");
        }
		System.out.print("\n");
	}

 	
}
}
