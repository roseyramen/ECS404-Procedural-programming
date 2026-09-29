/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2 (1 October 2023)

   Giving status of endangered animals up to a number
   indicated first by the user.
******************************************** */

import java.util.*;

class endangered
{
    public static void main (String [] param) 
    {
        int numberAnimals = 0;
    
        // First get the number of queries
        //
        numberAnimals = howManyAnimals();
    
        //Then ask for that many animals and give status
        //
        areTheyEndangered(numberAnimals);
        
        return;
    } // END main

    /* *************************************** */
    // Give endangered status of a sequence of animals given the number of animals 
    //
    public static void areTheyEndangered (int numberAnimals) 
    {
        for(int i = 1; i <= numberAnimals; i++)
        {
           String testAnimal;
           String animalStatus;
    
           testAnimal = input("Give me the name of animal " + i);
                         
           animalStatus = statusOfAnimal(testAnimal);

           System.out.println("The " + testAnimal  + " is " +  animalStatus);
        }
    
        return;
    } // END areTheyEndangered
 
    /* *************************************** */
    // For a given animal return its status as a string message
    //
    public static String statusOfAnimal (String animal) 
    {  
        String status = "";
     
        /* Now set message based on status of animal */
     
        if (extinct(animal))
        {
            status = "unfortunately now extinct.";
        }
        else if (endangered(animal)) 
        { 
            status = "endangered and needs protection.";
        }
        else if (vulnerable(animal))
        { 
            status = "vulnerable";
        }
        else if (notInDanger(animal))
        { 
            status = "not in danger.";
        }
        else
        { 
            status = "one I've not heard of.";
        }
      
        return status;
      
    } // END statusOfAnimal

    /* *************************************** */
    //   Get the number of animals to check from user
    //
    public static int howManyAnimals () 
    {  
        int numberOfAnimals = inputInt("How many animals do you want to check?");
      
        return numberOfAnimals;
    } // END howManyAnimals

    /* *************************************** */
    //   Is the given animal extinct?  
    //        
    public static boolean extinct (String animal) 
    {  
       if ((animal.equals("Dodo") ||
           (animal.equals("Passenger Pigeon")))) 
       {
            return true;
       }
       else 
       {
            return false;
       }   
    } // END extinct

    /* ***************************************  */
    //   Is the given animal endangered?    
    //
    public static boolean endangered (String animal) 
    {  
       if ((animal.equals("Blue Whale") ||
            (animal.equals("Albatross"))))
       {
            return true;
       }
       else 
       {
            return false;
       }   
    } // END endangered

    /* ***************************************  */
    //   Is the given animal vulnerable?      
    //
    public static boolean vulnerable (String animal) 
    {  
       if (animal.equals("Cheetah"))
       {
            return true;
       }
       else 
       {
            return false;
       Al}   
    } // END vulnerable

    /* ***************************************  */
    //   Is the given animal fine?
    //
    public static boolean notInDanger (String animal) 
    {  
       if (animal.equals("Rabbit"))
       {
            return true;
       }
       else 
       {
            return false;
       }   
    } // END notInDanger
  
  
  
    // Input Integer
    //
    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    } // END inputInt


    // Input strings
    //
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String ans;

       System.out.println(message);
       ans = scanner.nextLine();
   
       return ans;
    } // END input

} // END  class endangered