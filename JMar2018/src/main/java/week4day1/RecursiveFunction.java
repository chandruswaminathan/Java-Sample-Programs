package week4day1;

public class RecursiveFunction {

    public static void main(String[] args) {
    	String reversed = null;
    	String str = "welcome";
        if (str.isEmpty())
            System.out.println("Please enter a valid input");
        else
        	reversed=(str.substring(1)) + str.charAt(0);
        System.out.println(reversed);
        
    }

   }