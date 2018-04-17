package week3day1;

import java.util.Scanner;

public class ValidatePassword {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "\n1. A password must have at least ten characters." +
                "\n2. A password consists of only letters and digits." +
                "\n3. A password must contain at least two digits and two characters" +
                "\n4.A Password must contain at least one capital letter" +
                "\nInput a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
        input.close();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < 10) return false;

        int lowercharCount = 0;
        int numCount = 0;
        int uppercharCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) lowercharCount++;
            else if (is_Capital(ch)) uppercharCount++;
            else return false;
        }


        return (lowercharCount >= 2 && numCount >= 2 && uppercharCount>=1 );
    }

    public static boolean is_Letter(char ch) {
        
        return (ch>='a'&&ch<='z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');

	}
    
    public static boolean is_Capital(char ch) {
    	
		return ((Character.isUpperCase(ch)));

	}

}
