/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

   Converts a length of time given
   in days to a length of time in minutes. 
   For example 1 day would be
   converted to 1440 minutes (as 1x60x24=1440).
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class daysminutes
{
    public static void main (String[] param)
    {
		convertDaysToMinutes();
		
		return;	
    } // END main
	
	/* ***************************************************
	   Get a number of days from the user and print
	   the corresponding number of minutes.
	*/
	
    public static void convertDaysToMinutes()
    {
	   // constant multipliers for hours in a day and minutes in an hour
	   final int HOURS_IN_DAY = 24;
       final int MINS_IN_HOUR = 60;

       int days;     // a length of time in days
       int minutes;  // the same length of time in minutes  	   
 	   String answer_text;  // construct the text to give the answer back 
	   
	   // Get a number of days from the user 
	   //
       days = inputTimeInterval();

       // Now do the calculation
	   // multiply minutes in an hour by hours in a day
	   //
       minutes = days *  MINS_IN_HOUR * HOURS_IN_DAY;
	   
	   answer_text = days + " days is "+ minutes + " minutes"; 

	   // Finally give the user the answer
	   //   
	   System.out.println(answer_text);  
	   
	   return;
    } // END convertDaysToMinutes

   
    /* *************************************************** */
    //   This method gets a time interval in days from the user and returns it
    //
    public static int inputTimeInterval()
    {
       Scanner scanner = new Scanner(System.in);
       int time_interval;

       System.out.println("What is the time interval in days?");
       time_interval = Integer.parseInt(scanner.nextLine());
   
       return time_interval;
    } // END inputTimeInterval
	
} // END class daysminutes
