package testcase;

public class String_reverse_and_parse {

	public static void main(String[] args) {
		
		String word="Computer";
		String reverseword="";
		for(int i=(word.length())-1;i>=0;i--)
		{
			if(i>0){
			reverseword=reverseword+word.charAt(i)+"-";
			}
			else{
				reverseword=reverseword+word.charAt(i);				
			}
		
		}
		
		System.out.println(reverseword);
	}

}
