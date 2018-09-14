package testcase;

import java.util.Arrays;

public class SortingAlgo {
	
	static int[] number=new int[]{14,33,10,9,27,35,11};

	public static void main(String[] args) {
		//SortingAlgo.BubbleSort();
	    SortingAlgo.SelectionSort();
		//SortingAlgo.insertionsort();
	}	
	
	public static void BubbleSort()
	{
	  
		  for(int i=0;i<(number.length);i++)
			 {
				for(int j=0;j<(number.length)-1;j++)
				{				
				  if(number[j]>number[j+1])
					{
						int temp=number[j+1];
						number[j+1]=number[j];
						number[j]=temp;
					}					
				}				
			 }				
		System.out.println(Arrays.toString(number));		
	}

		public static void SelectionSort()
		{
		      //int min=0;
			  for(int i=0;i<(number.length)-1;i++)
				 {		  
					for(int j=i+1;j<number.length;j++)
					{	
						System.out.println("Comparing numbers "+number[i] + " with "+ number[j]);
						if(number[i]>number[j])
						{
							int temp=number[j];
							number[j]=number[i];
							number[i]=temp;					
							
						}				
					}	
				 }	
				
			System.out.println(Arrays.toString(number));		
		}
		
		
		
		public static void insertionsort(){
			
			int i, j, key;
			for (i = 1; i <(number.length); i++) 
			{
				j = i;
				System.out.println("iteration " + j);
				System.out.println("Comparing numbers "+number[j-1] + " with "+ number[j]);
					while (j > 0 && number[j - 1] >number[j]) 
					{
						key = number[j];
						number[j] =number[j - 1];
						number[j - 1] = key;
						j--;
					}
			}
			
			
			System.out.println(Arrays.toString(number));
		}

}



