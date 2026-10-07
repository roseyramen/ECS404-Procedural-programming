
/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: This program takes in a range of river metrics and names, stores each metric to a name in an abstract data type and then outputs an evaluation for each river.
*/
import java.util.Scanner;

class River
{
    String name = "";
    int foreverChemicalCount = 0;
    int bacteriaCount = 0;
    boolean isQualityPoor = false; 
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

        
        for(int i = 0; i < numberOfEntries; i++)
        {
            River river = riverList[i];
            System.out.println(riverToString(river));
        }
        return;


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

    // creates a new river object and initialises the name field using a parameter that it takes in
    public static River createRiver(String name)
    {
        River river = new River();
        river.name = name;
        return river;
    }//end of createRiver

    // takes in chemical and bacteria count and checks if it is positive or not. If it is postive we assign the values to the river's fields. We also set the river booleans fields checking if the counts fit within the good bounds or not
    public static River setRiverMetrics(River river, int foreverChemicalCount,int bacteriaCount)
    {
        
        if (foreverChemicalCount >= 0 && bacteriaCount >= 0)
        {
        river.foreverChemicalCount = foreverChemicalCount;
        river.bacteriaCount = bacteriaCount;
        boolean isQualityPoor = false;

        final int foreverChemicalBound = 5;
        final int bacteriaCountBound = 200;

            if  (foreverChemicalCount < foreverChemicalBound && bacteriaCount < bacteriaCountBound)
            {
                isQualityPoor = false;
            }
            else
            {
                isQualityPoor = true;
            }

        river.isQualityPoor = isQualityPoor;

        return river;
        }
        else
        {
            return river;
        }
    }//end of setRiverMetrics

    // accesses the river's name field and returns it
    public static String getName(River river)
    {
        String name = river.name;

        return name;
    }//end of getName

    // asks the user to input river names and initialises it to an array
    public static River[] attainRiverNames(River[] riverList, int numberOfEntries)
    {
        for(int i = 0; i < numberOfEntries; i++)
        {

            String riverName = stringInput("River " + (i+1) +":");

                while (riverName.equals(""))
                {
                    System.out.println("That is not a valid input. Enter a name.");
                    riverName = stringInput("River " + (i+1) +":");
                }

            River river = createRiver(riverName);
            riverList[i] = river;
        }

        return riverList;
    }//end of attainRiverNames.

    //asks the user to nput the metrics for each river and then assigns it to the river object and then arrays
    //
    public static River [] attainRiverMetrics(River[] riverList, int numberOfEntries)
    {
        for(int i = 0; i < numberOfEntries; i++)
        {
            River river = riverList[i];
            String riverName = getName(river);
            boolean formatCorrect = false;
            int foreverChemicalCount = 0;
            int bacteriaCount = 0;

            System.out.println("Please give me the readings for the river "+ riverName +".");

                while(formatCorrect == false )
                {
                foreverChemicalCount = Integer.parseInt(stringInput("What level of forever chemicals were found (in parts per trillion)?"));
                    
                    if(foreverChemicalCount >= 0)
                    {
                        formatCorrect = true;
                    }
                    else
                    {
                            System.out.println("That is not a valid reading. Enter a value >=0");
                    }
                }
                
                formatCorrect = false;
                while(formatCorrect == false)
                {
                bacteriaCount = Integer.parseInt(stringInput("What level of bacterial contamination was found (in CFU per 100 ml)?"));
                    
                    if(bacteriaCount >= 0)
                    {
                        formatCorrect = true;
                    }
                    else
                    {
                        System.out.println("That is not a valid reading. Enter a value >=0");
                    }
                }

            riverList[i] = setRiverMetrics(river, foreverChemicalCount, bacteriaCount);


        }

        return riverList;
    }//end of attainRiverMetrics

    //takes in a river object and then accesses the fields to figure out what message to sent back to the caller.
    //
    public static String riverToString(River river)
    {
        final String quality;

        if (river.isQualityPoor == true)
        {
            quality = "poor";
        }
        else
        {
            quality = "good";
        }

        String message = "The water quality in the " + river.name + " is " + quality + " (forever chemicals: " + river.foreverChemicalCount + ", bacteria: " + river.bacteriaCount + ").";

        return message;
    }//end of riverToString
}



