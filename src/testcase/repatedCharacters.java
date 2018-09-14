package testcase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class repatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();  
		String text="aab bhh c ha a at y y y";
		int textlength=text.length();
		int count=0;
		for(int i=0;i<textlength-1;i++)
		{			
			for(int k=0;k<textlength;k++)
			{
				
				if((text.charAt(i)==text.charAt(k))&&(text.charAt(i) != ' '))
				{
					count++;
				}
			}
			if(count>1)
			{
				hm.put(Character.toString(text.charAt(i)),count);
				count=0;
			}
			
			
		}
		
		 System.out.println(hm);  
		
	/*	String value = "aabbhh ha c a at y yy";
		int flag = 0;
		Map<Character, Integer> map = new HashMap();
		for(int i=1;i<value.length();i++)
		{			
			for(int j=0;j<value.length();j++)
			{

				if (value.charAt(i) == value.charAt(j)) {
					flag++;
				}

			}
			if (value.charAt(i) != ' ')
				map.put(value.charAt(i), flag);
			flag = 0;
		}
		System.out.println("For Map " + map);
	*/
		
	}

}
