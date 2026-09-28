/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023
    
   Calculate the area of a circle given its diameter

***************************************** */

import java.util.Scanner;

class circles
{
    public static void main (String [] a)
    {
        int diameter;
        double radius;
        double area;
        
        diameter = inputInt("What is the diameter (in cm)?");
        radius = calcRadius(diameter);
        area = calcAreaOfCircle(radius);
        printCircleArea(diameter, area);
        
        return;
    } // END main


    /* *************************************************** */    
    // Given the diameter as an integer and the area as a double
    // Print a mesage about the area of the circle with that diameter
    //
    public static void printCircleArea(int circle_diameter, double circle_area)
    {
        System.out.println("The area of a circle with diameter " + 
                           circle_diameter + "cm is " +
                           circle_area + "cm squared");
        return;
    } // END printCircleArea
    

    /* *************************************************** */
    // Given a double radius
    // Calculate the area of a circle as a double
    //
    public static double calcAreaOfCircle(double circle_radius)
    {
        final double PI = 3.14159;
        double circle_area;
        circle_area = PI * circle_radius * circle_radius;
        
        return circle_area;
    } // END calcAreaOfCircle


    /* *************************************************** */    
    // Given the diameter of a circle as an integer
    // return its radius (half the diameter)
    //
    public static double calcRadius(int circle_diameter)
    {
        final double RADIUS_TO_DIAMETER = 2.0;
        double circle_radius;
        
        circle_radius = (double)circle_diameter / RADIUS_TO_DIAMETER;
        
        return circle_radius;
    } // END calcRadius
    
 
     /* *************************************************** */
    // General purpose method to input an integer
    // printing a given message as prompt.
    //
    public static int inputInt(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        String textinput;
        int result;
        
        System.out.println(message);
        textinput = keyboard.nextLine();
        result = Integer.parseInt(textinput);
        
        return result;
    } // END inputInt
    
} // END class circles