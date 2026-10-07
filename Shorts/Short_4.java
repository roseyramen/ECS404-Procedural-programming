
/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: this program asks the user to input wind speeds from 5 different monitors, we then calculate the average and then print that along with a descriptor
*/






import java.util.Scanner; // imports the scanner class


public class windEvaluator 
{
    //start of the main method
    //
    public static void main(String [] a)
    {
        int total = 0;
        int largest_value = 0;
        int position = 0;

        final int indexToPositionConstant = 1;
        final int numberOfReadings = 5;
        final int speedLowerBound = 0;
        final int speedUpperBound = 260;

        for (int i = 0; i < numberOfReadings; i++)
        {   
            int temporaryValue= Integer.parseInt(stringInput("Monitor " + (i+indexToPositionConstant) + ". What is the wind speed (a whole number in mph)?"));

                if(temporaryValue < speedLowerBound || temporaryValue > speedUpperBound)
                {
                    System.out.println("That speed is invalid. Please start again");

                    return;
                }

            total = temporaryValue + total;

                if (largest_value < temporaryValue)
                {
                    largest_value = temporaryValue;
                    position = i + indexToPositionConstant;
                }
        }
        int averageValue = averageCalcultor(total,numberOfReadings);
        String descriptor = descriptor(averageValue);
        if (descriptor.equals("error"))
        {
            return; // i little watermark just incase anyone decides to steal my work the error thing isnt needed i think. 
        }

        if (descriptor.equals("error"))
        {
            return;
        }

        System.out.println("The highest wind speed recorded was " + largest_value + " mph from Monitor " + position + ".");
        System.out.println("The average wind speed recorded was " + averageValue + " mph.");
        System.out.println("The average wind speed was " + descriptor + ".");
    }// end of the main method

    //a method which asks the user for an input and returns it
    //
    public static String stringInput(String message)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);

            String userInput = scanner.nextLine();

            return userInput;
        }//end of stringInput

    // calculates the average wind speed
    public static int averageCalcultor(int total,int numberOfReadings)
    {
        int average = total / numberOfReadings;

        return average;
    }//end of averageCalcultor
    

    //takes in a parameter which represents the avaergae wind speed and then returns a descriptor
    //
    public static String descriptor(int average)
    {
        final String describeCalm = "CALM";
        final String describeBreezy = "BREEZY";
        final String describeWindy= "WINDY";
        final String describeStormy = "STORMY";
        final String error = "error";

        final int calmUpperBound = 10;
        final int breezyUpperBound = 29;
        final int windyUpperBound = 49;
        final int stormyLowerBound = 50;

        if (average <= calmUpperBound)
        {
            return describeCalm;
        }
        else if (average <= breezyUpperBound)
        {
            return describeBreezy;
        }
        else if (average <= windyUpperBound)
        {
            return describeWindy;
        }
        else if (average >= stormyLowerBound)
        {
            return describeStormy;
        }
        else
        {
            return error;
        }

    }//end of descriptor
}//end of windEvaluator
