/*  AUTHOR Paul Curzon: 


    Creates student objects
    
    A class that demonstrates how records sart to become objects
    as methods are linked to the record.
    It introduces the idea of a constructor - a special method in the 
    class that is called with new to initialise an object
*/
class rectest2
{
   public static void main(String []p)
   {
        // Set up the first student using a default constructor
        // We update values as before

        Student s1 = new Student();

        // Print to show the record has the empty values at this point

        System.out.println(s1.id + " " + s1.name + " " + s1.mark);

        s1.name = "Paul Curzon";
        s1.id = "4509930";
        s1.mark = 89;

        // Set up the second  student using the normal constructor
        // by passing it the information as arguments.

        Student s2 = new Student("Sam Smith","5100000", 42);

        // Print their records

        System.out.println(s1.id + " " + s1.name + " " + s1.mark);
        System.out.println(s2.id + " " + s2.name + " " + s2.mark);
        
        return;
    } // END main
} // END  class rectest2

//  A Student has a name, a unique id and a mark (out of 100)
class Student
{
   String name;
   String id;
   int mark;

   //  A default constructor 
   //    - if no information is given create a Student with empty values
   Student ()
   {
     name = "";
     id = "";
     mark = 0;
     
     return;
   } // END  Student

   //  A constructor when information is given 
   //    - use those values to initialise the Student object
   //
   Student (String n, String i, int m)
   {
     name = n;
     id = i;
     mark = m;
     
     return;
   } // END Student
   
} // END class Student