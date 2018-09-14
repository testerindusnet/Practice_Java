package testcase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Format_Checking {

	public static void main(String[] args) {
		
		if(Date_Format_Checking.validateDate("31/02/2000",1))
		{
			
			System.out.println("valid date format");
		}
		else{
			
			System.out.println("invalid date format");
		}



	}
	
	
	public static boolean validateDate(String date)
	{
		
		String inputarray[]=date.split("/");
		int month=Integer.parseInt(inputarray[1]);
		int day=Integer.parseInt(inputarray[0]);
		boolean flag;
				if(Date_Format_Checking.leapyearchecking(inputarray[2]))
				{			
							if( (month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
								{				
											if(day<=31)
											{
												flag=true;	
												
											}
											else{					
												flag=false;
											}				
								}
										
						else if( (month==4)||(month==6)||(month==9)||(month==11))
								{				
											if(day<=30)
											{
												flag=true;					
											}
											else{
												
												flag=false;
											}
											
								}
										
						else if((month==2))
								{
												if(day<=29)
												{
													flag=true;					
												}
												else{
													
													flag=false;
												}
								}	
											
							else{
												
								 flag=false;
							    }	
				  }
				
				
			else {
				
							if( (month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
							{				
										if(day<=31)
										{
											flag=true;	
											
										}
										else{					
											flag=false;
										}				
							}
						
							else if( (month==4)||(month==6)||(month==9)||(month==11))
							{				
										if(day<=30)
										{
											flag=true;					
										}
										else{
											
											flag=false;
										}
										
							}
						
							else if((month==2))
							{
											if(day<=28)
											{
												flag=true;					
											}
											else{
												
												flag=false;
											}
							}	
							
						else{
											
							 flag=false;
						    }
				
					
				}
		return flag;
	}
	
	
	
	
	


	public static boolean leapyearchecking(String year)
	{
		int yr=Integer.parseInt(year);
		boolean f ;
		
		if(yr % 400 == 0)
        {
            f = true;
        }
        else if (yr % 100 == 0)
        {
            f = false;
        }
        else if(yr % 4 == 0)
        {
            f = true;
        }
        else
        {
            f = false;
        }
		

		
		return f;
	}
	
	
	 public static boolean validateDate(String Date,int k) {

		    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		    sdfrmt.setLenient(false);
		    try {
		      sdfrmt.parse(Date);
		     // System.out.println(Date + " is valid date format");
		      return true;
		    } catch (ParseException e) {
		      //System.out.println(Date + " is Invalid Date format");
		      return false;
		    }

		  }

}
