/*
 * This file demonstrates the different functionalities of our 
 * ExtendedWorkTicket class
 */
package labj4_group10.Lab4;

import java.util.Scanner;

/**
 *
 * @author Jared Howie and Trevor Andrus
 */
public class lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creats scanner
        Scanner in = new Scanner(System.in);
        
        //Demontrates ExtendedWorkTicket default constructor
        System.out.println("Default constructor\n"
                + "-------------------");
        WorkTicket defaultTicket = new ExtendedWorkTicket();
        System.out.println(defaultTicket.toString());
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        //Demontrates ExtendedWorkTicket paramaterized constructor
        System.out.println("Parameterized constructor\n"
                + "-------------------");
        
        ExtendedWorkTicket parameterizedTicket = new ExtendedWorkTicket(12, "John Smith", 12, 10, 2018, "Internet is down.", true);
        System.out.println(parameterizedTicket.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        //Demontrates creating and ExtendedWorkTicket with a WorkTicket and an open status
        System.out.println("Parameterized constructor using ticket and open status\n"
                + "-------------------");
        WorkTicket ticket = new WorkTicket(13, "Dave Smith", 6, 7, 2018, "Computer is broken.");
        
        ExtendedWorkTicket parameterizedTicket2 = new ExtendedWorkTicket(ticket, true);
        System.out.println(parameterizedTicket2.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        //Demontrates the error message when the constructor is given bad data
        System.out.println("Parameterized constructor with bad data to show error message\n"
                + "-------------------");
        
        ExtendedWorkTicket parameterizedBadTicket = new ExtendedWorkTicket(12, "", 13, 10, 2108, "Internet is down.", true);
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        //Demontrates changing a tickets openStatus to closed
        System.out.println("Closing ticket\n"
                + "-------------------");
        parameterizedTicket.closeTicket();
        System.out.println(parameterizedTicket.toString());
        
        System.out.print("\nPress \'ENTER\' to continue...");
        in.nextLine();
        System.out.println("\n");
        
        //Demontrates changing a tickets openStatus to open
        System.out.println("Opening ticket\n"
                + "-------------------");
        parameterizedTicket.openTicket();
        System.out.println(parameterizedTicket.toString());

    }
    
}
