
/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

   This program demonstrates 
   - for loops.
 
   Go round a loop a fixed number of times
   
******************************************** */

class for4
{
    public static void main (String[] param)
    {  
        forTest();
        
        return;
    } // END main
  
    
    /* *************************************************** */
    //   This method asks the user for a number and pops up an ok box, that number of times.
    //
    public static void forTest()
    {
       for (int i=1; i<=4; i++)
       {
          System.out.println(i + " Hello");
       }

       System.out.println("I am out of the loop now - are you ok with what I did?");
       
       return;
    } // END fortest
    

} // END class for4