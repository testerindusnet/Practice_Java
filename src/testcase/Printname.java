package testcase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Printname {

	public static void main(String[] args) throws IOException {
		
		 /*Scanner sc=new Scanner(System.in); */
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Please Enter text :");
		 String text=reader.readLine();
		 int stringcount=text.length();
		// System.out.println(stringcount);
		 String[]textarray=new String[stringcount];
		/* for(int i=0;i<stringcount;i++){
			 			 
			 textarray[i]=text.substring(i,i+1);
			
			 
		 }*/
		 //System.out.println("Initial Array Elements : "+Arrays.toString(textarray));
		 
		 for(int i=0;i<=stringcount+1;i++){
			 
			 System.out.print("*");
			 
		 }
		 System.out.println("\n");
		 System.out.print("*");
		 System.out.print(text);
		 System.out.print("*");
		 System.out.println("\n");
		 for(int i=0;i<=stringcount+1;i++){
					 
					 System.out.print("*");
					 
					 
				 }


	}

}
