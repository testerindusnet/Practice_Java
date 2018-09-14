package testcase;

import java.math.BigInteger;

public class sumofNumbers {

	public static void main(String[] args) {
		
		BigInteger num = new BigInteger("987654321998765432109876543210");
		String currentnumber=String.valueOf(num);
		int numlength=currentnumber.length();
         long sumofnumber=0;         
         for(int i=0;i<numlength;i++)        	 
         {        	 
        	 char indnum=currentnumber.charAt(i);        	 
        	 long number=Long.parseLong(String.valueOf(indnum));
        	 sumofnumber=sumofnumber+number;
        	 
         }
         System.out.println(sumofnumber);
         
         long reminder=sumofnumber%10;
         System.out.println(reminder);
         
	}

}
