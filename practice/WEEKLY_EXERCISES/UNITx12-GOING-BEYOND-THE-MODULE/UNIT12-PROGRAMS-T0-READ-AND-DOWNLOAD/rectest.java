/*  AUTHOR Paul Curzon
    VERSION 2 (11 October 2023)

    A class that demonstrates simple use of classes as records
    
    This creates records for student information
    
*/
    

class rectest
{
   public static void main(String[] p)
   {
        // Set up the first student

        Student s1 = new Student();
        s1.name = "Paul Curzon";
        s1.id = "4509930";
        s1.mark = 89;

        // Set up the second  student

        Student s2 = new Student();
        s2.name = "Sam Smith";
        s2.id = "5100000";
        s2.mark = 42;

        // Print their records

        System.out.println(s1.id + " " + s1.name + " " + s1.mark);
        System.out.println(s2.id + " " + s2.name + " " + s2.mark);
        
        return;
    } // END main
}


//  A Student has a name, a unique id and a mark (out of 100)
//
class Student
{
   String name;
   String id;
   int mark;
} // END class Student
