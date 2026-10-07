
/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: TAKES IN A RANGE OF PLANT METRICS REGARDING GROWTH AND USES IT TO PREDCT THE FINAL LENGTH AND ITS PERCENTAGE CHANGE
*/


import java.util.Scanner; // imports the scanner class



//start of secondHandBooks class
//
class secondHandBooks
{
    //start of main
    //
    public static void main(String[] args)
    {
        final int invalidMarker = -1;
        int basePrice = bookPrice();

            if (basePrice == invalidMarker)
            {
                return;
            }

        int hardbackCharge = isHardback();

            if (hardbackCharge == invalidMarker)
            {
                return;
            }
        int total = basePrice + hardbackCharge;

        System.out.println("That will be £" + total +".");

        return;
    }//end of main

    //This method prints a message and takes in an input from a user
    //
    public static String stringInput(String message)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);

            String userInput = scanner.nextLine();

            return userInput;
        }//end of stringInput

    //This method asks the user a question about the number of books in the shops and assigns a book price based on the answer
    //
    public static int bookPrice()
    {
        int input = Integer.parseInt(stringInput("How many copies does the shop hold in total?"));

        final int surgePrice = 4;
        final int normalPrice = 3;
        final int discountedPrice = 2;
        final int invalidPrice = -1;
        final int surgeUpperBound = 3;
        final int surgeLowerBound = 0;
        final int normalLowerBound = 3;
        final int normalUpperBound = 4;
        final int discountLowerbound = 4;

            if(input < surgeUpperBound && input > surgeLowerBound)
            {
                return surgePrice;
            }
            else if (input == normalLowerBound|| input == normalUpperBound)
            {
            
                return normalPrice;
            }
            else if (input > discountLowerbound) 
            {
                return discountedPrice;
            }
            else
            {
                System.out.println("That is not a legal number of books. Please try again.");
                return invalidPrice;
            }
        
    }//end of bookPrice
    
    //this method asks the user if the book is a hardback or not and returns an extra charge or not based on the answeer
    //
    public static int isHardback()
    {
        final int hardbackExtra = 3;
        final int noHardbackExtra = 0;
        final int invalidPrice = -1;

        String input = stringInput("Is it a hardback (Y/N)?");

        if (input.equals("Y"))
        {
            return hardbackExtra;
        }
        else if (input.equals("N"))
        {
            return noHardbackExtra;
        }
        else
        {
            System.out.println("You must answer Y for yes or N for no. Please try again.");
            return invalidPrice;
        }
    }// end of isHardback
}