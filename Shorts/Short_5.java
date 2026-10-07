

/*
AUTHOR:RAYYAN RAHMAN
STUDENT_ID 221234567
DATE: 5/10/26
VERSION: 1
DESCRIPTION: This program askss the user to input the nnumber of grades they got for their courseworks and uses arrays to work out the overall portfolio grade
*/



import java.util.Scanner; // imports the scanner class

class gradeCalculator
{
    public static void main(String [] a)
    {
        int[] grades = gradeCollector();
        int[] betterGrades =gradesOrBetter(grades);
        String portfolioGrade = portfolioEvaluate(grades,betterGrades);

        System.out.println("Your portfolio earned a " + portfolioGrade + " grade overall.");

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

    //A method which asks the user to input how many of each grade that they got, puts it in an array and returns the array to the caller
    //
    public static int[] gradeCollector()
    {
        final int numberOfGrades = 7;
        int[] grades = new int[numberOfGrades];
        String[] letters = {"A+", "A", "B", "C", "D", "F", "G"};

        for (int i = 0; i < numberOfGrades; i++)
        {   
            String message = "how many " + letters[i] + " grades did you get?";
            grades[i] = Integer.parseInt(stringInput(message));
        }
        return grades;
    }//end of gradeCollector

    //a method which uses a the transcript to create a second transcript that creates a "better than" transcript which is used in future calculations
    public static int[] gradesOrBetter(int [] grades)
    {
        final int numberOfGrades = 7;
        int better = 0;
        int[] betterGrades = new int[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++)
        {
            betterGrades[i] = grades[i] + better;
            better = betterGrades[i];
        }

        return betterGrades;
    }//end of better grades

// uses better grade transcript and  normal transcript to evaluate teh portfolio
    public static String portfolioEvaluate(int[] grades, int[] betterGrades)
    {
        String grade = "";

        final int totalGrades = 8;
        final int minimumRequired = 6;

            if ((grades[0] == 6) && (grades[1] == 2))
            {
                grade = "A*";
            }
            else if ((grades[0] == 5) && (grades[1] == 3))
            {
                grade = "A++";
            }
            else if ((grades[0] == 4) && (grades[1] == 4))
            {
                grade = "A+";
            }
            else if ((betterGrades[1] >= minimumRequired) && (betterGrades[2] == totalGrades))
            {
                grade = "A";
            }
            else if ((betterGrades[2] >= minimumRequired) && (betterGrades[3] == totalGrades))
            {
                grade = "B";
            }
            else if ((betterGrades[3] >= minimumRequired) && (betterGrades[4] == totalGrades))
            {
                grade = "C";
            }
            else if ((betterGrades[4] >= minimumRequired) && (betterGrades[5] == totalGrades))
            {
                grade = "D";
            }
            else if ((betterGrades[4] >= minimumRequired) && (betterGrades[6] == totalGrades))
            {
                grade = "F";
            }
            else if (betterGrades[6] == totalGrades)
            {
                grade = "G";
            }
            else
            {
                grade = "Q";
            }
        return grade;
    }



        
    }