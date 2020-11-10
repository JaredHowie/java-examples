package labj5_group10;

import java.time.LocalDate;

/**
 * A class to represent an Employee. This class extends from person and adds an 
 * employeeId.
 * 
 * @author Trevor Andrus & Jared Howie
 */
public abstract class Employee extends Person
{
    //Attribute
    public final String myEmployeeId;
    
    /**
     * 
     * Parameterized constructor
     * 
     * @param fullName - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @param employeeId - the intended ID for the employee.
     * @throws IllegalArgumentException when the employeeId is not 8 characters 
     * in length.
     */
    public Employee(String fullName, LocalDate birthDate, String employeeId)
    {
        super(fullName, birthDate);
        
        if(employeeId.length() == 8)
        {
            myEmployeeId = employeeId;
        }
        else
        {
            throw new IllegalArgumentException("Employee IDs must be 8 "
                    + "characters in length!");
        }
    }
    
    /**
     * 
     * @return The value of the Employee Id
     */
    public String GetEmployeeId()
    {
        return myEmployeeId;
    }
    
    /**
     * 
     * 
     * @return The calculated pay of an employee
     */
    public abstract double calculatePayDay();
    
    
    
    
}
