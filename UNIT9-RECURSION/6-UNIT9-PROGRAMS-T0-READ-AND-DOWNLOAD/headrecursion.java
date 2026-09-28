/* AUTHOR Paul Curzon
   VERSION 2 (2 October 2023)

   A Head recursive program

   This prints from 0 to n
 
*/

class headrecursion
{

    public static void main (String [] param) 
    {
       print0toN(10);
       
       return;
    } // END main
  
    // print numbers from N to 0
    //
    public static void print0toN (int n)
    {
       if (n == -1)
            return;
       else
       {
           print0toN (n-1);
           System.out.println (n);
           return;
        }
     } // ENd print0toN
} // END class headrecursion