
package testcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alternate_add_subtract_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=9;
		int count=1;
		int counter=1;
		int result=1;
		String inputString="";
		System.out.print ( "Enter the input Number: " );
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in)); 
		try {
			 inputString = input.readLine();
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		int inputnumber=Integer.parseInt(inputString);
		
		while(count<=inputnumber)
		{			
			if(count>1&&count%2!=0)
				{
						if(counter%2!=0)
						{
							result=result+count;
						}
						else{
							result=result-count;
											
						}					
						counter++;
				}
				
				count++;
		}
		
		System.out.println("Result of odd numbers add and subtract is : " + result);

	}

}
