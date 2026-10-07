/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   This program demonstrates the use of concatenating strings.
   ie sticking them together
*/

class concatstrings
{
    public static void main (String[] param)
    {		
        buildMessage();
        
        return;
    } // END main


	
    /* *************************************************** */
	// Build a message by concatenating (ie joining) two strings together
	//
    public static void buildMessage ()
    {
        // first create three variables, one for each piece of the final message
        // and another to hold the final combined message
        String name;
        String fact;
        String full_message;
        
        // set the first two variable to particular strings
        name = "Debbie Harry";
        fact = " is still the coolest lead singer ever.";
        
        // then combine them using + to stick them end to end
        full_message = name + fact;
        
        // print out the final result
        System.out.println(full_message);
        //Note giving the variable name here is as though the whole message was typed here
        return;
     } // END buildMessage

} // END class concatstrings
