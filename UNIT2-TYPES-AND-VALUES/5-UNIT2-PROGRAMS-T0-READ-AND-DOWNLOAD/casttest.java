	
/* ***************************************
    AUTHOR: Paul Curzon
    VERSION 2: 10/11/2023

	A program that tests what happens when you divide integers and try
	to get a double answer in different ways. This shows how casting to the right
	type at the right time matters (and that Java does hidden cast operations rather than
	the more helpful raising an error and requiring the programmer to be clear about what they want)
	
	An improvement might be to let the user input the original number to test
   ****************************************/

class casttest
{
    public static void main (String[] param)
    {
        final int MY_INT = 8; // Set a value to test
        
		System.out.println("MY_INT itself is " + MY_INT);
        
        int my_int_divided_by_3 = MY_INT/3; // Set a value to test
		System.out.println("MY_INT divided by 3 is " + my_int_divided_by_3);

        // This does integer division then converts the result to a double.
        //
        double my_int_divided_by_3_as_double = MY_INT/3; 
		System.out.println("MY_INT divided by 3 then stored as a double is " + my_int_divided_by_3_as_double);

        // This does integer division then converts the result to a double explicitly.
        // This is actually what the above does automatically adding the cast operation
        //
        double my_int_divided_by_3_cast_as_double = (double) (MY_INT/3); 
		System.out.println("MY_INT divided by 3 then cast explicitly to a double and stored " + my_int_divided_by_3_cast_as_double);


        // Now convert to a double first so we then do floating point division
        //
        double my_int_cast_divided_by_3_as_double = ((double) MY_INT)/3.0; 
		System.out.println("MY_INT cast to a double divided by 3.0 then stored as a double is " + my_int_cast_divided_by_3_as_double);
        
        // Notice the answer is not exactly accurate - and this can lead to calculation bugs.

		return;	
    } // END main

} // END class casttest