/* *****************************************
AUTHOR Paul Curzon
VERSION 2 (8 October 2023)

Illustrate input when the file size is unknown in advance

Read a file in, displaying it line by line on the screen.

Modify the program so it copies the file input out to a new file
  
******************************************** */
import java.io.*;

class readfile
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("in.txt"));
 
        String next_word = inStream.readLine();

        // Repeatedly check the current word and write it to the output file if not null
        while (next_word != null)
        {
            System.out.println(next_word);
            next_word = inStream.readLine();
        }

        inStream.close();
        
        return;
    } // END main
} // END class readfile