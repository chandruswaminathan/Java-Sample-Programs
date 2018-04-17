package week2day2;

import java.util.Scanner;

public class FloydTriangle
{
    public static void main(String args[])
    {
       int i=0, num = 1,n=0,j=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of rows for floyd's triangle:");
       n = input.nextInt();
       input.close();
       for ( i = 1 ; i <= n ; i++ )
       {
           for ( j = 1 ; j <= i ; j++ )
           {
                System.out.print(num+" ");
                num++;
           }
           System.out.println();
       }
   }
}