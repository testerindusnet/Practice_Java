package testcase;

public class stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="World";
		String b="Hello";
		
		System.out.println("String before Swap ");
		System.out.println("First Variable :"+ a + " Second Variable :"+ b);
		
		int lengthoffirstvar=a.length();
		int lengthofsecondvar=b.length();
		
		
		StringBuffer s=new StringBuffer(a);
		
		
		s=s.append(b);
		a=s.substring(lengthoffirstvar, lengthoffirstvar+lengthofsecondvar);
		
		b=s.substring(0, lengthoffirstvar);
		
		System.out.println("String after Swap ");
		System.out.println("First Variable :"+ a + " Second Variable :"+ b);
		
		

	}

}
