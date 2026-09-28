/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   This program prints a message about the pop group Blondie
   in a popup box

   It demonstrates the use of concatenating strings.

   It is modified from concatstrings.java
   CHANGES
   - Create a new variable fact2
   - Store the string value about Blondie in it
   - concatenate ('add') the new variables value on to the end of
     the value built up to place in variable fullmessage.
   - changed the name of the program
   - changed the comments

   - Note as the name Blondie is in a variable we have used that variable to make the new message
   - Also note the extra \n added at the end of message1 that starts a new line
    to make sure the sentences are on different lines.

   - A better still version would use better variable names for the message variables.
*/

import javax.swing.*;

class Unit1Ex1d
{
    public static void main (String[] param)
    {		
        varBuildMessage();
        
        return;
    } // END main
	

    /* *************************************************** */
	// Build a Blondie message as strings concatenated
	//
    public static void varBuildMessage ()
    {
        // first create four variables, one for each piece of the final message
        // and anothers to hold the final combined message
        String message1;
        String message2;
        String fact2;
        String full_message;
        
        // set the first three variable to particular strings giving facts
        message1 = "Blondie";
        message2 = " is still the coolest lead singer ever.\n";
        fact2 = " are the greatest band ever.";
        
        // then combine them using + 
        //Note message1 is used twice now to get the name of the band/singer
        full_message = message1 + message2 + message1 + fact2;
        
        // print out the final result
        JOptionPane.showMessageDialog(null, full_message);
        //Note giving the variable name here is as though the whole message was typed here

     } // END varBuildMessage

} // END class Unit1Ex1d