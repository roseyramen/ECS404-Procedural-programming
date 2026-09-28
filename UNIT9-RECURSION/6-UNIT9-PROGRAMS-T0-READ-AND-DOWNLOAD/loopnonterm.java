/* AUTHOR Paul Curzon
   VERSION 2 (2 October 2023)

    //  a silly method that calls itself
    //  notice there is no if statement to give a base case to get out
    // Explain why "finished!" is never printed.
    // Eventually it crashes as the computer runs out of memory 
    // scroll back up the terminal window to see
    //recursive calls use memory  with every call that isnt returned from.
*/
class loopnonterm
{
    public static void main (String param[]) 
    {

        System.out.println("starting...");
        myLoop();
        System.out.println("finished!");
        
        return;
    } // END main

    // A silly method that calls itself
    //
    public static void myLoop ()
    {
        System.out.println("tick...");
        
        myLoop();
        
        return;
    } // END myLoop

    
} // END class loopnonterm
