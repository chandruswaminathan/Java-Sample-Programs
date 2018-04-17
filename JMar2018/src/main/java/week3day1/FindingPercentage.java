package week3day1;


import java.util.Scanner;

public class FindingPercentage {
	 static double lowercharCount = 0;
     static double numCount = 0;
     static double uppercharCount = 0;
     static double others=0;
     static double totalChar=0;
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        totalChar=s.length();
        input.close();
        

        for (int i = 0; i < s.length(); i++) {  
            char ch = s.charAt(i);  
            if (Character.isUpperCase(ch)) {  
            	uppercharCount++;  
            }  
            else if (Character.isLowerCase(ch)) {  
            	lowercharCount++;  
            }  
            else if (Character.isDigit(ch)) {  
            	numCount++;  
            }  
            else {  
                others++;  
            }  
        }
             
            uppercharCount = (uppercharCount * 100) / totalChar;  
            lowercharCount = (lowercharCount * 100) / totalChar;  
             numCount = (numCount * 100) / totalChar;  
             others = (others * 100) / totalChar;
              
             
             System.out.println("Uppercase letters are " + (double)Math.round(uppercharCount * 100) / 100 + "% ");  
             System.out.println("Lowercase letters are " + (double)Math.round(lowercharCount * 100) / 100 + "%");  
             System.out.println("Digits Are " + (double)Math.round(numCount * 100) / 100 + "%");  
             System.out.println("Other Characters Are " + (double)Math.round(others * 100) / 100 + "%");  
             
               }

    }


   
