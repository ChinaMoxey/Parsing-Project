/*
   testing the parser 
 */
package university;
import java.util.List;



/**
 *
 * @author China Moxey 
 */
public class University {
    /**
     * 
     * @param args 
     */
 public static void main(String [] args )
 {
     Parser read = new Parser();
     List<Student> readStudent = read.readStudents("Students.xml");
     readStudent.forEach((student) -> {
         System.out.println(student);
     });
       
 }
    
}
