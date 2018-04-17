package week4day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="Hello World";
		String str1="";
		for(int i=0;i<=str.length()-1;i++)
		{
			String eachchar = Character.toString(str.charAt(i));
			CharSequence space =" ";
			if(str1.contains(eachchar) == false && eachchar.contains(space) ==false)
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
