import java.util.ArrayList; 

public class Worker {
    private String name; 
    private String phoneNumber; 
    private String position; 
    private static int numberOfWorkers = 0; 
    private Knowledge studentsHelped;
    private /*static*/ String available;
    private static Knowledge<String> notifications; 

    /* Constructor of Worker class */
    public Worker(String name, String phoneNumber, String position, String available){
        /*if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must be provided");
        }
        if(Integer.parseInt(phoneNumber) < 0) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }*/
        
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.position = position;
        this.available = available;
        numberOfWorkers += 1; 
        
        if (notifications == null){
            notifications = new Knowledge<String>(); 
        }
        studentsHelped = new Knowledge<Student>();
        
    }

    /* Accessor methods */
    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.phoneNumber;
    } 

    public String getPosition(){
        return this.position;
    }

    public static int getNumberOfWorkers(){
        return numberOfWorkers; 
    }
    public String getAvailability(){
        return this.available; 
    }
    public static void getNotifications(){
        
        for (String notification : notifications){
            System.out.println(notification + "\n");
        }
    }

    /* Mutator methods */
    public void setName(String name){
        this.name = name; 
    }

    public void setNumber(String number){
        this.phoneNumber = number; 
    }

    public void setPosition(String position){
        this.position = position; 
    }
    
    public void setAvailability(String available){
        this.available = available; 
    }
    
     @SuppressWarnings("unchecked")
    public void addStudentHelped(Student student) {
        this.studentsHelped.add(student); 
    }
    
    public String toString() {
        return name;
    }
    
    /* To be edited/revised further */
    public static void removeNotification(String name){
        
    }
}