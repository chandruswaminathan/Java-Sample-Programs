package week3day1;

import java.util.Scanner;

public class FindingSum {

	
		 public static void main(String[] args) {
		        int number=0,temp=0;
		        System.out.println("Enter a number:");
		        Scanner scan=new Scanner(System.in);
		        number=scan.nextInt();
		        scan.close();
		        for(int i=1;i<number;i++)
		        {
		            if(i%3==0 || i%5==0)
		            {
		                temp=temp+i;
		               
		               
		            }
		           
		        }
		        System.out.println("The sum of multiples of 3 or 5 less than "+number+" is"+temp);
		 

	}

}
