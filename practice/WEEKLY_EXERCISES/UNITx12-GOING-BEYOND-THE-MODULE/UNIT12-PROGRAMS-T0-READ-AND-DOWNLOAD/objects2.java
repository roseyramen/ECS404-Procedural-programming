/*  AUTHOR Paul Curzon: 
    VERSION 2 11 October 2023

     Making the internals of an object private (part 2)

     This program shows how by using accessor methods with private instance variables
     you can change the way an object is implemented without having to change the 
     rest of the program. Only the class defining the object changes
     
     Essentially when we move to object-oriented programming as here we use specific syntax to
     do the things we were already doing with records. This gives the compiler more information of
     our intentions.

*/

// Note no change to this class even though the Student class is completely reimplemented
//
class objects2
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
} // END class objects2


/* ******************************
   Define a Student object
   ****************************** */

//  In this implementation the separate marks are not recorded instead we only store
//  the final mark as that is the only mark we will ever release, saving storage.
//  We also do simple error checking replacing negative paper marks by 0
//  and those more than 25 by 25
//
class Student
{
   private String name;
   private String id;
   private int mark;

    //  Take the 4 marks and store the percentage
   Student (String n, String i, int m1, int m2, int m3, int m4)
   {
     name = n;
     id = i;
     
     // Ensure no negative marks
     //
     if (m1 < 0) m1 = 0;
     if (m2 < 0) m2 = 0;
     if (m3 < 0) m3 = 0;
     if (m4 < 0) m4 = 0;
     
     // Ensure no marks too high
     //
     if (m1 > 25) m1 = 25;
     if (m2 > 25) m2 = 25;
     if (m3 > 25) m3 = 25;
     if (m4 > 25) m4 = 25;
    
     mark = m1 + m2 + m3 + m4;
     
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
   public int getStudentMark()
   {
      return mark;
   }  // END getStudentMark
   
} // END class Student