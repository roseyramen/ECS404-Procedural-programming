/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2 (2 October 2023)

   A program to solve the Towers of Hanoi Puzzle
   (Its this simple with recursion)

******************************************** */

import java.util.*;

class hanoi
{

    public static void main (String [] param) 
    {
	  String how_many = input("Enter number of discs: ");
	  int discs = Integer.parseInt(how_many); 

	  hanoi(discs,'A','C','B');
	  
	  return;
    } // END main
    
    // Recursively solve the Tower of Hanoi puzzle
    // Given the number of discs and names of the three pegs
    //
    public static void hanoi (int discs, char source, char target, char using)
    {
      if (discs==1)
      {
          report("move disc 1 from " + source + " to " + target);
	  }
      else
      {
        hanoi(discs-1, source, using, target);
        report("move disc " + discs + " from " + source + " to " + target);
        hanoi(discs-1, using, target, source);
      }
      return;
    } // END hanoi
 
    
    // Print out text
    //
    static void report (String txt) 
    {
        System.out.println(txt);
        return;
    }
   
    //  Ask for a string with given message
    //  Return the string typed in by the user
    // 
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    } // END input
    

} // END class hanoi
