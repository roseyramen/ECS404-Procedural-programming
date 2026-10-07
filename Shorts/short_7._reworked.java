
/**
*AUTHOR:RAYYAN RAHMAN*
*STUDENT_ID 221234567*
*DATE: 5/10/26*
*VERSION: 1*
*DESCRIPTION: A program that records pollution readings for three rivers and reports their water quality. // CHANGED
*/

import java.util.Scanner;


class River
{
    String name = "";
    int foreverChemicalCount = 0;
    int bacteriaCount = 0;
    boolean waterQuality = true; 
}


class riverEvaluator
{
    public static void main(String[] args)
    {
        final int numberOfEntries = 3;
        River [] riverList = new River[numberOfEntries];

        System.out.println("Please enter the name of the three rivers being monitored.");

        riverList = attainRiverNames(riverList,numberOfEntries);

        riverList = attainRiverMetrics(riverList,numberOfEntries);

        riverEval(riverList,numberOfEntries);

        return;
    }


    //a method which asks the user for an input and returns it
    public static String stringInput(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        String userInput = scanner.nextLine();

        return userInput;
    }//end of stringInput


    //creates a River record, sets its name and gives it starting readings // CHANGED
    public static River createRiver(String name)
    {
        River river = new River();

        river.name = name;
        river.foreverChemicalCount = 0;
        river.bacteriaCount = 0;
        river.waterQuality = true;

        return river;
    }


    //sets both pollution readings at once and updates the water quality rating // CHANGED
    public static River setRiverReadings(River river, int foreverChemicalCount, int bacteriaCount) // CHANGED
    {
        final int foreverChemicalBound = 5; // CHANGED: literal constant used for rating
        final int bacteriaCountBound = 200; // CHANGED: literal constant used for rating

        if (foreverChemicalCount >= 0 && bacteriaCount >= 0) // CHANGED: accessor does not accept invalid readings
        {
            river.foreverChemicalCount = foreverChemicalCount; // CHANGED
            river.bacteriaCount = bacteriaCount; // CHANGED

            if (foreverChemicalCount < foreverChemicalBound && bacteriaCount < bacteriaCountBound) 
            {
                river.waterQuality = true;
            }
            else
            {
                river.waterQuality = false;
            }
        }

        return river;
    }


    //returns the name stored in a River record // CHANGED
    public static String getName(River river)
    {
        String name = river.name;

        return name;
    }


    //converts a River record into the required report String // CHANGED
    public static String riverToString(River river) // CHANGED
    {
        final String poorIndicator = "poor"; // CHANGED
        final String goodIndicator = "good"; // CHANGED
        String quality = ""; // CHANGED

        if (river.waterQualityGood == true) // CHANGED
        {
            quality = goodIndicator; // CHANGED
        }
        else
        {
            quality = poorIndicator; // CHANGED
        }

        String riverString = "The water quality in the " + river.name + // CHANGED
                             " is " + quality + // CHANGED
                             " (forever chemicals: " + river.foreverChemicalCount + // CHANGED
                             ", bacteria: " + river.bacteriaCount + ")."; // CHANGED

        return riverString; // CHANGED
    }


    //asks for each river name, validates it and creates each River record // CHANGED
    public static River[] attainRiverNames(River[] riverList, int numberOfEntries)
    {
        for(int i = 0; i < numberOfEntries; i++)
        {
            String riverName = stringInput("River " + (i+1) +":");

            while(riverName.equals("")) // CHANGED: empty river names are not allowed
            {
                System.out.println("That is not a valid input. Enter a name."); // CHANGED
                riverName = stringInput("River " + (i+1) +":"); // CHANGED
            }

            River river = createRiver(riverName); // CHANGED: name is now passed to createRiver
            riverList[i] = river; // CHANGED: separate setName method is no longer needed
        }

        return riverList;
    }


    //asks for and validates both pollution readings for every river // CHANGED
    public static River [] attainRiverMetrics(River[] riverList, int numberOfEntries)
    {
        for(int i = 0; i < numberOfEntries; i++)
        {
            River river = riverList[i];
            String riverName = getName(river);
            boolean formatCorrect = false;
            int foreverChemicalCount = 0;
            int bacteriaCount = 0;

            System.out.println("Please give me the readings for the river "+ riverName +"."); // CHANGED: removed extra colon


            while(formatCorrect == false)
            {
                foreverChemicalCount = Integer.parseInt(
                    stringInput("What level of forever chemicals were found (in parts per trillion)?")
                );

                if(foreverChemicalCount >= 0)
                {
                    formatCorrect = true;
                }
                else // CHANGED
                {
                    System.out.println("That is not a valid reading. Enter a value >=0"); // CHANGED
                }
            }


            formatCorrect = false;


            while(formatCorrect == false)
            {
                bacteriaCount = Integer.parseInt(
                    stringInput("What level of bacterial contamination was found (in CFU per 100 ml)?")
                );

                if(bacteriaCount >= 0)
                {
                    formatCorrect = true;
                }
                else // CHANGED
                {
                    System.out.println("That is not a valid reading. Enter a value >=0"); // CHANGED
                }
            }


            riverList[i] = setRiverReadings(river, foreverChemicalCount, bacteriaCount); // CHANGED: both readings set together
        }

        return riverList;
    }


    //prints the completed report for every River record // CHANGED
    public static void riverEval(River[] riverList, int numberOfEntries)
    {
        for(int i = 0; i < numberOfEntries; i++)
        {
            River river = riverList[i];
            String riverReport = riverToString(river); // CHANGED: accesses record through required accessor

            System.out.println(riverReport); // CHANGED
        }

        return;
    }
}