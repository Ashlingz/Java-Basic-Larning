
/**
 * Write a description of class HalfDia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

    public class HalfDia{
        private int x;
        
        public static void main(String[] args){
        
          Scanner sc=new Scanner(System.in);
  
          System.out.println("Enter Number:");
              int r=sc.nextInt();   
 
               int  space = 2*r-1; 
        int star = 0;   
        for(int  j  =  1;  j  <=  2*r-1;  j++){ 
            if(j  <=  r){ 
              space  =  space  -  2; 
              star++; 
            } 
            else  { 
              space  =  space  +  2; 
              star--; 
            } 
            for(int  m  =  1;  m  <=  star;  m++){ 
              System.out.print("*"); 
            } 
            for(int  n  =  1;  n  <=  space;  n++){ 
              System.out.print(" "); 
            }
            for(int  p  =  1;  p  <=  star;  p++){ 
              if(p  !=  r){ 
                    System.out.print("*"); 
                } 
            } 
            System.out.println(); 
 
        }
        
    }
}
