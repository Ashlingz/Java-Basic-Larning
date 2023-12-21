
/**
 * Write a description of class Infinity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Infinity
{
    public static void main(String[] args){
        
        int i, j, k;
        Scanner a = new Scanner(System.in);
    
    
    for(i = 1;i <= 5;i++){
        for(j = 1;j <= i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    for(i = 1;i <= 4;i++){
        for(j = i;j <= 4;j++){
        System.out.print("*");
        }
        System.out.print("\n");
    }
    
    
    for(i = 1;i <= 5;i++){
        for(j = 5;j > i;j--){
            System.out.print(" ");
        }
    for(k = 1;k <= j;k++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    for(i = 1;i <= 4;i++){
        for(j = 1;j <= i;j++){
            System.out.print(" ");
        }
            for(k = 4;k >= i;k--){
                System.out.print("*");
            }
        System.out.print("\n");
    }

}
    
    }
    
    
    


