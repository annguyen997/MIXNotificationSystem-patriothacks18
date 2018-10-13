public class Student {
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
            throw new IllegalArgumentException("Error! \nName must be provided");
        }
        if(phoneNumber.equals("") || phoneNumber.length() < MAX_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        if(major.equals("")) {
            throw new IllegalArgumentException("Error! \nMajor must be provided!");
        }
        if(issue.equals("")) {
            throw new IllegalArgumentException("Error! \nPlease enter a valid issue");
        }
        if(GNumber.equals("")) {
            throw new IllegalArgumentException("Error! \nGNumber must be provided.");
        }
        if(GNumber.indexOf('G') != 0) {
            throw new IllegalArgumentException("Error! \nFirst character must start with G");
        }
        if(GNumber.length() != 9) {
            throw new IllegalArgumentException("Error! \nGNumber must consist of 9 characters.");
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
            throw new IllegalArgumentException("Error! \nName must be provided");
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

    public void setMajor(String major){
        if(major.equals("")) {
            throw new IllegalArgumentException("Error! \nMajor must be provided.");
        }
        else {
            this.major = major; 
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
    
    public void setGNumber(String GNumber) {
        if(GNumber.equals("")) {
            throw new IllegalArgumentException("Error! \nGNumber must be provided.");
        }
        if(GNumber.indexOf('G') != 0) {
            throw new IllegalArgumentException("Error! \nFirst character must start with G");
        }
        if(GNumber.length() != 9) {
            throw new IllegalArgumentException("Error! \nGNumber must consist of 9 characters.");
        }
        else {
            this.GNumber = GNumber;
        }
    }

    public String toString() {
        return "Name: " + this.getName() + "\nNumber: "  + this.getPhoneNumber() + "\nMajor: " + 
        this.getMajor() + "\nG Number: " + this.getGNumber() + 
        "\nIssue: " + this.getIssue() + "\n*************************************************************\n";
    }
} 