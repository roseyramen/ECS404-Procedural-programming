/*
 Paul Curzon November 2016
 A love letter writing program inspired by Christopher Strachey's 1952 
 LOVELETTERS.
 
 See http://www.gingerbeardman.com/loveletter/ for an accurate version.
 
 Use this to learn to program and in English to explore words and grammar.
 
 1) Just edit the word lists.
 2) Add new sentence templates (new methods and options in the main if statement
 3) Add new word list categories
 
 Always remember to save and recompile.
 
*/ 

import java.util.Random;

public class loveletters3
{
    // Set up word lists and then generate a love letter based on them
    //
    public static void main (String[]p)
    {
       final int NUMBER_OF_TEMPLATES = 5;
       
       final String[] salutations1 = {"Beloved", "Cherished", "Darling", "Dear", "Dearest"};
       final String[] salutations2 = {"Angel", "Baby", "Chickpea", "Duckling", "Honey Bee", "Teddy Bear", "Jewel", "Little Cabbage",
                                      "Light of my Life", "Little Dove", "Love", "Muppet", "Pumpkin", "Sweetheart"};
       final String[] adjectives =   {"affectionate", "amorous", "anxious", "avid", "beautiful", "breathless", 
                                      "burning", "covetous", "craving", "curious", "eager", "fervent", "fondest",
                                      "loveable", "lovesick", "loving", "passionate", "precious", "seductive",
                                      "sweet", "sympathetic", "tender", "unsatisfied", "winning", "wistful"};
       final String[] nouns1 =       {"buttercup", "cuddle-bear", "dreamboat", "heart", "hunger", 
                                       "love", "peaches and cream", "poppet", "rose"};
       final String[] nouns2 =       {"adoration", "affection",  "ardour", 
                                      "charm", "comfort", "craving",  "desire", "devotion",  "enchantment", "enthusiasm",
                                      "fervour", "fondness", "heart", "hunger", "infatuation",
                                       "love", "lust", "passion", "thirst"};
       final String[] adverbs =      {"affectionately", "ardently", "anxiously",  
                                      "curiously", "eagerly", "fervently", "fondly", "impatiently", "keenly", "lovingly", 
                                      "passionately", "seductively", "tenderly", "wistfully"};
       final String[] verbs =        {"to eat", "to kiss", "to caress", "to hold", "to see", "to touch"};
       final String[] verbsI =       {"adore", "cling to", "hold dear", "hope for", "hunger for", "like", "long for",
                                      "love", "lust after", "pant for", "pine for", "sigh for", "tempt", "thirst for", "treasure",
                                      "yearn for"};
       final String[] verbsIt =      {"adores", "clings to", "holds dear", "hopes for", "hungers for", "likes", "longs for",
                                      "loves", "lusts after", "pants for", "pines for", "pounds for", "sighs for", "tempts", "thirsts for", 
                                      "treasures", "yearns for"};
    
       String sal1 = chooseWord(salutations1);
       String sal2 = chooseWord(salutations2);

       System.out.println();
       System.out.println(sal1 + " " + sal2 + ",");
       
       for(int i = 1; i <=5; i++)
       {
          int sentencechoice = pickRandomNumber(NUMBER_OF_TEMPLATES);
          
          System.out.print("    ");
          
          if (sentencechoice == 0)
              youAreMy1(nouns1);
          else if (sentencechoice == 1)
              iWantTo(verbs);
          else if (sentencechoice == 2)
              youAreMy2(adjectives, nouns2);
          else if (sentencechoice == 3)
              iYour(verbsI, adjectives, nouns2);
          else if (sentencechoice == 4)
              myNoun(nouns2, adverbs, verbsIt, adjectives);
          else
              System.out.println("I'm lost for words"); // SHOULD NEVER HAPPEN
       }
       
       String adverb = chooseWord(adverbs);
       System.out.println("Yours, " + adverb);
       System.out.println("Q");
    
    } // END main
 
  // Generate a sentence following the template
   //  YOU ARE MY  <noun>.
   // 
   public static void youAreMy1(String[] nouns)
   {
       String noun = chooseWord(nouns);
       
       System.out.println("You are my " + noun + ".");
       
       return;
   } // END youAreMy1
   
   
   
   
   // Generate a sentence following the template
   //  I <verb> YOUR <adjective> <noun>
   //   
   public static void iWantTo(String[] verbs)
   {
       String verb = chooseWord(verbs);
       
       System.out.println("I want " + verb + " you forever.");
       
       return;
   } // END iWantTo
 

   public static void iYour(String[] verbs, String[] adjectives, String[] nouns)
   {
       String verb = chooseWord(verbs);
       String adjective = chooseWord(adjectives);
       String noun = chooseWord(nouns);
       
       System.out.println("I " + verb + " your " + adjective + " " + noun + ".");
       
       return;
   } // END iYour


   // Generate a sentence following the template
   //  YOU ARE MY  <adjective> <noun> , <adjective> <noun>, ...
   //
   public static void myNoun(String[] nouns, String[] adverbs, String[] verbs, String[] adjectives)
   {
       String noun1 = chooseWord(nouns);
       String adverb = chooseWord(adverbs);
       String verb = chooseWord(verbs);
       String adjective = chooseWord(adjectives);
       String noun2 = chooseWord(nouns);
       
       System.out.println("My " + noun1 + " " + adverb + " " + verb  + " your " + adjective + " " + noun2 + ".");
       
       return;
   } // END myNoun


   public static void youAreMy2(String[] adjectives, String[] nouns)
   {
       int NUMBEROFCLAUSES = pickRandomNumber(3)+ 1; //1-3
       System.out.print("You are");
       
       for (int j = 1; j<=NUMBEROFCLAUSES; j++)
       {
             String adjective = chooseWord(adjectives);
             String noun = chooseWord(nouns);
          
             System.out.print(" my " + adjective + " " + noun);
             if (j!=NUMBEROFCLAUSES)
                  System.out.print(",");
             else
                  System.out.print(".");
       }
       System.out.println();
       
       return;
   } // END youAreMy2



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

} // END loveletters3