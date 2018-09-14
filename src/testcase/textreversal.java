package testcase;

public class textreversal {

	public static void main(String[] args) {
		
		textreversal.textRevarsalByStringBuffer();
		textreversal.textRevarsalByStringMethod();
		
	}
	
	
	public static void textRevarsalByStringBuffer()
	{
		StringBuffer temp=new StringBuffer("I am Swarnendu Mukherjee");
		System.out.println(temp.reverse().toString());
	}
	
	
	public static void textRevarsalByStringMethod()
	{
		String text="I am Indian";
		String reverse="";
		int textlength=text.length();
		for(int i=(textlength-1);i>=0;i--)
		{
			
			reverse=reverse+text.charAt(i);
			
						
		}
		
		System.out.println(reverse);
		
	}
	
	

}
	

/*String originaltext="I am Swarnendu Mukherjee";
int originaltextlength=originaltext.length();
System.out.println(originaltextlength);
StringBuffer temp=new StringBuffer();
for(int i=0;i<originaltextlength;i++)
{
	
	temp.append(originaltext.charAt(i));
	
}

System.out.println(temp.reverse());
}*/

