    /* ***************************************************
       AUTHOR Paul Curzon
       VERSION 2 (11 October 2023)

       This program demonstrates how in an object-oriented program the methods defining an ADT 
       can all be placed in the object's class definition.
       
       The instance variables are now private. The compiler now stops them being referred to
       outside the class. The only way to access them is through the public methods provided in
       the class.
       
       The methods no longer need to be passed an object (previously a record) as an argument.
       Instead the dot notation is used in the call to indicate which actual object is to be manipulated.
       As with constructors we drop the word static from the header and no longer refer to 
       eg s.name in the getter and setter methods, but instead refer to the instance variables directly.
       We also only use the getter and setter methods 
    */
    
import java.util.Scanner;


class studentobject
{

    // A simple test method setting a student record then printing it out
    // Note that the object being manipulated is no longer an argument in the method calls.
    // Instead the dot notation is used.

   public static void main(String[] p)
   {
       Student s0 = new Student("Martin Luther King", 3921072);
       System.out.println(s0.studentToString());
       
       Student s1 = new Student("Barack Obama", 4509930);
       int mark1 = 49;
       int mark2 = 50;
       s1.setMarks(mark1, mark2);
       System.out.println(s1.studentToString());
       
       return;
   } // END main
   
   
} //END class studentrecord

/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (an object) called Student that records student data.
       It implements the student ADT below
       
    ** A student has a name and an ID and two marks.
 
    ** Theses are the only ways we should access a Student
    ** Get a student record as a formatted string
    ** Get a student name
    ** Get a student ID
    ** Get a student's combined mark
    ** Create a student - now part of the object class definition 
    ** Set the marks for a student
    **/
    


class Student
{
   // INSTANCE VARIABLES

   private String name; 			// The Students full name
   private int id;   				// Their unique ID number
   private int courseworkmark;    // their coursework mark /50
   private int exammark;         // their exam mark /50
   

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
   } // END 
 
     // METHODSJECT
  
    // Convert a student record to a printable string
    // the keyword this is a way of calling another method in this class
    //
   public  String studentToString ()
   {
     String message = this.getId() + "\t" + this.getName() + "\t" + this.getMark();
     return message;
   } // END studentToString

    // Getter methods for Student object type
    // Return the name from this student object
    //
   public  String getName ()
   {
     return name;
   } // END getName

    // Return the id of this student
   public int getId ()
   {
     return id;
   } // END getId

    // Return the total mark of this student 
    // This is the only mark accessible
   public int getMark ()
   {
     return (exammark + courseworkmark); 
   } // END getMark

    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    //
   public void setMarks (int smark1, int smark2)
   {
     courseworkmark = smark1;
     exammark = smark2;
     
     return;
   } // END setMarks

} // END class Student