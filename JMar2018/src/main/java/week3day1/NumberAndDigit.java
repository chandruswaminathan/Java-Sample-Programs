package week3day1;

import java.util.Scanner;

public class NumberAndDigit {

	public static void main(String[] args) {
		int digit=0,number=0;
		System.out.println("Enter a digit:");
		Scanner scan=new Scanner(System.in);
		digit=scan.nextInt();
		System.out.println("Enter a number:");
		number=scan.nextInt();
		scan.close();
		char c = Integer.toString(digit).charAt(0);
		 
        
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                
 
                System.out.println(i); 
                break;
            }
        }
 
       
    
	}

}
