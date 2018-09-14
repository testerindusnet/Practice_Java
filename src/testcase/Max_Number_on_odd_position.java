package testcase;

public class Max_Number_on_odd_position {
	
	public static int max=0;
	public static void main(String[] args) {
		
		String inputnumber="21324536198";
		int[] inputset=new int[inputnumber.length()];
		for(int i=0;i<inputnumber.length();i++)
		{
			
			inputset[i]=Integer.parseInt(String.valueOf(inputnumber.charAt(i)));
		}
		
	        for(int j=1;j<=inputnumber.length();j++)
	        {
	        	
		        	if(j%2!=0)
		        	{        		
		        		Max_Number_on_odd_position.maxnumber(inputset[j-1]);        		
		        		
		        	}
	        }
        
        System.out.println("Max Number At Odd Position is : " + max);		
	}
	
	
	public static void maxnumber(int num)
	
	{		
		if(num>max)
		{
			max=num;
		}
	}

}
