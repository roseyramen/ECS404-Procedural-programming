/*
 AUTHOR Paul Curzon
 VERSION 2  October 2023
 A love letter writing program inspired by Christopher Strachey's 1952 
 LOVELETTERS.
 
 See http://www.gingerbeardman.com/loveletter/ for an accurate version.
 
 Use this to learn to program and in English to explore words and grammar.
 
 1) Just edit the word lists.
 2) Add new sentence templates (new methods and options in the main if statement
 3) Add new word list categories
 
 This version just prints a single first line
 
*/ 


import java.util.Random;

public class loveletters1
{
    // Choose a word randomly from each of two lists to then print the start of a letter
    // 
    public static void main (String[]p)
    {
       final String[] salutations1 = {"BELOVED", "DARLING", "DEAR", "DEAREST", "FANCIFUL", "HONEY"};
       final String[] salutations2 = {"CHICKPEA", "DEAR", "DUCK", "JEWEL", "LOVE", "MOPPET", "SWEETHEART"};
    
       String sal1 = chooseWord(salutations1);
       String sal2 = chooseWord(salutations2);
          
       System.out.println(sal1 + " " + sal2 + ",");
    
    } // END main

    // Given a word array choose a word randomly from it
    // 
   public static String chooseWord(String[] wordlist)
   {
      int choice = random0ton(wordlist.length);
      
      return wordlist[choice];
   } // END chooseWord

    // Return a random number from 0 to n
    // 
    public static int random0ton (int n)
    {
        Random rdn = new Random();
        
        int choice = rdn.nextInt(n);

        return choice;
    }	

} // END class loveletters1