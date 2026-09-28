/* ***************************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

       This program demonstrates a simple use of records, accessed by getter and setter methods
       It shows hwo they allow us to change the implementation of the data type without changing
       other parts of the program - only the getter and setter methods for the part changed.
       
       This version stores both coursework and exam mark not just the total in the record.
       
       It creates a new (empty) Student record, fills it with data then prints that data out 
       
       Modify it to print coursework and exam marks by adding getter methods for them.
       
******************************************** */

class studentaccessor2
{

   public static void main(String []p)
   {
       createAndPrintStudent();
       
       return;
   } // END main
   
   // A simple test method setting a student record then printing it out
   //
   public static void createAndPrintStudent()
   {
       Student s1 = new Student();
       int mark1 = 40;
       int mark2 = 49;

       s1 = setName(s1,"Paul Curzon");
       s1 = setId(s1, "4509930");
       s1 = setMark2(s1, mark1, mark2);
       
       System.out.println(getId(s1) + " " + getName(s1) + " " + getMark(s1));
       
       return;
   } // END createAndPrintStudent
   
   // Get methods for Student record type
   // Return the name from a student record
   //
   public static String getName (Student s)
   {
     return s.name;
   } // END  getName

   // Return the id from a student record
   //
   public static String getId (Student s)
   {
     return s.id;
   } // END getId

   // Return the total mark from a student record
   //
   public static int getMark (Student s)
   {
     return (s.exammark + s.courseworkmark); // WE CHANGED THIS
   } // END getMark

   // Set methods for Student record type
   // Set the id of a student returning the updated record
   //
   public static Student setId (Student s, String studentid)
   {
     s.id = studentid;
     return s;
   } // END setId

   // Set the name of a student returning the updated record
   //
   public static Student setName (Student s, String studentname)
   {
     s.name = studentname;
     return s;
   } // END setName
   
   
   // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
   // The two marks are just added to give the overall final mark
   //
   public static Student setMark2 (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;  // WE CHANGED THIS
     s.exammark = smark2;
     return s;
   } // END  setMark2
   
} //END class studentrecord

/* *************************************************** */
/* *************************************************** */

	
/* ***************************************************
       Create a new type (a record) called Student that records student data
       We've changed the implementation here to store both marks
       This will us to add more functionality to access the separate marks (not done here)
*/

class Student
{
   String name; // The Students full name
   String id;   // Their unique ID number
   int courseworkmark;    // their coursework mark /50  // WE CHANGED THIS FROM A SINGLE MARK
   int exammark;         // their exam mark /50
   
} // END class Student