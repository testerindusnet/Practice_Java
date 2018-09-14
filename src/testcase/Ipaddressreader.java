package testcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ipaddressreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Systemipaddress;
		long result = 0;
		try {
			URL url=new URL("http://bot.whatismyipaddress.com/");
			try {
				BufferedReader sc=new BufferedReader(new InputStreamReader(url.openStream()));
				Systemipaddress=sc.readLine().trim();
				System.out.println("System ip address is - "+Systemipaddress);
				String ip=Systemipaddress.replaceAll("[^0-9]","");		
				Long ipadd=Long.parseLong(ip);
				System.out.println("System ip address withoutdot - "+ipadd);
				String[] ipAddressInArray = Systemipaddress.split("\\.");
		    	
		    	for (int i = 0; i < ipAddressInArray.length; i++) {
		    		int power = 3 - i;
		    		result += (Integer.parseInt(ipAddressInArray[i]) % 256 * Math.pow(256, power));	
		    		
		    	}
		    	
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ip converted to decimal - "+result);

	}

}
