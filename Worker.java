import java.util.ArrayList; 

public class Worker {
    private String name; 
    private String phoneNumber; 
    private String position; 
    private static int numberOfWorkers = 0; 
    private static List<String> notifications; 

    /* Constructor of Worker class */
    public Worker(String name, String phoneNumber, String position){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must be provided");
        }
        if(Integer.parseInt(phoneNumber) < 0) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.position = position; 
        numberOfWorkers += 1; 
        
        if (notifications == null){
            notifications = new ArrayList<String>(); 
        }

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
    
    public static String getNotifications(){
        
        System.out.println("There are currently " + notifications.size() + " notifications.\n"); 
        
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
    public static String toString() {
        return " The name of the worker is " +  "  " +  name + "  " + " The phone number of is " + "  " + phoneNumber + " " + 
    " The position is " + "  " +  position + "\n\n" ;
    }
    
    /* To be edited/revised further */
    public static String removeNotification(){
    }
} 
