/* AUTHOR Paul Curzon
   VERSION 2 (2 October 2023)

   A Tail recursive program

   This prints from n to 0

   Tail recursion is where the last thing a method does is a recursive call
   It is BAD programming. 
*/

class tailrecursion
{

    public static void main (String[] param) 
    {
       printNto0(10);
       
       return;
    } // END main
  
    // print numbers from N to 0
    public static void printNto0 (int n)
    {
       if (n == 0)
            return;
       else
           System.out.println(n);

       printNto0(n-1);
       
       return;
     } // END printNto0
     
} // END class tailrecursion
