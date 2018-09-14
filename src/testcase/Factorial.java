package testcase;
public class Factorial {
	public static void main(String[] args) {		
		int fact=1;
		for(int i=1;i<=10;i++)
		{			
			for(int j=1;j<=i;j++)
			{								
				fact=fact*j;	
			}			
			System.out.println("Factorial of "+i+ " is :" + fact);
			fact=1;	
		}
	}
}
