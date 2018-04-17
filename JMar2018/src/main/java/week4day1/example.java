package week4day1;

public class example {

    public static void main(String[] args) {
        String str = "123456";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
          return reverseString(str.substring(1)) + str.charAt(0);
    }
}