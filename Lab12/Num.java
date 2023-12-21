
/**
 * Write a description of class Num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Num
{

    private static final int MAX = 10;
    private double[] num;
    
    public Num()
    {
        num = new double[MAX];
    }
    public void inputValue()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls input 10 number: ") ;
        for(int i=0; i<MAX ; i++)
        {
            System.out.print(" Number " + (i+1) + " :" );
            num[i] = in.nextDouble();
        }
        System.out.println("Done..." );
    }
    public void printAll()
    {
        System.out.println("Number in Array: " );
        for(int i=0; i<MAX ;i++)
        {
            System.out.printf(" Number %d = %f \n" , i+1, num[i]);
            
        }
    }
    public void sortBig2Small()
    {
        double temp; 
        for (int i = 0; i < num.length; i++)   
        {  
            for (int j = i + 1; j < num.length; j++)   
            {  
                if (num[i] < num[j])   
                {  
                    temp = num[i];  
                    num[i] = num[j];  
                    num[j] = temp;  
                }  
            }  
        }
        System.out.println("SortNumber Descending:");
        for(int i = 0;i<num.length;i++)
        {
            System.out.printf(" Number %d = %f \n" , i+1, num[i]);
        }
        System.out.println("Done..." );
    }
    public void sortSmall2Big()
    {
        Arrays.sort(num);
        System.out.println("SortNumber Ascending:");
        for(int i = 0;i<num.length;i++)
        {
            System.out.printf(" Number %d = %f \n" , i+1, num[i]);
        }
        System.out.println("Done..." );
    }
    public void searchNum()
    {
        Scanner in = new Scanner(System.in);
        boolean search = false;
        System.out.print(" Search :" );
        double  j = in.nextDouble();

        for(double n:num){
            if(n == j){
                search = true;
                break;
            }
        }
        if(search){
            System.out.println(j+" in array");
        }else{
            System.out.println(j+" not in array");
        }
        
    }


}
