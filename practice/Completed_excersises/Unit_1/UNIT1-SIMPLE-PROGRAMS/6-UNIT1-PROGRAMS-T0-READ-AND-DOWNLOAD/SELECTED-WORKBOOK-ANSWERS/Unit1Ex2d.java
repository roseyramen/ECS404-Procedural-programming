/* AUTHOR Paul Curzon
   VERSION 2: 9/11/2023

   Prints a message about your country and favourite city
 */

import java.util.Scanner; // Needed to make Scanner available for input/output

class Unit1Ex2d
{

    public static void main (String[] p)
    {
        nicestCity();
     
        return;
    } //END main
  

	/* *************************************** */
	//	Ask where the person was born
	//
    public static String askForCountry ()
    {
        String your_country;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What country were you born in?");
        your_country = scanner.nextLine();
   
        return your_country;
     } // END askForCountry


	/* *************************************** */
	//	Ask for their favourite city in their country of birth
	//
    public static String askForCity ()
    {
        String your_city;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favourite city in that country?");
        your_city = scanner.nextLine();
    
        return your_city;
     } // END askForCity
	
	 /* *************************************** */
	 //	Find out then print a message about their city and country
	 //	  
     public static void nicestCity ()
     {
         String country;
         String city;
  
         country = askForCountry();
         city = askForCity();

         System.out.println( city + " is the nicest city in " + country);
    
         return;
    } // END nicestCity

} // END Unit1Ex2d