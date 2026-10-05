/* *****************************************
   AUTHOR Paul Curzon
   VERSION 2 (2 October 2023)

  Bubble sort program
  This version includes a trace statement so you can see the pattern of the sorting
  It prints the result at the end of each pass.
  
  ******************************************** */


class bubble_sort2 
{

    public static void sort (int[] array)
    {
        boolean sorted=false;

        while (!sorted)
        {
	       // array potentially sorted 
            sorted = true;
            
	       //traverse array switching ill-ordered pairs
	       for (int i=0; i < array.length-1; i++)
	       {
                if (array[i] > array [i+1])
                {
		          // swap them
		          int tmp = array[i+1];
		          array[i+1] = array[i];
		          array[i] = tmp;
		          // array wasn't sorted
		          sorted = false;
		          
                  // write array so can see whats happening
                  writeArray(array);

		         }
	       }
	    }
	    
	    return;
    } // END sort
	
	// Print out the contents of a given array
	//    
    public static void writeArray (int[] array)
    {
	    for (int i=0; i < array.length; i++)
	    {
	             System.out.print(array[i]+" ");
	    }
	    
	    System.out.println();
	    
	    return;
    } // END writeArray



	
    public static void main (String param[])
    {
        // declare array and initialise with random elements
        int[] array = {5,4,3,2,1};
        
        // print it out
        writeArray(array);
         
        sort(array);        

        // print it out again
        writeArray(array);
        
        return;
    } // END main
} // END class bubble_sort2
