public class Student {
    private String name; 
    private String phoneNumber; 
    private String gradeLevel; 
    private String issue;
    private static int numberOfStudents = 0;
    private static final int MAX_NUMBER_LENGTH = 9; 

    /* Constructor of Worker class */
    public Student(String name, String phoneNumber, String gradeLevel){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Error! \nName must be provided");
        }
        if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        if(!gradeLevel.equalsIgnoreCase("freshman") || !gradeLevel.equalsIgnoreCase("sophomore") ||
        !gradeLevel.equalsIgnoreCase("junior") || !gradeLevel.equalsIgnoreCase("senior")) {
            throw new IllegalArgumentException("Error! \nPlease enter a valid grade level.");
        }
        if(issue.equals("")) {
            throw new IllegalArgumentException("Error! \nPlease enter a valid issue");
        }
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.gradeLevel = gradeLevel;
        this.issue = issue; 
        numberOfStudents += 1; 
    }

    /* Accessor methods */
    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.number;
    } 

    public String getGradeLevel(){
        return this.gradeLevel;
    }

    public String getIssue() {
        return this.issue;
    }

    public static int getNumberOfStudents(){
        return numberOfStudents; 
    }

    /* Mutator methods */
    public void setName(String name){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Error! \nName must be provided")
        }
        else {
            this.name = name; 
        }
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        else {
            this.phoneNumber = phoneNumber; 
        }
    }

    public void setGradeLevel(String gradeLevel){
        if(!gradeLevel.equalsIgnoreCase("freshman") || !gradeLevel.equalsIgnoreCase("sophomore") ||
        !gradeLevel.equalsIgnoreCase("junior") || !gradeLevel.equalsIgnoreCase("senior")) {
            throw new IllegalArgumentException("Error! \nPlease enter a valid grade level.");
        }
        else {
            this.gradeLevel = gradeLevel; 
        }
    }

    public void setIssue(String issue) {
        if(issue.equals("")) {
            throw new IllegalArgumentException("Error! \nPlease enter a valid issue");
        }
        else {
            this.issue = issue;
        }
    }

    public String toString() {
        return "The name of the student is: " + this.getName() + "\nThe phone number of the 
        student is: " + this.getPhoneNumber() + "\nThe grade level of the student is: " + 
        this.getGradeLevel + "\nThe issue that must be resolved: " + this.getIssue();
    }

} 
