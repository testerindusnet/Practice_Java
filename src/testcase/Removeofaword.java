package testcase;

public class Removeofaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="i am swarnendu mukherjee from indusnet";
		String replacetext="swarnendu";
			
		int countfulltext=text.length();
		int countsearchtext=replacetext.length();
		
		int search_text_start_position=text.indexOf("swarnendu");		
		
		System.out.println(text.substring(0,search_text_start_position)+text.substring((search_text_start_position+countsearchtext),countfulltext));
	
		

	}

}
