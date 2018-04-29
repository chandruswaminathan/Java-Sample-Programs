package week9day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	
	public static void main(String[] args) {

		String value="will i succeed in interview?";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] c=value.toCharArray();
		System.out.println(c.length);
		for(int i=0;i<c.length;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], 1);
			}
			else
				map.put(c[i], map.get(c[i])+1);
			
		}
		for(Entry<Character, Integer> maps:map.entrySet())
		{
			System.out.println("The value "+maps.getKey()+" is "+maps.getValue());
		}
		
		

	}

}
