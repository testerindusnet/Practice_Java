package testcase;

public class Palindrome {

	public static void main(String[] args) {
				
		String input="level";
		Palindrome.palindromecheck(input);

	}
	
	
	public static void palindromecheck(String word)
	
	{
		StringBuffer text=new StringBuffer(word);
		String reversetext=text.reverse().toString();
		if(word.equalsIgnoreCase(reversetext))
		
		{
			System.out.println("This word is palindrome");
		}
		else{
			
			System.out.println("This word is  not palindrome");
		}
		
	}

}
