package testcase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeConcept {

	public static void main(String[] args) {
		
		String time=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		String min=time.substring(3, 5);
		System.out.println(min);
		

	}

}
