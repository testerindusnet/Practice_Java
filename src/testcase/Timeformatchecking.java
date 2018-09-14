package testcase;

public class Timeformatchecking {

	public static void main(String[] args) {
		String timenow="09:36 AM";		
		if(timenow.contains("am")||timenow.contains("AM")||timenow.contains("PM")||timenow.contains("pm"))
		{
			System.out.println("True");
		}
		else{
			
			System.out.println("False");
		}

	}

}
