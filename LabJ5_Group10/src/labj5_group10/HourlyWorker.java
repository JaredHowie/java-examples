package labj5_group10;

import java.time.LocalDate;

/**
 * A class to represent an HourlyWorker. This class extends from the Employee
 * class and adds the hourlyRate and hoursPerWeek attributes.
 * 
 * @author Trevor Andrus & Jared Howie
 */
public class HourlyWorker extends Employee{

    //Attributes
    double myHourlyRate;
    double myHoursPerWeek;
    
    /**
     * Parameterized constructor
     * 
     * @param fullName
     * @param birthDate
     * @param employeeId
     * @param hourlyRate
     * @param hoursPerWeek 
     */
    public HourlyWorker(String fullName, LocalDate birthDate, String employeeId, double hourlyRate, double hoursPerWeek)
    {
        super(fullName, birthDate, employeeId);
        this.SetHourlyRate(hourlyRate);
        this.SetHoursPerWeek(hoursPerWeek);
    }
    
    //Accessors
    
    /**
     * 
     * @return The hourly rate for a worker
     */
    public double GetHourlyRate()
    {
        return myHourlyRate;
    }
    
    /**
     * 
     * @return The value for the hours per week for a worker.
     */
    public double GetHoursPerWeek()
    {
        return myHoursPerWeek;
    }
    
    //Mutators
    
    /**
     * Sets the hourly rate for a worker.
     * 
     * @param hourlyRate 
     * @throws IllegalArgumentException When the given hourly rate is less than 
     * 16.
     */
    public final void SetHourlyRate(double hourlyRate)
    {
        //Hourly rate is valid
        if(hourlyRate >= 16)
        {
            myHourlyRate = hourlyRate;
        }
        else
        {
            //Throws exception with message telling the user what they need to enter
            throw new IllegalArgumentException("Hourly rate must be at least "
                    + "$16.00");
        }
        
    }
    
    /**
     * Sets the hours per week for a worker.
     * 
     * @param hoursPerWeek 
     * @throws IllegalArgumentException When the given hours are not within the 
     * 0 - 48 hour range.
     */
    public final void SetHoursPerWeek(double hoursPerWeek)
    {
        //Hours per week is valid
        if(hoursPerWeek <= 48 && hoursPerWeek >= 0)
        {
            myHoursPerWeek = hoursPerWeek;
        }
        else
        {
            //Throws exception with message telling the user what they need to enter
            throw new IllegalArgumentException("Hours per week must be "
                    + "somewhere from 0 - 48");
        }
    }
    
    /**
     * 
     * @return The calculated pay for an hourly worker
     */
    @Override
    public double calculatePayDay() 
    {       
        double pay = myHoursPerWeek * myHourlyRate;
        pay = Math.round((pay *100.0))/100.0;
        
        return pay;
    }
    
     @Override
    public String toString(){
        String worker;

        worker = String.format("----------------------------------\n"
                + "\t%s\n"
                + "----------------------------------\n"
                + "Employee Id:\t%s\n"
                + "Age:\t\t%s\n"
                + "Hourly Pay:\t$%.2f\n"
                + "Hours Per Week:\t%s\n"
                + "Pay:\t\t$%.2f",
                this.getName(), this.GetEmployeeId(),this.getAge(), 
                this.GetHourlyRate(), this.GetHoursPerWeek(),
                this.calculatePayDay());

        return worker;
    }
    
}
