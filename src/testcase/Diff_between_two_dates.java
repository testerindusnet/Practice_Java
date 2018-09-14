package testcase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Diff_between_two_dates {

	public static void main(String[] args) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String dateBeforeString = "03/01/2016";
		 String dateAfterString = "19/07/2016";

				 try {
				       Date dateBefore = myFormat.parse(dateBeforeString);
				       Date dateAfter = myFormat.parse(dateAfterString);
				       long difference = dateAfter.getTime() - dateBefore.getTime();
				       float daysBetween = (difference / (1000*60*60*24));
				       int days_between=Math.round(daysBetween);
			               /* You can also convert the milliseconds to days using this method
			                * float daysBetween = 
			                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
			                */
				       System.out.println("Number of Days between dates: "+days_between);
				 } catch (Exception e) {
				       e.printStackTrace();
				 }
				 


				 
				 
				 
	   }

}


