/*
AUTHOR:RAYYAN RAHMAN
DATE: 5/10/26
VERSION: 1 

*/
import java.util.Scanner; // Needed to make Scanner available 

class big_initals
{

//this program checks if the inputted initials are correct and then prints out R in block letters if so,
//
public static void printInitialR(String initial)
{
    if (initial.equals("R"))
    {
        System.out.println("RRR");
        System.out.println("R   R");
        System.out.println("R    R");
        System.out.println("R   R");
        System.out.println("RRRR");
        System.out.println("RRRRR");
        System.out.println("R   R");
        System.out.println("R    R");
        System.out.println("");
    }

    return;
}//end of printInitialR


//this program checks if the inputted initials are correct and then prints out R in block letters if so,
//
public static void printInitialA(String initial)
{
    if (initial.equals("A"))
    {
        System.out.println("   A   ");
        System.out.println("  A A  ");
        System.out.println(" A   A ");
        System.out.println("A     A");
        System.out.println("AAAAAAA");
        System.out.println("A     A");
        System.out.println("A     A");
        System.out.println("");
    }

    return;
}//end printInitialA


//this program will ask the user for their inital and then take in return whats put in to the main program
//
public static String stringInput(String message)
{
    Scanner scanner = new Scanner(System.in);

    System.out.println(message);
    String Initial = scanner.nextLine();

    return Initial;
} //end of stringInput


// Asks the user for their inititails ad if the correct ones are put in, their initials are printed out in block letters
//start of printRA
public static void printRA()

{
    String FIRST_INITIAL =stringInput("what is your first initial?");
    printInitialR(FIRST_INITIAL);
    
    String SECOND_INITIAL =stringInput("what is your second initial?");
    printInitialA(SECOND_INITIAL);

    return;

}// end of printRA

} // END big_initials{}
