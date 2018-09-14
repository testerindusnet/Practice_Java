package testcase;

import java.util.ArrayList;

public class NameandNumberSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> names=new ArrayList<String>();
		 	ArrayList<Integer> id=new ArrayList<Integer>();
			 String str="tom@100#naveen@101#peter@102#steve@103";
			 String[] tempstr=str.split("#");
			  for(String temp1:tempstr)
			 {		
				  String[] temparr=temp1.split("@");
				  for(int i=0;i<temparr.length;i++)
				  {
					   try
					   {
					    id.add(Integer.parseInt(temparr[i]));	
					   }
					   catch(Exception e)
					   {
					    names.add(temparr[i]);
					   }
				 }
		   }
		System.out.println(names);
		System.out.println(id);
	}
}