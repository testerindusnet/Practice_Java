package testcase;

public class Two_String_length_Compare_And_Concat_Or_Reduce {

	public static void main(String[] args) {

      System.out.println(Two_String_length_Compare_And_Concat_Or_Reduce.compareandaction("WestBengal","Maharastra"));

	}
	
	
	public static String compareandaction(String input1,String input2)
	{
		
		String output="";
				if(input1.length()==input2.length())
				{
					
					output=input1+input2;
					
				}
		
				if(input1.length()<input2.length())
					
				{
					int dif=input2.length()-input1.length();
					input2=input2.substring(dif);
					output=input1+input2;
				 	
				}
				
				if(input1.length()>input2.length())
					
				{
					int dif=input1.length()-input2.length();
					input1=input1.substring(dif);
					output=input1+input2;
				 	
				}
		
		
		
		return output;
		
		
	}

}
