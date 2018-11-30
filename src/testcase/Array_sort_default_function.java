package testcase;

import java.util.Arrays;
import java.util.Collections;

public class Array_sort_default_function {
	
	public static int requiredorderposition=4;
	public static String ordertype="descending";

	public static void main(String[] args) {
		
		if(Array_sort_default_function.ordertype.equalsIgnoreCase("descending"))
		{
		
			Array_sort_default_function.descendingsort();
			
		}
		else {
			Array_sort_default_function.ascendingsort();
			
		}
		
	}
	
	public static void ascendingsort() {
		
		int arr[]=new int[] {7,111,12,31,42,15,16};
		
		Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s\n", 
                          Arrays.toString(arr)); 
        
        
        System.out.println(arr[(Array_sort_default_function.requiredorderposition)-1]);
	}
	
	
	
	public static void descendingsort() {
		
		Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
		

       Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.printf("Modified arr[] : %s\n", 
                          Arrays.toString(arr)); 
        
        
		System.out.println(arr[(Array_sort_default_function.requiredorderposition)-1]);
	}

}
