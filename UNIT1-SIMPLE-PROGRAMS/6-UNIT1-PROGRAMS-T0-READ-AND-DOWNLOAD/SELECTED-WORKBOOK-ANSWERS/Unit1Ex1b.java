/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023
   
   Prints a Clint Eastwood welcome. "Go ahead Punk Make my day!"
   UNIT 1 Exercise 1b
   This is adapted from the hellovariable1 program.

   - Changed the string value stored in Variable myWelcome
   - Comments throughout have been updated for the new program.
   - Changed the program name and the file name it is stored as as its a new program

   See the program DirtyHarrymessage for a much better version
*/

class Unit1Ex1b // Need to change the program name (and the file name to match)
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
        String myWelcome;
        
        myWelcome = "Go ahead Punk. Make my day!";
		                 // Only the value of the string stored in the variable is changed
        System.out.println(myWelcome);
		return;
    } // END storeHelloMessage
	
} // END class Unit1Ex1b
