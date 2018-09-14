package testcase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Unique_triplets {

	 public static void main(String[] args) {
		int[]element=initial_array_elements();
		
		
		System.out.println("Initial Array Elements : "+Arrays.toString(element));
		
		findtriplets(element);

	}
	
	
    public static int[] initial_array_elements(){
		
		int[]initialelements={1, -6, 4, 2, -1, 2, 0, -2, 0 ,-3,5};
		
		return initialelements;
		
		
	}
    
    public static void findtriplets(int[]a){
    	int arrayelementcount=a.length;
    	System.out.println(arrayelementcount);
    	//List<Integer> tempints = new ArrayList<Integer>();
    	
    		for(int k=0;k<arrayelementcount-2;k++)
    		{    			    		
    			for(int j=k+1;j<arrayelementcount-1;j++){
    		
    				if ((Math.abs(a[k]))!=(Math.abs(a[j]))){    					
    				
    					for(int m=j+1;m<arrayelementcount;m++){
    						
    						if ((Math.abs(a[k]))!=(Math.abs(a[m]))&&(Math.abs(a[j]))!=(Math.abs(a[m]))){
    							
	    					//System.out.println("Element1 : " + a[k]+" Element2 : "+a[j]+ " Element3 : "+a[m]);
			    					
					    					  if((a[k]+a[j]+a[m])==0)
					    							  
					    							  {
					    						  
					    						  System.out.println(" Triplet Element1:" + a[k]+" Element2: "+a[j]+ " Element3 : "+a[m]);
					    						 /* tempints.add(a[k]);
					    						  tempints.add(a[j]);
					    						  tempints.add(a[m]);
					    						  System.out.println("Elements "+Arrays.toString(tempints.toArray()));*/
					    							  }
			    			
			    					}
    						
	    						else{
	    	    					
	    	    					continue;
	    	    					
	    	    				  }
    					
    					}
    					
    				}		
    				
	    				else{
	    					
	    					continue;
	    					
	    				}
    					
    					
    					
    					
    			  }
    				
    			}
    		
    		//int[]temp = tempints.stream().mapToInt(Integer::intValue).toArray();
    			
    		}	
    		
     }			
    				
    				
    				

    	
    	
    	
    	

    
    


