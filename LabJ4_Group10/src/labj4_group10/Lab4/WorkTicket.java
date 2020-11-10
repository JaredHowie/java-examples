/*
 * This class represents a work ticket and information about work tickets such 
 * as ticket number, client id, date, and description
 */
package labj4_group10.Lab4;

import java.time.LocalDate;

/**
 *
 * @author Jared Howie and Trevor Andrus
 */
public class WorkTicket {

    //Private attributes
    private int workTicketNumber;
    private String clientId;
    private LocalDate workTicketDate;
    private String issueDescription;

    /**
     *
     * Default constructor
     *
     */
    public WorkTicket() {
        workTicketNumber = 0;
        clientId = null;
        workTicketDate = null;
        issueDescription = null;
    }

    /**
     *
     * Parameterized constructor
     *
     * @param ticketNumber the tickets number
     * @param Id the tickets id
     * @param day day the ticket was created
     * @param month month the ticket was created
     * @param year year the ticket was created
     * @param description description of the issue
     */
    public WorkTicket(int ticketNumber, String Id, int day, int month, int year, String description) {

        if (!setWorkTicket(ticketNumber, Id, day, month, year, description)) {
            System.out.println("Unable To Construct");
        }

    }

    /**
     * Used to create a new object based on an existing object.
     *
     * @param COPY the object to make a clone of.
     */
    public WorkTicket(final WorkTicket COPY) {
        this.workTicketNumber = COPY.workTicketNumber;
        this.clientId = COPY.clientId;
        this.workTicketDate = COPY.workTicketDate;
        this.issueDescription = COPY.issueDescription;
    }
    
    
    /**
     *
     * @param ticketNumber the tickets number
     * @param id the tickets id
     * @param day day the ticket was created
     * @param month month the ticket was created
     * @param year year the ticket was created
     * @param description description of the issue
     * @return
     */
    public boolean setWorkTicket(int ticketNumber, String id, int day, int month, int year, String description) {

        boolean isValid = false;
        if (ticketNumber > 0) {
            if (id.length() != 0) {
                if (year >= 2000 && year <= 2099) {
                    if (description.length() != 0) {
                        workTicketNumber = ticketNumber;
                        clientId = id;
                        workTicketDate = LocalDate.of(year, month, day);
                        issueDescription = description;
                        isValid = true;
                    }
                }
            }
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

        ticket = String.format("----------------------------------\n"
                + "\tWork Ticket Number %s\n"
                + "----------------------------------\n"
                + "Client Id:\t\t%s\n"
                + "Ticket Date:\t\t%s\n"
                + "Issue Description:\t%s",
                this.workTicketNumber, this.clientId,this.workTicketDate, this.issueDescription);
//        ticket = "----------------------------------\n\tWork Ticket Number " + this.workTicketNumber
//                + "\n----------------------------------\n" + "Client Id:\t\t" + this.clientId
//                + "\nTicket Date:\t\t" + this.workTicketDate
//                + "\nIssue Description:\t" + this.issueDescription;
        return ticket;
    }

    /**
     * Used to access the workTicketNumber value
     *
     * @return this workTicketNumber value
     */
    public int getWorkTicketNumber() {
        return workTicketNumber;
    }

    /**
     * Used to access the clientId value
     *
     * @return this clientId value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Used to access the workTicketDate value
     *
     * @return this workTicketDate value
     */
    public String getWorkTicketDate() {
        return workTicketDate.toString();
    }

    /**
     * Used to access the issueDescription value
     *
     * @return this issueDescription value
     */
    public String getDescription() {
        return issueDescription;
    }
    
    /**
     * Used to set the workTicketNumber value
     * 
     * @param ticketNumber 
     */
    public void setTicketNumber(int ticketNumber) {
        if (ticketNumber > 0) {
            workTicketNumber = ticketNumber;
        } else {
            throw new IllegalArgumentException("Number Must be Greater Than 0, You Entered " + ticketNumber);
        }
    }

    /**
     * Used to set the clientId value
     * 
     * @param id 
     */
    public void setClientId(String id) {
        if (id.length() != 0) {
            clientId = id;

        }
    }

    /**
     * Used to set the workTicketDate value
     * 
     * @param day day the ticket was created
     * @param month month the ticket was created
     * @param year year the ticket was created
     */
    public void setTicketDate(int day, int month, int year) {

        if (year >= 2000 && year <= 2099) {

            workTicketDate = LocalDate.of(year, month, day);

        } else {
            throw new IllegalArgumentException("Invalid Input! Year Must be Between 2000 and 2099, You Entered " + year);

        }
    }

    
    /**
     * Used to set the issueDescription
     * 
     * @param description description of the issue the ticket is dealing with
     */
    public void setDescription(String description) {
        if (description.length() != 0) {
            issueDescription = description;

        }
    }
}
