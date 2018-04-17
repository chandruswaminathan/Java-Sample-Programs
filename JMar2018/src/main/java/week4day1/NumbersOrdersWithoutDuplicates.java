package week4day1;

import java.util.Arrays;
public class NumbersOrdersWithoutDuplicates {
	public static void main(String[] args) {
		int num=186553;
		String str1="";
		String str = Integer.toString(num);
		for(int i=0;i<=str.length()-1;i++)
		{
			String eachchar = Character.toString(str.charAt(i));
			if(str1.contains(eachchar) == false)
			{
				str1=str1+str.charAt(i);
			}
		}
		char[] charArray = str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
	}
}
