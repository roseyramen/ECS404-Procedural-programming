/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   This shows how methods can return results by rewriting an earlier program 
   in a better way.
   
   This finds out who people love and tells everyone about it
 */
 
import java.util.Scanner;

class keyboardinputwithmethods
{

    public static void main (String[] p)
    {
        askquestions();
     
        return;
    } //END main
  
	
	/* *************************************** */
	//	Print a message about who the user loves
	//
	  
    public static void askquestions ()
   {
       String your_name;
       String you_love;
  
       // get the names using the methods created and store results in variables
       your_name = askname();
       you_love = askloves();

       System.out.println("Oooh! Everyone listen! " + your_name + " loves " + you_love);
    
       return;
     } // END askquestions

	 /* *************************************** */
	 //	Get the users name
	 //
     public static String askname ()
    {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();
   
        return name;
    } // END askname

	/* *************************************** */
	//	Find out who the user likes
	//
    public static String askloves ()
    {
       String love;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Who do you love?");

       love = scanner.nextLine();
    
       return love;
     } // END askloves

} // END class keyboardinputmethods