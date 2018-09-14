package testcase;

import java.math.BigInteger;
import java.util.Base64;

public class base64Conversion {

	public static void main(String[] args) {		

		// encoding to base 64 
		Base64.Encoder encoder = Base64.getEncoder();  
		String str = encoder.encodeToString("98765432109876543210987654321".getBytes());  
        System.out.println("Encoded string: "+str); 
        
        // Decoding  the base 64 
        Base64.Decoder decoder = Base64.getDecoder();  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  

		
	    /*String machineip="203.122.23.126";
		String ip1=machineip.replaceAll("[^0-9]","");		
		Long ipadd=Long.parseLong(ip1);
		System.out.println(ipadd);*/
        
        
		
		
	}

}
