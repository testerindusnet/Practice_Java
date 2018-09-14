package testcase;

public class SumofNumfromAlphanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String inputtext="a2AB34RTTY99II00F21$4^7*7-4";
		String inputnum=inputtext.replaceAll("[^0-9]","");
		System.out.println(inputnum);
		int inputlength=inputnum.length();
		for(int i=0;i<inputlength;i++)
		{
			
			sum=sum+Integer.parseInt(String.valueOf(inputnum.charAt(i)));
		}
		
		System.out.println(sum);
		
		

	}

}
