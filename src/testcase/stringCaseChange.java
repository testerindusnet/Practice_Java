package testcase;

public class stringCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="SWARNENDU";
		String modifiedtext="";		
		
		
		int stringlength=text.length();
		System.out.println(text);
		
		for(int i=1;i<=stringlength;i++)
		{
			
			if(i%2==0)
			{
				
				char t=text.charAt(i-1);
				String temp=Character.toString(t);
				modifiedtext=modifiedtext+temp.toUpperCase();
				//modifiedtext=modifiedtext+temp.toLowerCase();
				
				
			}
			else{
				
				char t=text.charAt(i-1);
				String temp=Character.toString(t);
				modifiedtext=modifiedtext+temp.toLowerCase();
				//modifiedtext=modifiedtext+temp.toUpperCase();
			}
			
		}
		
		System.out.println(modifiedtext);
		
	}

}
