/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1 
DESCRIPTION: PRINTS MY INITALS (RA) IN BLOCK LETTERS.

*/
class bigInitials
{
    //start of main
    //
    public static void main(String[] a)
    {
        printRA();

        return;
    }//end of main
    
    //this program prints the initial a in block letters using the letter R
    //
    public static void printInitialR()
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
    
        return;
    }//end of printInitialR
    
    
    //this program prints the initial a in block letters using the letter A
    //
    public static void printInitialA()
    {
            System.out.println("   A   ");
            System.out.println("  A A  ");
            System.out.println(" A   A ");
            System.out.println("A     A");
            System.out.println("AAAAAAA");
            System.out.println("A     A");
            System.out.println("A     A");
            System.out.println("");
    
        return;
    }//end printInitialA
    
    
    
    // Uses methods to print R and then A in block lettrs wiht a small gab inbeterrn
    //start of printRA
    public static void printRA()
    {
        printInitialR();
        printInitialA();
        return;
    
    }// end of printRA

} // END big_initials{}

