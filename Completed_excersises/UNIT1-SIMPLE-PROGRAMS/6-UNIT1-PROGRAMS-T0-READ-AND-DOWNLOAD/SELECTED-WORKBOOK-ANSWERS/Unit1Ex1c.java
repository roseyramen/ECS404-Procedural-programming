/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   Prints a Clint Eastwood welcome. "Go ahead Punk Make my day!"
   UNIT 1 Exercise 1c
   This is adapted from the hellovariable1b program.

   CHANGES
   - Changed the name of the Variable myWelcome to happymessage as required
   - Changed the program name and the file name it is stored as as its a new program

   See the program DirtyHarrymessage for a much better version of this program
*/

class Unit1Ex1c 
{
    public static void main (String[] param)
    {		
        storeHelloMessage();
        
        return;
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
 	// Print a Clint message
 	// 	
    public static void storeHelloMessage ()
    {
        String happy_message;
        
        happ_ymessage = "Go ahead Punk. Make my day!";
		                 // Only the value of the string stored in the variable is changed
        System.out.println(happy_message);
        
		return;
    } // END storeHelloMessage
	
} // END class Unit1Ex1c
