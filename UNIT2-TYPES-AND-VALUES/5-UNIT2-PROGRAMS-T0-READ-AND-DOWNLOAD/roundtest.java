/* ***************************************
    AUTHOR: Paul Curzon
    VERSION 2: 10/11/2023
    
	A program that tests various ways of rounding/truncating a decimal number.
	Modify it to experiment and make sure you know what each approach does...
	What would be the result of multiplying by 100, truncating and then dividing by 100, 
	for example?
	
	An improvement might be to let the user input the original number to test
   ****************************************/

class roundtest
{
    public static void main (String[] param)
    {
        final double TEST_D = 5.99999; // Set a value to test
        
        System.out.println("D itself is " + TEST_D);
        
        double d_round = Math.round (TEST_D); 
        System.out.println("D rounded using Math.round is " + d_round); 

        double d_floor = Math.floor (TEST_D); 
        System.out.println("D floored using Math.floor is " + d_floor); 
       
        int d_cast_to_int = (int) (TEST_D); 
        System.out.println("D cast to an int is " + d_cast_to_int); 
        
        double d2 = TEST_D*10;
        double d3 = (int) (d2);
        double d4 = d3/10;
        System.out.println("D multiplied by 10 truncated then divided by 10 is " + d4);

      
        double d5 = TEST_D*10;
        double d6 = Math.round (d5);
        double d7 = d6/10;
        System.out.println("D multiplied by 10 rounded then divided by 10 is " + d7);

		return;
    } // END main

} // END class roundtest