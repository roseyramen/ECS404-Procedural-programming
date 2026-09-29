/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   This program prints text for an address label

   It is modified from concatstrings.java
   CHANGES
   - Change class name
   - Changed method name to be more informative
   - Used informative variable names
*/

import javax.swing.*;

class Unit1Ex1e
{
    public static void main (String[] param)
    {		
        addressLabel();
        
        return;
    } // END main
	
    /* *************************************************** */
	//  Create an address label
	//
    public static void addressLabel ()
    {
        // first create variables, one for each piece of the final message
        // and anothers to hold the final combined message
        String name;
        String address;
        String postcode;
        String full_address;
        
        // set the name and address in the separate variables
        // \n adds in line breaks
        name = "Paul Curzon\n";
        address = " 54 Programming Towers\n Shell Street, Java Land\n";
        postcode = "E1 4NS";
        
        //Create the full address
        full_address = name + address + postcode;
        
        // print out thefull address
        JOptionPane.showMessageDialog(null, full_address);

     } // END addressLabel

} // END class Unit1Ex1e