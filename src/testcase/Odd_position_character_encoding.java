package testcase;

public class Odd_position_character_encoding {

	public static void main(String[] args) {
		
		String input="SWARNENDU";
		String decodedoutput="";
				
		for(int j=1;j<=input.length();j++)
		{
			
			if(j%2==0)
			{
				
				decodedoutput=decodedoutput+input.charAt(j-1)
						;
				
			}
			else if (input.charAt(j-1)!=' '){				
				
				//char decodechar=Odd_position_character_encoding.charencoding(input.charAt(j-1));
				char decodechar=Odd_position_character_encoding.char_encoding(input.charAt(j-1));
				decodedoutput=decodedoutput+decodechar;
				
			}
			
			
			
		}
		
		
		System.out.println(decodedoutput);
		
		
		

	}
	
	public static char charencoding(char c)
	{
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		int count=0;
		char[] alphabetlist=alphabets.toCharArray();
		for(int i=0;i<alphabets.length();i++)
		{
			if(c==alphabetlist[i] && c!=' ')
			{
				if(i==(alphabets.length()-1))
					{
					       count=-1;					      
					       break;
					}
					else{
					count=i;
					break;
					}
				
			  }
			
		}
		
		char decodedchar=alphabetlist[count+1];	
		
		return decodedchar;
	}
	
	
	public static char char_encoding(char c)
	
	{
		int aschicode;
		char decodechar;
		aschicode=(int)c;
		
		if((aschicode>=97 && aschicode<=121) ||(aschicode>=65 && aschicode<=89))
		{
			
			aschicode++;
		}
		else if(aschicode==122)
		{
			aschicode=97;
		}
		else{
			
			aschicode=65;
			
		}
		
		decodechar=(char)aschicode;
		return decodechar;
		
	}

}
