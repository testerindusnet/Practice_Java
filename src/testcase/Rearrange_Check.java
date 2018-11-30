package testcase;

public class Rearrange_Check {

	public static void main(String[] args) {
				
		String input1="Selenium";
		String input2="seI";
		int startboundary=0;
		int flag=0;
		
		for(int i=0;i<input2.length();i++)
		{
			input1=input1.toLowerCase();
			String compareword=input2.substring(startboundary, startboundary+1);
				
			if(input1.contains(compareword.toLowerCase()))
			{
				flag=0;
			}
			else {
				
				flag=1;
				break;
			}	
			startboundary++;			
		}		
		
		if(flag==0)
		{
			System.out.println("String can be rearrangable");
		}
		else {
			
			System.out.println("String can not be rearrangable");
		}

	}

}
