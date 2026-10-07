/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: TAKES IN A RANGE OF PLANT METRICS REGARDING GROWTH AND USES IT TO PREDCT THE FINAL LENGTH AND ITS PERCENTAGE CHANGE
*/

import java.util.Scanner; // imports the scanner class

class plantGrowth
{
//Start of the main method
//
    public static void main(String[] a)
    {
        double plantHeight = plantHeight();
        int sunlightHours = sunlightHours();
        int waterCount = waterCount();

        double expectedGrowth = growthCalc(waterCount,sunlightHours);
        double expectedHeight = expectedHeight(expectedGrowth,plantHeight);
        int percentageIncrease = percentageIncrease(expectedGrowth,plantHeight);

        System.out.println("Your starting height is " + plantHeight + "cm.");
        System.out.println("Your expected height is " + expectedHeight + "cm.");
        System.out.println("That is an expected growth of " + expectedGrowth + "cm.");
        System.out.println("That would be a " + percentageIncrease + "% increase this week.");

    }//end of the main method

    //This method prints a message and takes in an input from a user
    //
    public static String stringInput(String message)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);

            String userInput = scanner.nextLine();

            return userInput;
        }//end of stringInput


    //This method asks the user for the plants starting height and returns it to the caller
    //
    public static int plantHeight()
        {
            String message= "How tall is your plant in cm? (a whole number)";
            int plantHeight = Integer.parseInt(stringInput(message));

            return plantHeight;
        }//end of plantHeight
    
    //This method asks the user for the amount of sunlight the plant recieves and returns it to the caller
    //
    public static int sunlightHours()
    {
        String message = "How many hours of sunlight has your plant had this week (a whole number)?";
        int sunlightHours = Integer.parseInt(stringInput(message));

        return sunlightHours;
    }//end of sunlightHours()

    //This method asks the user for the amount of times the plant is watered and returns it to the caller
    //
    public static int waterCount()
    {
        String message = "How many times have you watered your plant this week (a whole number)?";
        int waterCount = Integer.parseInt(stringInput(message));

        return waterCount;
    }//end of waterCount

    //Takes in the watercount and hours of sunlight parameters and carries out the expected growth calculation and returns it to the caller
    //
    public static double growthCalc(int waterCount, int sunlightHours)
    {    
        final double waterGrowthConstant = 1.2;
        final double sunlightGrowthConstant = 0.5;
        double growth = (waterGrowthConstant * waterCount) + (sunlightGrowthConstant * sunlightHours);

        return growth;
    }
    //end of expectedGrowthCalc

    //takes in the expected growth and starting height parameters and uses it to calculate the expected height and returns to the callers
    //
    public static double expectedHeight(double growth, double startHeight)
    {
        double expectedHeight = growth + startHeight;

        return expectedHeight;
    }// end of expectedHeight

    //takes in the expected growth parameters and startheight parameters and returns to the caller.
    //
    public static int percentageIncrease(double growth, double startHeight)
    {
        double difference = growth / startHeight;
        double percentage = difference * 100;
        percentage = Math.ceil(percentage);
        int integerPercentage = (int)percentage;
        
        return integerPercentage;
    }//end of percentageIncrease

}