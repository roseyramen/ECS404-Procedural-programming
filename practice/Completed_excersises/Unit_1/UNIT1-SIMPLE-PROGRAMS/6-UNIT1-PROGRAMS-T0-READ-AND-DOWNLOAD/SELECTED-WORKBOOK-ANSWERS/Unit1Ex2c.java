/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   This finds out who people love and tells everyone about it   
 */

import java.util.Scanner; // Needed to make Scanner available for input/output

class Unit1Ex2c
{

    public static void main (String[] p)
    {
        loveTriangle();
     
        return;
     } //END main
  
	
	/* *************************************** */
	//	Print a message about a love triangle about who the user loves and who loves them
	//
    public static void loveTriangle ()
    {
        String your_name;
        String you_love;
        String loves_you;
  
        // get the names of three people in a love triangle and store results in variables
        your_name = askName();
        you_love = askLoves();
        loves_you = askLovesYou();

        System.out.println( your_name + " loves " + you_love + 
                            " but " + loves_you + " loves " + your_name + "!");
    
        return;
    } // END askquestions

	/* *************************************** 	*/
	//	Get the users name
	//
    public static String askName ()
    {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();
   
        return name;
     } // END askName


	/* *************************************** 	*/
	//	Find out who the user likes
	//
    public static String askLoves ()
    {
        String love;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who do you love?");

        love = scanner.nextLine();
    
        return love;
    } // END askLoves


	/* *************************************** 	*/
	//	Find out who loves the user
    //
    public static String askLovesYou ()
    {
        String second_love;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Who loves you?");
        second_love = scanner.nextLine();
    
        return second_love;
     } // END askLovesYou

} // END Unit1Ex2c