package labj2_group10;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Jared Howie and Trevor Andrus
 */
public class Lab2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Variable declarations
        final int MIN_SCORE = 0;
        final int MAX_SCORE = 300;
        final int GAMES = 2;
        final int PLAYERS = 3;
        final double GAMES_DOUBLE = GAMES;
        int score;
        double average = 0;
        double sumDouble;
        
        Scanner in = new Scanner(System.in);
        
        //Array declarations
        String[] names = {"Jared","Trevor","Thom"}; 
        int[][] scores = new int[GAMES][PLAYERS];
        
        //Input loops
        for(int game = 1; game < 3; game++)
        {            
            for(int player = 0; player < PLAYERS; player++)
            {       
                try
                {
                    //Ask user for a score and store input in a variable
                    System.out.format("Please enter %s's score for GAME #%d:",names[player], game);
                    score = in.nextInt();
                    
                    //If input is not within the allowed range display an error message and deincrement to get new input
                    if(score < MIN_SCORE || score > MAX_SCORE)
                    {
                        System.out.format("Input Must Be Between %d and %d!", MIN_SCORE, MAX_SCORE);
                        player--;                   
                    }
                    //If input is valid add it to the array
                    else
                    {
                        scores[game-1][player] = score;
                    }
                    //New line for formatting
                    System.out.println("");                    
                }
                
                //If input is not numeric
                catch(InputMismatchException ex)
                {
                    //Error message
                    System.out.println("Input Must Be Numeric!");
                    //Deincrement to get input for this player again
                    player--;
                    in.nextLine();
                }
            }        
        }
        
        //Ouput loop
        for (int playerCounter = 0; playerCounter < names.length; playerCounter++) 
        {
            //Set sum for current player to 0
            int playerSum = 0;
            //Output score details with name of current player
            System.out.format("\nScore Details for %s:", names[playerCounter]);
            
            //Output their scores as well as add them to a sum
            for(int gameCounter = 0; gameCounter < scores.length; gameCounter++)
            {            
                System.out.format("\nGame # %d: %d",  gameCounter+1, scores[gameCounter][playerCounter]);
                playerSum += scores[gameCounter][playerCounter];             
            }
            
            //Switches the ints to doubles for calculation purposes
            sumDouble = playerSum;
            average = sumDouble / GAMES_DOUBLE;
            
            //Outputs the players name and their average to 1 decimal place
            System.out.format("\nAverage for %s: %.1f", names[playerCounter], average);
            
        }
        //New line for formatting
        System.out.println("");
    }
    
}
