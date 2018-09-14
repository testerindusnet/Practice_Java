package testcase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Printarray {

	
	static int iteration=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]element=initial_array_elements();
		
		
		System.out.println("Initial Array Elements : "+Arrays.toString(element));
		
		delete_third_element_and_print_array(element);

	}
	
	
	
	public static int[] initial_array_elements(){
		
		int[]initialelements={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		
		return initialelements;
		
		
	}
	
	public static void delete_third_element_and_print_array(int[]a){
		
		int arrayelementcount=a.length;
		
		
		if (arrayelementcount>2) {
			
		List<Integer> delints = new ArrayList<Integer>();	
		List<Integer> tempints = new ArrayList<Integer>();
		
		for(int k=1;k<=arrayelementcount;k++){
			
			if(k%3!=0){
				
				tempints.add(a[k-1]);
				
			}
			
			else{
				
				delints.add(a[k-1]);
				
			}
			
		}
	
		
		System.out.println("Array Elements removed after iteration "+iteration+": "+Arrays.toString(delints.toArray()));
		System.out.println("Array Elements remain after iteration "+iteration+": "+Arrays.toString(tempints.toArray()));		
		int[]temp = tempints.stream().mapToInt(Integer::intValue).toArray();
		iteration++;
		delete_third_element_and_print_array(temp);
		
	}
	}
}
