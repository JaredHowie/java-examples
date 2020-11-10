/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_group10;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Trevor Andrus and Jared Howie
 */
public class Lab1_Group10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarations
        Scanner keyboardInput = new Scanner(System.in);
        final double STANDARD_ACCELERATION = 9.80665;
        double height;
        double fallTime;

        try 
        {
            //Prompts the user for a number
            System.out.println("Please enter a height in meters: ");
            height = keyboardInput.nextDouble();

            //Converts to absolute value if input is negative
            if (height < 0) 
            {
                height = abs(height);
            }
            
            //Rounds to 1 decimal place
            height =  Math.round((height *10.0))/10.0;
           
            //Calculates the fall time
            fallTime =  Math.round(((sqrt((height * 2) / STANDARD_ACCELERATION))*10.0)) / 10.0;
            
            //Outpur statement
            System.out.println("It will take approximately " + fallTime + " seconds to fall " + height + " meters.");
        } 
        //Catches non numeric input
        catch (Exception ex) 
        {
            System.out.println("Please Enter a number value next time.");
        }

    }

}
