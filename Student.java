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
   public Student(String name, String phoneNumber, String major, String issue, String GNumber){
      if(name == null || name.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nName must be provided");
         throw new IllegalArgumentException();
      }
      if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
         JOptionPane.showMessageDialog(null,"Number must be greater than 0.");
         throw new IllegalArgumentException();
      }
      if(major.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nMajor must be provided!");
         throw new IllegalArgumentException();
      }
      if(issue.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nPlease enter a valid issue");
         throw new IllegalArgumentException();
      }
      if(GNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must be provided.");
         throw new IllegalArgumentException();
      }
      if(GNumber.indexOf('G') != 0) {
         JOptionPane.showMessageDialog(null, "Error! \nFirst character must start with G");
         throw new IllegalArgumentException();
      }
      if(GNumber.length() != 9) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must consist of 9 characters.");
         throw new IllegalArgumentException();
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
         throw new IllegalArgumentException();
      }
      else {
         this.name = name; 
      }
   }

   public void setPhoneNumber(String phoneNumber){
      if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
         JOptionPane.showMessageDialog(null,"Number must be greater than 0.");
         throw new IllegalArgumentException();
      }
      else {
         this.phoneNumber = phoneNumber; 
      }
   }

   public void setMajor(String major){
      if(major.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nMajor must be provided!");
         throw new IllegalArgumentException();
      }
      else {
         this.major = major; 
      }
   }

   public void setIssue(String issue) {
      if(issue.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nPlease enter a valid issue");
         throw new IllegalArgumentException();
      }
      else {
         this.issue = issue;
      }
   }
   
   public void setGNumber(String GNumber) {
      if(GNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must be provided.");
         throw new IllegalArgumentException();
      }
      if(GNumber.indexOf('G') != 0) {
         JOptionPane.showMessageDialog(null, "Error! \nFirst character must start with G");
         throw new IllegalArgumentException();
      }
      if(GNumber.length() != 9) {
         JOptionPane.showMessageDialog(null, "Error! \nGNumber must consist of 9 characters.");
         throw new IllegalArgumentException();
      }
      else {
         this.GNumber = GNumber;
      }
   }

   public String toString() {
      return "Name: " + this.getName() + "\nNumber: " + this.getPhoneNumber() + "\nMajor: " + 
         this.getMajor() + "\nG Number: " + this.getGNumber() + 
         "\nIssue: " + this.getIssue() + "\n****************************************************\n";
   }
}