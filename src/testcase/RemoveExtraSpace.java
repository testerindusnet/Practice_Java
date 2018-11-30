package testcase;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		// Remove the extra space from the  word , remove that space when it is more than 1 
		
		
		String text= " i am  Swarnendu";
		String newtext="";
			/*int blankcount=1;
		for(int i=0;i<text.length();i++)
		{
			
			if(text.charAt(i)!=' ')
			{
				
				newtext=newtext+Character.toString(text.charAt(i));
				blankcount=1;
				
			}
			if(text.charAt(i)==' '&&blankcount==1)
			{
				newtext=newtext+Character.toString(text.charAt(i));
				blankcount++;
				
			}
			
			
			
		}*/
		
		newtext=text.replaceAll("\\s+"," ").trim();
		
		System.out.println(text);
		System.out.println(newtext);
		
		/*String s = "    How   are     you?  ";
		String after = s.replaceAll("( +)"," ").trim();
		
		System.out.println(s);
		System.out.println(after);*/
		
	}

}
