package week6day1;

import java.util.Scanner;

public class NumberInStarPattern {

	public static void main(String[] args) {
		int row;
		System.out.println("Enter the number of row:");
		Scanner x =new Scanner(System.in);
		row=x.nextInt();
		for(int i=1;i<=row;i++)
		{
			int number=1;
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println("");
		}
		for(int i=row-1;i>=1;i--)
		{
			int number=1;
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println("");
		}
		x.close();
	}

}
