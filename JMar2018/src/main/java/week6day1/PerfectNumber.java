package week6day1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0,number;
		
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		scan.close();
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==number)
		{
			System.out.println(+number+" is a Perfect Number");
		}
		else
		{
			System.out.println(+number+" is not a Perfect Number");
		}

	}

}
