package testcase;

public class ArrayMergePositionWise {

	public static void main(String[] args) {
		int[] arr1=new int[5];
		arr1=new int[]{1,3,5,7,9};
		int[] arr2=new int[5];
		arr2=new int[]{2,4,6,8,10};
		for(int i=1;i<=5;i++)
		{
			if((i%2)!=0)
			{
				
				System.out.print(" "+arr1[i-1]);
				
			}
			else{
				
				System.out.print(" "+arr2[i-1]);
			}
			
			
			
		}

	}

}
