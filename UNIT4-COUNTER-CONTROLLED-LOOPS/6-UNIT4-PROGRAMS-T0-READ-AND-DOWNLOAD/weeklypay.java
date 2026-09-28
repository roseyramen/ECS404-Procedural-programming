/* *****************************************

   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

   A program that keeps track of pay
******************************************** */

import java.util.*;

class weeklypay
{
  public static void main (String[] args)
  {
       int total = 0;
       String message_to_print = "";
    
       for (int i = 1; i <= 4; i++)
       {
         int pay = inputInt("How much did you earn this week?");
           
         total = total + pay;
         message_to_print = message_to_print + 
                          "Week " + i + ": " + pay + " euro.\n";
       }
    
       message_to_print = message_to_print + "Total this month: " + total + "euro.";
       print(message_to_print);
    
     return;
   } // END main
 
  /* *************************************************** */
  // A method to input integers
  //
  public static int inputInt(String message)
  {
     return Integer.parseInt(input(message));
  } // END inputInt


  /* *************************************************** */
  // A method to input strings
  //
  public static String input(String message)
  {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
  } // END input


  /* *************************************************** */
  // A method to print messages
  //
  public static void print(String message)
  {
     System.out.println(message);
     return;
  } // END print
  
} // END class weeklypay