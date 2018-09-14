package testcase;

public class Non_repeated_Characters_in_Word {

	public static void main(String[] args) {
				
		String input="abcea byuipoc";
		String nonrepeatedchar="";
		int flag=0;
		int inputlength=input.length();
		char[] chars=new char[inputlength];
		for(int i=0;i<inputlength;i++)
		{
			
			chars[i]=input.charAt(i);			
		}
		
				for(int j=0;j<inputlength;j++)
				{
					
							for(int k=0;k<inputlength;k++)
							{
								
										if(j!=k)
											
										{
											if(chars[j]==chars[k])
											{
												
												flag=1;
												
											}
											
										}	
										
								
							
								}
					
					
					if(flag==0 && chars[j]!=' ')
					{
						nonrepeatedchar=nonrepeatedchar+chars[j];
						
						
					}	
					
					flag=0;
			
				
			}	
				System.out.println("Non repeated characters are :  "+nonrepeatedchar );	
				System.out.println( "Non repeated character count is : " + nonrepeatedchar.length());
			
		}
	
	}


