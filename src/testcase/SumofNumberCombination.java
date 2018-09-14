package testcase;

import java.util.ArrayList;

public class SumofNumberCombination {
	
	static ArrayList<Integer> inputlist=new ArrayList<Integer>();
	static ArrayList<Integer> outputlist=new ArrayList<Integer>();

	public static void main(String[] args) {				
			
		    SumofNumberCombination.additemtoinputlist();		
			System.out.println(inputlist);
			SumofNumberCombination.checkaddresult();
			System.out.println(outputlist);
		    System.out.println("Number of pairs are : - "+(outputlist.size())/2);		
	}
		
	
		 public static void removeitem(int number1,int number2)
		 {
			 SumofNumberCombination.inputlist.remove(new Integer(number1));
			 SumofNumberCombination.inputlist.remove(new Integer(number2));			 			 
		 }
 
		 public static void additemtoresultlist(int number1,int number2)
		 {
			/* SumofNumberCombination.outputlist.add(number1);
			 SumofNumberCombination.outputlist.add(number2);*/
			 SumofNumberCombination.outputlist.add(new Integer(number1));
			 SumofNumberCombination.outputlist.add(new Integer(number2));	
		 }
 
		 public static void checkaddresult()
			 {
				for(int i=0;i<inputlist.size();i++)			
					{
						for(int j=0;j<inputlist.size();j++)
						{				
							if(i!=j)
							{	
								if((inputlist.get(i)+inputlist.get(j))==11)
								{
									SumofNumberCombination.additemtoresultlist(inputlist.get(i),inputlist.get(j));
									SumofNumberCombination.removeitem(inputlist.get(i),inputlist.get(j));
									checkaddresult();
									
									
								}
							}
						}
					}
			 }
		 
		 
		 
		 public static void additemtoinputlist()
		 {
			    inputlist.add(1);
			    inputlist.add(1);
				inputlist.add(2);
				inputlist.add(3);
				inputlist.add(4);
				inputlist.add(5);
				inputlist.add(7);
				inputlist.add(8);
				inputlist.add(9);
				inputlist.add(6);
				inputlist.add(3);
				inputlist.add(13);
				inputlist.add(10);
				inputlist.add(12);
		 }
		 
		 
		 
 
 }
 


