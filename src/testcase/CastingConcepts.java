package testcase;

public class CastingConcepts {

	public static void main(String[] args) {
	
		Child c= new Child();
		/*Parent p=(Child)c;*/
		Parent p=new Child();	
		//Parent p1=new Parent();
		Parent p1=c;
		//Child c1 = p;
	
		
		
		
		p.test();
		c.test();
		p1.test();
		//c1.test();

		
		

	}

}
