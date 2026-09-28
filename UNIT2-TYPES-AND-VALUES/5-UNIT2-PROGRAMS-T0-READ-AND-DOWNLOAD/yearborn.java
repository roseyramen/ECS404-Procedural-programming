/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023
   This program demonstrates 
    - integer variables
    - doing calculations.
 
       Asks the user their age and works out their
       year of both. It only works if current year is correct
       or the person gives their age in that year.
******************************************** */

import java.util.Scanner;

class yearborn
{

    public static void main (String[] param)
    {       
        born();
        
        return;   
    } // END main
    
    /* *************************************************** */
    //   This method asks the user their age and works out their
    //   year of both. It only works if current year is correct
    //   or the person gives their age in that year.
    //
    public static void born()
    {
       final int CURRENT_YEAR = 2023;  // The year the calculation is based on
       
       int age;         
       int year;            // the calculated year of birth
       String answer_text;  
       
       // Get an age (a string) from the user then
       // convert (known as parsing) it into a number version
       //
       age = inputAge(CURRENT_YEAR);

       // Now do the calculation
       //
       year = CURRENT_YEAR - age; 
       answer_text = "You must have been born in " +
                     year + " or " + (year - 1); 

       // Finally give the user the answer
       //   
       System.out.println(answer_text);
       
       return;
    } // END born
 
     
    /* *************************************************** */
    //   This method gets a single integer age from the user 
    //   in a given year and returns it
    //   the year argumeent is the year the person is being asked their age in
    //
    public static int inputAge(int CURRENT_YEAR)
    {
       Scanner scanner = new Scanner(System.in);
       int age;

       System.out.println("Tell me your age in " +  CURRENT_YEAR);
       age = Integer.parseInt(scanner.nextLine());
   
       return age;
    } // END inputAge
   

} // END class yearborn
