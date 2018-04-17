package week2day2;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicate {

	public static void main(String[] args) {
		int a[]= {13,15,67,88,65,67,13,13,99,67,65,13,87,13};
		
		Set<Integer> findduplicate=new HashSet<>();
		Set<Integer> result=new HashSet<>();
		for(int b:a)
		{
			if(findduplicate.add(b)==false)
			{
				
				result.add(b);
				
			}
			
		}
		System.out.println("Duplicate numbers are "+result);
		

	}

}
