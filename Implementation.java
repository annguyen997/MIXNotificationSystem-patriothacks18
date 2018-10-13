import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
public class Implementation {
   public static void main(String[] args) { 
      final int MAX_STUDENTS = 30000;
    
      int studentOption = getStudentOptions();
      while(studentOption != 2) {
         switch(studentOption) {
            case 1: 
               addStudent();
               break;
                
            case 2: 
               readFiles();
               break;
                
            case 3: exitApplication();
            
            default:
               throw new RuntimeException("Option cannot be less than 1. Option cannot be greater than 2.");
         }
         studentOption = getStudentOptions();
      }
   }
    
   public static void addStudent(String name, String number, String major, String Gnumber) {
      Student addStudent = new Student(name, number, major, Gnumber); 
      students.add(addStudent); //Using information from Main class - this may not be operational. 
        
   }
    
   public static void readFiles() {
        
   }
    
   public static void exitApplication() {
        
      System.exit(0);
   }
    
   public static int getStudentOptions() {
      int studentChoice;
   
      do {
         try {
            studentChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter your selection: \n(1) Add Student Info" + 
               "\n(2) Exit Application"));
         }
         catch (NumberFormatException e) {
            studentChoice = 0;
         }
         if (studentChoice < 1 || studentChoice > 2) {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid menu option.");
         }
      }while (studentChoice < 1 || studentChoice > 2);
      
      return studentChoice;
   }
}
