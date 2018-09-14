package testcase;

public class Regexvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String text="Efgh1234@";
		  
		// Boolean b=text.matches("((.*)[A-Z](.*){1,})((.*)[a-z](.*){1,})((.*)[0-9](.*){1,})((.*)[$@$!%*?&<>+_-|:;](.*){1,})");
		 Boolean b=text.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$@^~`!%*?\\//'.,&<>+_-|:;]).{1,}");
		  
		 System.out.println(b);
		
	}

}

/* (?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$@^~`!%*?\\//'.,&<>+_-|:;]).{6,20} 

this means  the word should contain Capital letter , small letter, number and special characters and overall size should be
between 6 to 20 characters
"#tom@100#naveen@101#peter@102"

*/