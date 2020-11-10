package labj5_group10;

import java.time.LocalDate;

/**
 * A class to represent a SalaryEmployee. This class extends from the Employee
 * class and adds the yearly salary attribute.
 * 
 * @author Trevor Andrus & Jared Howie
 */
public class SalariedEmployee extends Employee{
    
    //Attribute
    double myYearlySalary;
    
    /**
     * 
     * @param fullName
     * @param birthDate
     * @param employeeId
     * @param yearlySalary 
     */
    public SalariedEmployee(String fullName, LocalDate birthDate, String employeeId, double yearlySalary)
    {
        super(fullName,birthDate,employeeId);
        this.SetYearlySalary(yearlySalary);
    }
   
    /**
     * 
     * @return The yearly salary for a worker
     */
    public double GetYearlySalary()
    {
        return myYearlySalary;
    }
    
    /**
     * Sets the yearly salary for a worker
     * 
     * @param yearlySalary
     * @throws IllegalArgumentException When the yearly salary given is less
     * than 0
     */
    public final void SetYearlySalary(double yearlySalary)
    {
        //If the salary is valid
        if(yearlySalary >= 0)
        {
            myYearlySalary = yearlySalary;
        }
        else
        {
            //Throws exception with message telling the user what they need to enter
            throw new IllegalArgumentException("Yearly salary must be a "
                    + "positive value!");
        }
    }
    
    
    /**
     * 
     * @return the calculated pay for a salary worker
     */
    @Override
    public double calculatePayDay() 
    {       
        double pay = myYearlySalary / 52;
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
                + "Salary:\t\t$%.2f",
                this.getName(), this.GetEmployeeId(),this.getAge(), 
                this.GetYearlySalary());

        return worker;
    }
    
}
