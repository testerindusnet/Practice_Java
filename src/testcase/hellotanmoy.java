package testcase;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.firstInMonth;


public class hellotanmoy {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
	/*	String s =new String("Policy Number : PRG/ASD/009");
		int index=s.indexOf(":");
		System.out.println(index);
		String s1=s.substring(index+1);
		System.out.println(s1);*/
		
		
		/*String s1="(Ref. No. PRO17/FV001/000990Q)";  
		int s2=s1.indexOf("P");
		int s5= s1.indexOf(")");
		String s6= s1.substring(s2,s5-1);
		System.out.println(s6);*/
		
		//String s="Mr Ranit Roy";
		/*String s1="Mr";
		String s2="Ranit";
		String s3="Roy";
		String s4=s1+" "+s2+" "+s3;
		System.out.println(s4);*/
		/*String s="Mr Ranit Roy";
	  	String lastname=s.substring(s.indexOf(" ", s.indexOf(" ")+1));
		System.out.println(lastname);
		String fname=s.substring(s.indexOf(" ")+1, s.indexOf(" ", s.indexOf(" ")+1));
		System.out.println(fname);
		String title=s.substring(0,s.indexOf(" "));
		System.out.println(title);*/
		
		/*String s="$2,5550,2330.70";
		
		System.out.println(s);
		
		int p=s.indexOf(".");
		System.out.println(p);
		if(p<0)
		{
			s=s+"."+"00";
			
		}
		System.out.println(s);
		
		String s1=s.replace("$",",");
		System.out.println(s1);
		String s2=s1.replaceAll(",","");
		System.out.println(s2);*/
		
		
		/*
		2 Derwent Crescent, Kidsgrove 
		Stoke-On-Trent 
		Staffordshire 

		Post code-ST74PH  */
		
		
	/*	String address="This is the first line.\n" +
			           "This is the second line.\n" +
			           "This is the third line\n" +
			           "This is the fourth line.\n" +
			           "This is the fifth line."; */
		
		/*String address="2 Derwent Crescent, Kidsgrove\n" + 
						"Stoke-On-Trent\n"+ 
				        "Staffordshire\n"+
						
						"Post code-ST74PH"; 
		System.out.println(address);
		System.out.println("==============================");
		String postcode=address.substring(address.lastIndexOf("Post code-")+10);
		String temp=address.substring(0,address.lastIndexOf("Post code-"));
		String[] words=temp.split("\n");
		String tempadd1="",tempadd2="",tempadd3="";
		
		for(int i=0;i<words.length;i++){
			if(i==0)
				tempadd1=words[i];
			if(i==1)
				tempadd2=words[i];
			if(i==2)
				tempadd3=words[i];
		}
		System.out.println("Address1 value is : "+tempadd1.trim());
		System.out.println("Address2 value is : "+tempadd2.trim());
		System.out.println("Address3 value is : "+tempadd3.trim());
		System.out.println("PostCode  is : "+postcode.trim()); */
		
		
		
		LocalDate now = LocalDate.now(); //2015-11-23
		LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.FRIDAY));
		String date=String.valueOf(firstMonday);
		
		System.out.println(date);
		
	   String[]d=date.split("-");
	   String finaldate=d[2]+"-"+d[1]+"-"+d[0];
	   System.out.println(finaldate);
	   
	  
 
	   
		}
			
			
		}
		
	

	
	
	
	


