package testcase;

public class seriesPrint {

	public static int count=1;
	public static void main(String[] args) {
		
		
		seriesPrint.printseries1();
		System.out.println();
		seriesPrint.printseries2();
		System.out.println();
		seriesPrint.printseries3();
		System.out.println();
		seriesPrint.printseries4();
		
		

	}
	
	
	public static void printseries1()
	{
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}	
			
			for(int k=1;k<=(4-i);k++)
			{
				   
				System.out.print("*");
			}   	
		
			System.out.println();
			
		}
		
		
	}
	
	
	
	public static void printseries2()
	{
		
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=(4-i);k++)
			{
				   
				System.out.print("*");
			}   	
		
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}	
			
			
			System.out.println();
			
		}
		
		
	}
	
	
	public static void printseries3()
	{
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=count;j>=1;j--)
			{
				System.out.print(j);
				
			}	
			for(int k=1;k<=(4-i);k++)
			{
				   
				System.out.print("*");
			}   	
		
			
			System.out.println();
			count++;
			
		}
		
		
	}
	
	public static void printseries4()
	{
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}	
			
			for(int k=1;k<=(4-i);k++)
			{
				   
				System.out.print("*");
			}   	
		
			System.out.println();
			
		}
		
		
	}
	
	

}
