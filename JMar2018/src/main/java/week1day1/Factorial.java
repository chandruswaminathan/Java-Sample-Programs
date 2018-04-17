package week1day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact=1,inputNum=0,i=1;
		System.out.println("Enter the number to find factorial");
		Scanner scan=new Scanner(System.in);
		inputNum=scan.nextInt();
		if(inputNum!=0)
		{
		while(i<=inputNum)
		{
			fact=fact*i;
			i=i+1;
		}
		
		System.out.println("The factorial of "+inputNum+" is "+fact);
	}
		else
			System.out.println("Please Enter a valid number");

}
}
