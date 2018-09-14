package testcase;

public class Maxlengthword {

	public static void main(String[] args) {
		
		//String word="i am resident of kolkata";
		String word="i am resident of kolkata and my nationality is indian";
		String[]wordarray=word.split(" ");
		int len=0;
		int maxlengthwordposition=0;
		for(int i=0;i<wordarray.length;i++)
		{
		 if((wordarray[i].length())>len)
			{
				
				maxlengthwordposition=i;
				len=wordarray[i].length();	
				
			}
			
		}
		
		System.out.println("Word with Maximum length is : "+wordarray[maxlengthwordposition]+ "(length : "+ wordarray[maxlengthwordposition].length()+")");

	}

}
