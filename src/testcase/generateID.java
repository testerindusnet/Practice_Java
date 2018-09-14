package testcase;

public class generateID {
	public static void main(String[] args) {
		
		String webid="23456555";
		int countWebId=webid.length();
		for(int i=1;i<=(10-countWebId);i++)
		{		  
			webid="0"+webid;
		}
		Long finalid=Long.parseLong(webid);
		System.out.println(webid);
	}

}


