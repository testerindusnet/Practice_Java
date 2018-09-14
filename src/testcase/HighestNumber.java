package testcase;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		
		int highest=-1;
		int[] input=new int[5];
		Scanner in =new Scanner(System.in);	
		System.out.println("Enter First Number ");
		input[0]=in.nextInt();
		System.out.println("Enter Second Number ");
		input[1]=in.nextInt();
		System.out.println("Enter Third Number ");
		input[2]=in.nextInt();
		System.out.println("Enter Fourth Number ");
		input[3]=in.nextInt();
		System.out.println("Enter Fifth Number ");
		input[4]=in.nextInt();
		
		int arraysize=input.length;
		
		for(int i=0;i<arraysize;i++)
		{
			if(highest<0)
				
			{
				highest=input[i];
			}
			else{
				
				if(highest<input[i])
					
				{
					
					highest=input[i];
				}
				
			}
		}
		
		System.out.println("Highest Number is : " + highest);
		
	}

}
