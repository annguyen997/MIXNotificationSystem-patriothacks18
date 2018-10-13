public class Worker {
    private String name; 
    private String number; 
    private String position; 
    private static int numberOfWorkers = 0; 

    /* Constructor of Worker class */
    public Worker(String name, String number, String position){
        this.name = name; 
        this.number = number; 
        this.position = position; 
        numberOfWorkers += 1; 

    }

    /* Accessor methods */
    String getName(){
        return this.name;
    }

    String getNumber(){
        return this.number;
    } 

    String getPosition(){
        return this.position;
    }

    int getNumberOfWorkers(){
        return numberOfWorkers; 
    }

    /* Mutator methods */
    void setName(String name){
        this.name = name; 
    }

    void setNumber(String number){
        this.number = number; 
    }

    void setPosition(String position){
        this.position = position; 
    }

} 