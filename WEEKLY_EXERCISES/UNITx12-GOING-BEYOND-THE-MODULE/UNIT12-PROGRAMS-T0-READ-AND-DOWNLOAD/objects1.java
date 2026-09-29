/*  AUTHOR Paul Curzon:
    VERSION 2 11 October 2023

     Making the internals of an object private

     It introduces the idea of a accessor methods and private instance variables
     
     Essentially when we move to object-oriented programming as here we use specific syntax to
    do the things we were already doing with records. This gives the compiler more information of
    our intentions.
*/
class objects1
{
   public static void main(String[] p)
   {
        // Create two students giving the marks for the 4 exam papers out of 25

        Student s1 = new Student("Paul Curzon","4509930", 22, 21, 25, 24);
        Student s2 = new Student("Sam Smith","5100000", 11, 13, 9, 19);

        // Print their records

        System.out.println(s1.getStudentId() + " " + 
                           s1.getStudentName() + " " + 
                           s1.getStudentMark());
        System.out.println(s2.getStudentId() + " " + 
                           s2.getStudentName() + " " + 
                           s2.getStudentMark());
                           
        return;
    } // END main
} // END class objects1


/* ******************************
   Define a Student object
   ****************************** */

//  A Student has a name, a unique id and four marks (out of 25)
//
class Student
{
   private String name;
   private String id;
   private int mark1, mark2, mark3, mark4;

   //  A constructor when information is given 
   //    - use those values to initialise the Student object
   Student (String n, String i, int m1, int m2, int m3, int m4)
   {
     name = n;
     id = i;
     mark1 = m1;
     mark2 = m2;
     mark3 = m3;
     mark4 = m4;
     
     return;
   } // END Student

   // Accessor methods
   //
   public String getStudentName()
   {
     return name;
   } // END getStudentName
   
   public String getStudentId()
   {
     return id;
   }  // END getStudentId
   
   // Returns the final combined percentage mark
   //
   public int getStudentMark()
   {
     int mark = mark1 + mark2 + mark3 + mark4;
     return mark;
   }  // END getStudentMark
   
} // END class Student