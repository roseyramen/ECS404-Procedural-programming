
/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023
   
   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
   This shows how you can have other commands - here assignments inside an if
   You can even have a sequence of commands.
   
******************************************** */

import java.util.Scanner;

class if_char2
{
    public static void main (String[] param)
    {
        yesNo2();
        
        return;
    } // END main


    /* ***************************************************  */
    //   Show how a chain of tests on characters can be done
    //
    public static void yesNo2()
    {
        String reply;    // which branch to take from user
        char ans;        // char version of it 
        String final_response;   // Build string printed to the user.
       
       // Ask for a response then take the first letter of it as a character to test
       // using the method charAt preceded by the name of the string
       //
        reply = inputString("Enter Y/N: ");
        ans = reply.charAt(0);
       
        if (ans == 'y')
        {
           final_response = "yes";        
        }
        else if (ans == 'Y')
        {
           final_response = "YES";
        }   
        else if (ans=='n')
        {
           final_response = "no";
        }   
        else if (ans=='N')
        {
           final_response = "NO";
        }   
        else
        {
           final_response = "What?!?!";
        }   
        
        final_response = "You said: " + final_response + ". Thanks for your answer";
        System.out.println(final_response);
        
        return;
    } // END yesNo2
    

    /* ********************************* */ 
    //  Ask for a string with given message
    //  Return the string typed in by the user
    //
    public static String inputString(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    } // END inputString

} // END class if_char2
    
