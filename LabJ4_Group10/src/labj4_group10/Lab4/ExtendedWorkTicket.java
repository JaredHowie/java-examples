/*
 * This class inherits from the WorkTicket class and adds the functionality
 * to open and close tickets.
 */
package labj4_group10.Lab4;

/**
 *
 * @author Jared Howie and Trevor Andrus
 */
public class ExtendedWorkTicket extends WorkTicket{
    
    //Attribute
    boolean myOpen;
    
    /**
     * Accesses the myOpen value
     * 
     * @return the myOpen value
     */
    public boolean isOpen(){
        return myOpen;
    }
    
    //Constructors
    
    /**
     * 
     * Default constructor
     * 
     */
    public ExtendedWorkTicket(){
        super();
        myOpen = true;
    }
    
    /**
     * 
     * Parameterized constructor
     * 
     * @param ticketNumber the tickets number
     * @param id the tickets id
     * @param day day the ticket was created
     * @param month month the ticket was created
     * @param year year the ticket was created
     * @param description description of the issue
     * @param open whether the ticket is open or not
     */
    public ExtendedWorkTicket(int ticketNumber, String id, int day, int month, int year, String description, boolean open){
        super(ticketNumber, id, day, month, year, description);
        myOpen = open;
    }
    
    /**
     * 
     * @param ticket a WorkTicket object
     * @param open whether the ticket is open or not
     */
    public ExtendedWorkTicket(WorkTicket ticket, boolean open){
        super(ticket);
        myOpen = open;
    }
    
    /**
     * 
     * @param ticketNumber the tickets number
     * @param id the tickets id
     * @param day day the ticket was created
     * @param month month the ticket was created
     * @param year year the ticket was created
     * @param description description of the issue
     * @param open whether the ticket is open or not
     * @return a boolean indicating whether the ticket was set or not
     */
   
    public boolean setWorkTicket(int ticketNumber, String id, int day, int month, int year, String description, boolean open) {
        boolean isValid;
        
        isValid = super.setWorkTicket(ticketNumber, id, day, month, year, description);
        
        if(isValid == true){
            myOpen = open;
        }
        
        return isValid;

    }
    
    
    /**
     * Returns this object as a string.
     *
     * @return a formatted string showing the WorkTicket details.
     */
    @Override
    public String toString() {
        String ticket;
        if (this.myOpen == true){
            ticket = String.format(super.toString() + "\nTicket:\t\t\tOPEN");
        }
        else{
            ticket = String.format(super.toString() + "\nTicket:\t\t\tCLOSED");
        }
        
        
        return ticket;
    }
    
    /**
     * 
     * Used to set the myOpen value to true(open the ticket)
     * 
     */
    public void openTicket(){
        myOpen = true;
    }
    
     /**
     * 
     * Used to set the myOpen value to false(close the ticket)
     * 
     */
      public void closeTicket(){
        myOpen = false;
    }
}
