package week5day1;

import java.util.Scanner;

public class StringSwapping {

	public static void main(String[] args) {
		String first="",second="";
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first string:");
        first=scan.nextLine();
        System.out.println("Enter the second string:");
        second=scan.nextLine();
        scan.close();
        
        System.out.println("Strings before swap: First String = " +first + " and Second String = "+second);
         
        first=first+second;
        second=first.substring(0, first.length()-second.length());
        System.out.println(first.substring(0, first.length()-second.length()));
        first=first.substring(second.length());
        System.out.println(first.substring(second.length()));
         
       
        System.out.println("Strings after swap: First String = " + first + " and Second String = " + second);        

	}

}
