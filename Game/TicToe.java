/**
 * Write a description of class MultiArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;

public class TicToe
{   final static int MAX = 10;
    
    public static void main(String args[])
    {
        char[][] gameboard = new char[MAX][MAX];
        boolean player = true;
        
        for(int i=0;i<MAX;i++)
        {
            for(int j=0;j<MAX;j++)
            {
                gameboard[i][j] = '_';
            }
        }
        Scanner in = new Scanner(System.in);
        String cmd = "";
        do
        {
            MyLib.clearConsole();
            System.out.println("Welcome to Tic Toe Game!") ;
            System.out.print("  ");
            for(int i=0;i<MAX;i++)
                System.out.print((i) + " ");
            System.out.println("");
            for(int i=0;i<MAX;i++)
            {
                System.out.print(i + "  ");
                for(int j=0;j<MAX;j++)
                {
                    System.out.print(gameboard[i][j] + " " );
                }
                System.out.println("");
            }
            if(player)
            {
                System.out.print("Player 1 (x,y) :  " );
            }
            else
            {
                System.out.print("Player 2 (x,y) : " );
            }
            char winner = checkWinner(gameboard);
            if(winner != '_')
            {
                System.out.println("Winner is " + winner);
                break;
            }  
            
            cmd = in.nextLine();
            if(cmd.equals("x"))
            {
                break;
            }
            String[] ind = cmd.split(",");
            int x = Integer.parseInt(ind[0]);
            int y = Integer.parseInt(ind[1]);
            if(gameboard[x][y] == '_')
            {
                player = !player;
                if(player)
                {
                    
                        gameboard[x][y] = 'X' ;
                        
                }
                else
                {
                    gameboard[x][y] = 'O' ;
                }
            }
            else
            {
                System.out.println("Block is already marked.");
                System.out.println("Press any key to mark again...");
                in.nextLine();
            }
             
        }while(!cmd.equals("x"));
    }
    
    public static char checkWinner(char[][] gameboard)
    {
       char winner = '_';
       boolean searchX = true;
       boolean searchY = true;
       boolean searchXY = true;
       for(int i=0; i<MAX; i++)
       {
           for(int j=0; j<MAX; j++)
           {
               if(gameboard[i][j] != '_')
               {
                   winner = gameboard[i][j];
                   for(int y=0; y<3;y++)
                   {
                       if(j+y <= MAX && searchX)
                       {
                           if(!(winner == gameboard[i][j+y]))
                           {
                                 searchX = false;
                           }
                        }
                       if(i+y <= MAX && searchY)
                       {
                           if(!(winner == gameboard[i+y][j]))
                           {
                               searchY = false;
                           }
                       }
                       if(i+y <=MAX && j+y <=MAX && searchXY )
                       {
                           if(!(winner == gameboard[i+y][j+y]))
                           {
                               searchXY = false;
                           }
                        }
                   }
                   if(searchX ||  searchY || searchXY)
                   {
                       return winner;
                   }
                }
            }
       }
       return '_'; 
    }
    
}
