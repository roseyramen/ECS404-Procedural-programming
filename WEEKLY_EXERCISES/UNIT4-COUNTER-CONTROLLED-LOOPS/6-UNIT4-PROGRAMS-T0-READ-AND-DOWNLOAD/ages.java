/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

  A program to print the averages of a series of 
  pairs of ages.
  
  Illustrates how methods can return values.
   
******************************************** */

import java.util.*;

class ages
{
    public static void main (String[] param)
    { 
        averageAges();
        
        return;
    } // END main


/* ********************************* */
//    Ask for 10 pairs of ages for a husband and wife printing their average 
//
    public static void averageAges()
    {
       String result_text = "";
       
       for (int i=1; i<=10; i++)
       {
          int average_age;

          System.out.println("I need you to give me a pair of ages for a couple");
          average_age = calculateAverage();
          result_text = result_text + "Couple " + i + ": \t\t" + average_age + "\n";
        }

        System.out.println("Here are the average ages of the couples");
        System.out.println(result_text);
        return;
    } // END averageAges


/* ********************************* */
//    A method that asks for ages of a wife and husband and returns their average 
//
    public static int calculateAverage()
    {
       int husband;
       int wife;
       int average;

       husband = inputInt("Give me the husband's age");
       wife = inputInt("Give me the wife's age");
 
       average = average2(husband, wife);

       return average;
    } // END calculateAverage
    

/* ********************************* */
//    Calculate the average of two given numbers 
//
    public static int average2(int value1, int value2)
    {
       int average;

       average = (value1 + value2) / 2;

       return average;
    } // END average2

  /* ********************************* */  
  // A method to input ints
  //
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt

} // END class ages
