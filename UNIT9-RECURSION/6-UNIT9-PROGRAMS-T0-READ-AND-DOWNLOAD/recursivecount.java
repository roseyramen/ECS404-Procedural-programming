/* **********************************************
   AUTHOR Paul Curzon
   VERSION 2 (8 October 2023)

   A simple recursive program 
*/

class recursivecount
{
    public static void main (String [] param) 
    {
       report("starting...");
       loop(10);
       report("finished!");
       
       return;
    } // END main
    
    
    // just report current iteration
    //
    static void report (String n) 
    {
       System.out.println(n);
       return;
    } // END report

    // recursive method - calls itself
    //equivalent to a simple for loop
    // Try commenting out the report statements one at a time
    // - can you explain what is happening over them
    //
    public static void loop (int n) 
    {
       report("Entering.." + n);
       if (n==0)
       {
         report("Leaving .." + n);
         return; // base case
       }
       else
       {
         report("Do some work .." + n);
         loop(n-1); // step case
       }
       report("Leaving .." + n);
       return;

    } // END loop

} // END class recursivecount
