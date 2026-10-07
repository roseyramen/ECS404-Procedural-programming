/*
workings out

PRINT menu

GET PLAYER
-ASK QUESTION
-CHECK IF END CODE IS PUT IN
-VERIFY PLAYER
-MOVE TO SCORE FUNCTION

GET SCORE
-ASK QUESTION
-VERIFY SCORE
-SEND BACK CONFIRMATION

KEEP SCORE
-STORE PLAYER 1 AND PLAYER 2 SCORE

PRINT SCORE
-WHEN GAME ENDS PRINT SCORES 
-ASSIGN WINNER


*/
/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: A program that records taekwando scores for 2 players, validates inputs and keeps a total and declares the winner when TIME is entered.
*/


import java.util.Scanner;

class taekwando
{

        public static void main(String[] args) 
        {
            printHeader();

            int[] playerScores = {0,0};
            int playerInMemory = whichPlayer();
            int points = 0;
            final int flag = 0;

            while (playerInMemory != flag)
            {

            points = determineScore();
            playerScores = updateScore(playerScores,playerInMemory,points);
            printScore(playerScores,playerInMemory,points);
            playerInMemory = whichPlayer();
            }

            if (playerScores[0] > playerScores[1])
            {
            playerInMemory = 1;
            printWinner(playerScores,playerInMemory);
            }
            else
            {
            playerInMemory = 2;
            printWinner(playerScores,playerInMemory);
            }
            

        }
        




    //a method which asks the user for an input and returns it
    //
    public static String stringInput(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        String userInput = scanner.nextLine();

        return userInput;
    }//end of stringInput

    //this method prints the taewkwando header giving the user an idea of how scoring works
    //
    public static void printHeader()
    {
        System.out.println("Taekwondo scores");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(".. punch: 1 .. hogu: 2 .. head: 3 .. t-hogu: 4 .. t-head: 5 .. gam-jeom: 1 ..");
        System.out.println("-----------------------------------------------------------------------------");
    }//end of printHeader

    //asks the user what player scored and returns the number of the player or a minus one if time is put in
    //
    public static int whichPlayer()
    {
        String playerInput = stringInput("Which player scored (1, 2, TIME)? ");
 
        if (playerInput.equals("1"))
        {
            return 1;
        }
        else if (playerInput.equals("2"))
        {
            return 2;
        }
        else if (playerInput.equals("TIME"))
        {

            return 0;
        }
        else
        {
            System.out.println("That is an invalid option. Try again.");
            return whichPlayer();
        }
    }//end of whichPlayer

    //this method takes in an input and then determines a score
    //
    public static int determineScore()
    {
        String optionInput = stringInput("What was their score for (punch, hogu, head, t-hogu, t-head, gam-jeom)?");
        
        final String [] scoreOptions = {"punch", "hogu", "head", "t-hogu", "t-head", "gam-jeom"};
        final int [] scoreOptionValues = {1, 2, 3, 4, 5, 1};

        for (int i = 0; i < scoreOptions.length;i++)
        {
            if (scoreOptions[i].equals(optionInput))
            {
                return scoreOptionValues[i];
            }
        }

        System.out.println("That is an invalid option. Try again.");
        return determineScore();
    }//end of determineScore

    // takes in abn existing score input, player type and scorevalue and uses it to update the scores and returns
    //
    public static int[] updateScore(int[] scores, int playerType, int score)
    {
        scores[playerType-1] = scores[playerType-1] + score;

        return scores;
    }//end of updateScore

    //prints the name of the player who scored and how many points they won
    //
    public static void printScore(int[] scores, int scoreWinner, int points)
    {
        System.out.println("player " + scoreWinner + " scored " + points + " point (s)");
        System.out.println(" Score =  " + scores[0] + " : " + scores[1]);
    }//end of printScore

    //prints the name of the player who won and the score
    //
    public static void printWinner(int[] scores, int scoreWinner)
    {
        System.out.print("player " + scoreWinner + " wins. ");
        System.out.println(" Score =  " + scores[0] + " : " + scores[1]);
    }//end of printWinner

}