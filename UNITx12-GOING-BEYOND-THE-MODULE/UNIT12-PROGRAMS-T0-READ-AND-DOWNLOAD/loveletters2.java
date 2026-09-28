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
 
 This version  prints five lines choosing the line templates at random as well as words
 to plug in to them.
 
*/ 


import java.util.Random;

public class loveletters2
{
    // Set up word lists and then generate a love letter based on them
    //
    public static void main (String[]p)
    {
       final int numberoftemplates = 2;
       final String[] salutations1 = {"BELOVED", "DARLING", "DEAR", "DEAREST", "FANCIFUL", "HONEY"};
       final String[] salutations2 = {"CHICKPEA", "DEAR", "DUCK", "JEWEL", "LOVE", "MOPPET", "SWEETHEART"};
       final String[] adjectives =   {"AFFECTIONATE", "AMOROUS", "ANXIOUS", "AVID", "BEAUTIFUL", "BREATHLESS", 
                                      "BURNING", "COVETOUS", "CRAVING", "CURIOUS", "EAGER", "FERVENT", "FONDEST",
                                      "LOVEABLE", "LOVESICK", "LOVING", "PASSIONATE", "PRECIOUS", "SEDUCTIVE",
                                      "SWEET", "SYMPATHETIC", "TENDER", "UNSATISFIED", "WINNING", "WISTFUL"};
       final String[] nouns =        {"ADORATION", "AFFECTION", "AMBITION", "APPETITE", "ARDOUR", "BEING", "BURNING",
                                      "CHARM", "CRAVING", "DESIRE", "DEVOTION", "EAGERNESS", "ENCHANTMENT", "ENTHUSIASM",
                                      "FANCY", "FELLOW FEELING", "FERVOUR", "FONDNESS", "HEART", "HUNGER", "INFATUATION",
                                      "LITTLE LIKING", "LONGING", "LOVE", "LUST", "PASSION", "RAPTURE", "SYMPATHY", "THIRST",
                                      "WISH", "YEARNING"};
       final String[] adverbs =      {"AFFECTIONATELY", "ARDENTLY", "ANXIOUSLY", "BEAUTIFULLY", "BURNINGLY", "COVETOUSLY", 
                                      "CURIOUSLY", "EAGERLY", "FERVENTLY", "FONDLY", "IMPATIENTLY", "KEENLY", "LOVINGLY", 
                                      "PASSIONATELY", "SEDUCTIVELY", "TENDERLY", "WISTFULLY"};
       final String[] verbs =        {"ADORE", "ATTRACT", "CLING TO", "HOLD DEAR", "HOPE FOR", "HUNGER FOR", "LIKE", "LONG FOR",
                                      "LOVE", "LUST AFTER", "PANT FOR", "PINE FOR", "SIGH FOR", "TEMPT", "THIRST FOR", "TREASURE",
                                      "YEARN FOR", "WOO"};
    
       String sal1 = chooseWord(salutations1);
       String sal2 = chooseWord(salutations2);

       System.out.println();
       System.out.println(sal1 + " " + sal2 + ",");
       
       for(int i = 1; i <=5; i++)
       {
          int sentencechoice = pickRandomNumber(numberoftemplates);
          
          if (sentencechoice == 0)
              youAreMy(adjectives, nouns);
          else
          if (sentencechoice == 1)
              iYour(verbs, adjectives, nouns);
          else
              System.out.println("I'm lost for words"); // SHOULD NEVER HAPPEN
       }
       
       String adverb = chooseWord(adverbs);
       System.out.println("YOURS, " + adverb);
       System.out.println("Q");
    
    } // END main

   // Generate a sentence following the template
   //  I <verb> YOUR <adjective> <noun>
   //
   public static void iYour(String[] verbs, String[] adjectives, String[] nouns)
   {
       String verb = chooseWord(verbs);
       String adjective = chooseWord(adjectives);
       String noun = chooseWord(nouns);
       
       System.out.println("I " + verb + " YOUR " + adjective + " " + noun);
       
       return;
   } // END iYour


   // Generate a sentence following the template
   //  YOU ARE MY  <adjective> <noun> , <adjective> <noun>, ...
   //
   public static void youAreMy(String[] adjectives, String[] nouns)
   {
       int NUMBEROFCLAUSES = pickRandomNumber(3)+ 1; //1-3
       System.out.print("YOU ARE");
       
       for (int j = 1; j<=NUMBEROFCLAUSES; j++)
       {
             String adjective = chooseWord(adjectives);
             String noun = chooseWord(nouns);
          
             System.out.print(" MY " + adjective + " " + noun);
             if (j!=NUMBEROFCLAUSES)
                  System.out.print(",");
             else
                  System.out.print(".");
       }
       System.out.println();
       
       return;
   } // END youAreMy

   //  Pick a random word from a given wordlist
   //
   public static String chooseWord(String[] wordlist)
   {
      int choice = pickRandomNumber(wordlist.length);
      
      return wordlist[choice];
   } // END chooseWord

   //  Pick a random word from a given wordlist
   //
    public static int pickRandomNumber (int n)
    {
        Random rdn = new Random();
        
        int choice = rdn.nextInt(n);

        return choice;
    }	// END pickRandomNumber

} // END loveletters2