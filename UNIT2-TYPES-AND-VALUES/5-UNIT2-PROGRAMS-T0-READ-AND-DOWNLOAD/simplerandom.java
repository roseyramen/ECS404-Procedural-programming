/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023
   This program demonstrates 
   -  random numbers.
 
   Roll a die  and give the score
   
   How do you get different sided dice? 
   Predict then try changing the program and see if you were right.
   
******************************************** */

import java.util.Random;

class simplerandom
{
    public static void main (String[] param)
    {
        int roll;
        
        roll = rollDice();
        System.out.println("You threw " + roll);

        roll = rollDice();
        System.out.println("You threw " + roll);

        return;
        
    } // END main

    
    /* ***************************************************
       Roll a six sided die
    */
    
    public static int rollDice()
    {
       final int SIDES = 6;        // Number of sides on the dice

       Random dice = new Random();  // Create a new random number generator (ie die)
       int dice_throw = dice.nextInt( SIDES ) + 1; // Roll the dice

       return dice_throw;
    } // END rollDice
    

} // END class

