package testcase;

public class Check_Thrice_Repeated_Characters {

	public static void main(String[] args) {
	
		String input="aaabcada";
		int flag=0;
		int count=0;
	    int inputlength=input.length();
		char[]inputarray=new char[inputlength];
		for(int i=0;i<inputlength;i++)
		{
			inputarray[i]=input.charAt(i);
			
		}
		
			for(int j=0;j<inputlength;j++)
			{
				
						for(int k=0;k<inputlength;k++)
						{
							
										
											
											if(inputarray[j]==inputarray[k])
											{
												
												count++;
												//System.out.println("current count : "+ count + "base character is : "+inputarray[j]+" checking  character is : "+inputarray[k]);
												
												
											}
											else{
												
												count=0;
												//System.out.println("current count : "+ count + "base character is : "+inputarray[j]+" checking  character is : "+inputarray[k]);
											}
											
										
								
								if(count==3)
								{
									flag=1;
									
								}
							
						}	
				
				        count=0;
			}		
			
			if(flag>0)
			{
				
				System.out.println("This word have thrice or more repeated characters");
				
			}
			
			else{
				
				System.out.println("This word did not have thrice or more repeated characters");
			}
			
	}

}
