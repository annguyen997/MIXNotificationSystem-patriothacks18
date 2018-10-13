import javax.swing.JOptionPane;
public class Student{
   private String name; 
   private String phoneNumber; 
   private String major; 
   private String issue;
   private String GNumber;
   private static int numberOfStudents = 0;
   private static final int MAX_NUMBER_LENGTH = 9; 

   /* Constructor of Worker class */
   public Student(String name, String phoneNumber, String major, String GNumber){
      if(name == null || name.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nName must be provided");
      }
      if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
         JOptionPane.showMessageDialog(null,"Number must be greater than 0.");
      }
      if(major.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nMajor must be provided!");
      }
      if(issue.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nPlease enter a valid issue");
      }
      if(GNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must be provided.");
      }
      if(GNumber.indexOf('G') != 0) {
         JOptionPane.showMessageDialog(null, "Error! \nFirst character must start with G");
      }
      if(GNumber.length() != 9) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must consist of 9 characters.");
      } 
      this.name = name; 
      this.phoneNumber = phoneNumber; 
      this.major = major;
      this.issue = issue;
      this.GNumber = GNumber;
      numberOfStudents += 1; 
   }

   /* Accessor methods */
   public String getName(){
      return this.name;
   }

   public String getPhoneNumber(){
      return this.phoneNumber;
   } 

   public String getMajor(){
      return this.major;
   }

   public String getIssue() {
      return this.issue;
   }
   
   public String getGNumber() {
      return this.GNumber;
   }

   public static int getNumberOfStudents(){
      return numberOfStudents; 
   }

   /* Mutator methods */
   public void setName(String name){
      if(name == null || name.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nName must be provided");
      }
      else {
         this.name = name; 
      }
   }

   public void setPhoneNumber(String phoneNumber){
      if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
         JOptionPane.showMessageDialog(null,"Number must be greater than 0.");
      }
      else {
         this.phoneNumber = phoneNumber; 
      }
   }

   public void setMajor(String major){
      if(major.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nMajor must be provided!");
      }
      else {
         this.major = major; 
      }
   }

   public void setIssue(String issue) {
      if(issue.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nPlease enter a valid issue");
      }
      else {
         this.issue = issue;
      }
   }
   
   public void setGNumber(String GNumber) {
      if(GNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must be provided.");
      }
      if(GNumber.indexOf('G') != 0) {
         JOptionPane.showMessageDialog(null, "Error! \nFirst character must start with G");
      }
      if(GNumber.length() != 9) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must consist of 9 characters.");
      }
      else {
         this.GNumber = GNumber;
      }
   }

   public String toString() {
      return "The name of the student is: " + this.getName() + "\nThe phone number of the" + 
         "student is: " + this.getPhoneNumber() + "\nThe grade level of the student is: " + 
         this.getMajor() + "\nThe G Number for the student is: " + this.getGNumber() + 
         "\nThe issue that must be resolved: " + this.getIssue();
   }
}