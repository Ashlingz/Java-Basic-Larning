
/**
 * Write a description of class X here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class X
{
    
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Rows : ");
	int n=sc.nextInt();	 
 
        int k=n*2-1;
 
	for(int i=1;i<=k;i++)
               {
                    
	        for(int j=1;j<=k;j++)
                
                        {      if(j==i || j==k-i+1)
                               System.out.print("*");
                                System.out.print(" ");
                                 
		 
                    	
                           }
		 
    
	 System.out.println();
	    
               }            
           
 
                
    }

}
