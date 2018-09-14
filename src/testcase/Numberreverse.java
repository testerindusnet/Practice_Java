package testcase;

import java.util.Scanner;

public class Numberreverse {

	static int reverse=0;
	public static void main(String[] args) {
		//int input=6545;
		System.out.println("Enter a number to reverse");
	    Scanner in = new Scanner(System.in);
	    int input = in.nextInt();
		int reverseinput=Numberreverse.reverseNumber(input);
		System.out.println(reverseinput);
		

	}
	
	public static int reverseNumber(int inputnumber)
	{
			
		if(inputnumber>0)
		{   
			reverse=reverse*10;
			reverse=reverse+inputnumber%10;
			reverseNumber(inputnumber/10);
			
		}
		
		return reverse;
	}

}
