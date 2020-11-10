package labj5_group10;

import java.time.LocalDate;
import java.util.Scanner;


/**
 *Demonstrates the classes created in Lab 5.
 * 
 * @author Trevor Andrus & Jared Howie
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      //Creats scanner
        Scanner in = new Scanner(System.in);
        try
        {
       
        System.out.println("Salary Worker\n");
        SalariedEmployee Employee = new SalariedEmployee("Jared Howie", LocalDate.of(1999, 2, 10), "10065770", 50000.00);
        System.out.println(Employee.toString());
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        

        System.out.println("Salary Worker (new salary)\n"
                + "-------------------");
        
        Employee.SetYearlySalary(60000.00);
        System.out.println(Employee.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
       System.out.println("Hourly Worker\n"
                + "-------------------");
        
        HourlyWorker worker = new HourlyWorker("Trevor Andrus", LocalDate.of(1999, 10, 13) , "10050643", 22.2, 30.5);
        
        System.out.println(worker.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        
        System.out.println("Hourly Worker (new hourly pay and hours per week)\n"
                + "-------------------");
        
        worker.SetHoursPerWeek(40.0);
        worker.SetHourlyRate(25.0);
        
        System.out.println(worker.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
        try
        {
            SalariedEmployee salaried = new SalariedEmployee("Trevor Andrus", LocalDate.of(1999, 10, 13) , "12345678", 5000);
            SalariedEmployee salaried2 = new SalariedEmployee("Jared Howie", LocalDate.of(1999, 2, 10), "12345678", 50000.00);
            HourlyWorker hourly = new HourlyWorker("Trevor Andrus", LocalDate.of(1999, 10, 13) , "12345678", 27.0, 33.5);
            HourlyWorker hourly2 = new HourlyWorker("Jared Howie", LocalDate.of(1999, 10, 13) , "12345678", 22.2, 30.5);
            Employee[] people = {salaried, salaried2, hourly, hourly2};
            double totalPay = 0.0;
            System.out.println("\tPayroll Report\n"
                          + "---------------------------------");

            for (Employee worker : people) {
                System.out.println(String.format("%s\n"
                        +"\tEmployee Id:\t%s\n"
                        +"\tPay:\t\t$%.2f\n", worker.getName(), worker.GetEmployeeId(), worker.calculatePayDay()));
                totalPay = totalPay + worker.calculatePayDay();
            }
      
            System.out.println(String.format("Total Pay:\t\t$%.2f", totalPay));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
       
    }
    
}
