package testcase;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {		
		DuplicateNumber.duplicateNumberSeperatorone();			
	}	
	
	public static void duplicateNumberSeperatorone(){		
		int[] data = new int[10];
		data=new int[]{1,4,3,4,5,2,9,5,9,8};		
		ArrayList<Integer>duplicate=new ArrayList<Integer>();
		ArrayList<Integer>unique=new ArrayList<Integer>();
		int flag=0;		
		for(int i=0;i<10;i++)
		{			
			for(int j=0;j<10;j++)
			{
				if(i!=j)
				{
					if(data[i]==data[j])
					{
						if(!duplicate.contains(data[i])){
						duplicate.add(data[i]);	
						flag=1;
						}
						else{
							flag=1;
						}
						
					}
						
				}
			}
			
			if(flag==0){
			unique.add(data[i]);
			}
			flag=0;
			
		}
		System.out.println("Duplicate Elements are : "+Arrays.deepToString(duplicate.toArray()));
		System.out.println("Unique Elements are : "+Arrays.deepToString(unique.toArray()));	
	}
}
