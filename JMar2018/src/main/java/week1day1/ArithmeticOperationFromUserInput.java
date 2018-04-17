package week1day1;

import java.util.Scanner;

public class ArithmeticOperationFromUserInput {

	
	     
	    public static void main(String[] args) {
	        int num1,num2,result;
	        String action;
	        System.out.println("Enter num1:");
	        Scanner scan=new Scanner(System.in);
	        num1=scan.nextInt();
	        System.out.println("Enter num2:");
	        num2=scan.nextInt();
	        System.out.println("Enter the option \n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
	        Scanner scan1=new Scanner(System.in);
	        action=scan1.nextLine();
	        switch(action)
	        {
	        case "Add":
	            result=num1+num2;
	            System.out.println(result);
	            break;
	        case "Subtract":
	            result=num1-num2;
	            System.out.println(result);
	            break;
	        case "Multiply":
	            result=num1*num2;
	            System.out.println(result);
	            break;
	        case "Divide":
	            result=num1/num2;
	            System.out.println(result);
	            break;
	        default:
	            System.out.println("please enter the one from displayed option");
	        }
	       
	        
	    }
}


	        
	      