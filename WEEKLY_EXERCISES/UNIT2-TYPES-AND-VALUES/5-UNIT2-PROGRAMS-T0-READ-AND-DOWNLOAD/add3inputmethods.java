
/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

   This program demonstrates 
   - integer variables
   - doing calculations.
   - input
   - methods with return values
 
   Add the ages of three children (three integers)
   to work out the total age and average age
   Get the ages from the user.
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class add3inputmethods
{
    public static void main (String[] param)
    {
        add3ages();
        
        return;   
    } // END main
   
    
    /* ***************************************************  */
    //   This method adds the ages of three children 
    //   getting the ages from the user
    //
    public static void add3ages()
    {
       final int NUMBER_OF_CHILDREN = 3;
       int age1;  // each will hold the age of a different child
       int age2;       
       int age3;  
       int total_age; // the answer when the three ages are added      
       int average_age; //their average rounded as an integer
       
       // Get the ages of three people
       //
       age1 = inputAge(); //A method we've defined below
       age2 = inputAge();
       age3 = inputAge();
           
       // Now do the calculation of the total age
       //
       total_age = age1 + age2 + age3;
       average_age = total_age / NUMBER_OF_CHILDREN;
    
       // Finally give the user the answer
       //   
       System.out.println("The total age of the three children is " + total_age);
       System.out.println("and their average age is " + average_age + ".");

       return;
    } // END add3ages


    /* ***************************************************  */
    //   This method gets a single age from the user and returns it
    //
    public static int inputAge()
    {
       int age;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Give me an age.");
       age = Integer.parseInt(scanner.nextLine());
   
       return age;
    } // END inputAge
   
} // END class add3input
