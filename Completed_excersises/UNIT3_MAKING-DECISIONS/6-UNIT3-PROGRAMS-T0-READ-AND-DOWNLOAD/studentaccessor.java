/* ***************************************************
   AUTHOR Paul Curzon
   VERSION 2: 10/11/2023

       This program demonstrates a simple use of records, accessed by getter and setter methods
       creating a new type
       to represent student data that groups different information about a single
       student in a way so that it can be stored in a single variable.
       
       It creates a new (empty) Student record, fills it with data then prints that data out 
       
******************************************** */

class studentaccessor
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
   
   // Accessor get methods for Student record type
   // Return the name from a student record
   //
   public static String getName (Student s)
   {
     return s.name;
   } // END getName

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
     return s.mark;
   } // END getMark

   // Setter methods for Student record type
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
     s.mark = smark1 + smark2;
     return s;
   } // EDND setMark2   
} //END class studentrecord


	
/* ***************************************************
       Create a new type (a record) called Student that records student data
*/

class Student
{
   String name; // The Students full name
   String id;   // Their unique ID number
   int mark;    // their final total mark
   
} // END class Student