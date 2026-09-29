/* *****************************************
AUTHOR Paul Curzon
VERSION 2 (8 October 2023)

This program demonstrates 
 - simple file input.
 
   Read a single line from the file file.txt

   Adapt it so it asks the user for the name of the file using keyboard input first
   
   What happens if you modify it to do readLine twice 
   (both when the file contains only 1 line and when it contains 2 lines)
   
******************************************** */
import java.io.*;

class readhello2
{
    public static void main(String[] params) throws IOException 
    {
        String file_name = "file";
        BufferedReader inputStream = new BufferedReader(new FileReader(file_name + ".txt"));

        String s = inputStream.readLine();
        System.out.println(s);

        inputStream.close();
        
        return;
    } // END main
} // END class readhello2