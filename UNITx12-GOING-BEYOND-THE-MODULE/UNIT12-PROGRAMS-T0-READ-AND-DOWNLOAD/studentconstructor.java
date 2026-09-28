    /* ***************************************************
       AUTHOR Paul Curzon
       VERSION 2 (11 October 2023)

       This program demonstrates how in an object-oriented program constructors
       can replace specific methods to create a new object
    */
import java.util.Scanner;


class studentconstructor
{

    // A simple test method setting a student record then printing it out

   public static void main(String[] p)
   {
       Student s0 = new Student("Martin Luther King", 3921072);
       System.out.println(studentToString(s0));
       
       Student s1 = new Student("Barack Obama", 4509930);
       int mark1 = 49;
       int mark2 = 50;
       setMarks(s1, mark1, mark2);
       System.out.println(studentToString(s1));
       
       return;
   }  // END main

    /* ***************************************************

    ** Methods defining a Student ADT
    ** Theses are the only ways we should access a Student
    ** Get a student record as a formatted string
    ** Get a student name
    ** Get a student ID
    ** Get a student's combined mark
    ** Create a student - now part of the object class definition 
    ** Set the marks for a student
    **/
    
    // Convert a student record to a printable string
    //
   public static String studentToString (Student s)
   {
     String message = getId(s) + "\t" + getName(s) + "\t" + getMark(s);
     return message;
   }  // END 

    // Getter methods for Student record type
    // Return the name from a student record
    //
   public static String getName (Student s)
   {
     return s.name;
   }  // END studentToString

    // Return the id from a student record
   public static int getId (Student s)
   {
     return s.id;
   }  // END getId

    // Return the total mark from a student record
    // This is the only mark accessible
   public static int getMark (Student s)
   {
     return (s.exammark + s.courseworkmark); // WE CHANGED THIS
   }  // END getMark

    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    //
   public static void setMarks (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;
     s.exammark = smark2;
     
     return;
   }  // END setMarks
   
} //END class studentrecord

/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (a record) called Student that records student data
       A student has a name and an ID and two marks.
    */

class Student
{
   String name;           // The Students full name
   int id;                // Their unique ID number
   int courseworkmark;    // their coursework mark /50
   int exammark;          // their exam mark /50
  
   // CONSTRUCTOR
   // To create a student BOTH a name and ID must be set at the same time
   // The marks are set to 0 to mean no mark set.
   //
   public Student (String studentname, int studentid)
   {   
     id = studentid;
     name = studentname;
     courseworkmark = 0;
     exammark = 0;
     
     return;
   } // END Student

} // END class Student