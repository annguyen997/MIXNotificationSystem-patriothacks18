public class Worker {
    private String name; 
    private String phoneNumber; 
    private String position; 
    private static int numberOfWorkers = 0; 

    /* Constructor of Worker class */
    public Worker(String name, int phoneNumber, String position){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must be provided");
        }
        if(phoneNumber < 0) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.position = position; 
        numberOfWorkers += 1; 

    }

    /* Accessor methods */
    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    } 

    public String getPosition(){
        return this.position;
    }

    public static int getNumberOfWorkers(){
        return numberOfWorkers; 
    }

    /* Mutator methods */
    public void setName(String name){
        this.name = name; 
    }

    public void setNumber(String number){
        this.number = number; 
    }

    public void setPosition(String position){
        this.position = position; 
    }

} 
