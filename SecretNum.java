/**
 * Katherine (Katie) Barrett
 * EN.605.201.81.SU24
 * Assignment #3 (Part 2)
 * 
 * References used for this assignment: 
 * Module 2 Assignment (to reference proper Java syntax and initialization/use of the Scanner)
 * Stack Overflow (Only used for the response.equals() part. I am used to other langauges that can use
 * response == "yes", so I was confused as to why that part was not working and learned that 
 * Java uses response.equals("yes").)
 */

import java.util.Scanner;

public class SecretNum {
    public static void main ( String [] args )
    {
        // Define and initialize variables for values to be input
        int N = 0;
        int maxGuesses = 0;
        boolean wantsToPlay = true;
        String response;

        // Initialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Loop until the user no longer wishes to play
        while( wantsToPlay )
        {
            // Prompt the user to play
            System.out.println("Do you want to play a secret number game? (yes/no): ");
            response = input.next();

            if (response.equals("yes"))
            {
                // Prompt user for number N, which is the max for their secret number
                System.out.println("Please enter a number (this will be your max N): ");
                N = input.nextInt();

                // Prompt user for max guesses
                System.out.println("Please enter how many guess you want: ");
                maxGuesses = input.nextInt();

                // Get random number for which the user will guess for 
                int randomNumber = (int) ( N * Math.random() ) + 1;

                // Define and initialize variables for the while loop
                int start = 0;
                int guess = 0;

                // Loop until maxGuesses is reached
                while (start < maxGuesses)
                {
                    // Prompt user for a guess
                    System.out.println("Please enter a guess: ");
                    guess = input.nextInt();

                    // Handle the output based on whether the guess is correct, too low, or too high
                    if (guess == randomNumber)
                    {
                        System.out.println("Correct!\n");
                        start = maxGuesses;
                    } else if (guess < randomNumber)
                    {
                        System.out.println("Too low\n");
                    } else if (guess > randomNumber)
                    {
                        System.out.println("Too high\n");
                    }

                    // Inform the user that they are out of guesses after their last guess
                    if (start == (maxGuesses - 1))
                    {
                        System.out.println("You are out of guesses.\n");
                    }

                    start++;
                }
            } else if (response.equals("no"))
            // Thank the user for playing and set the boolean to false to terminate the while loop
            {
                System.out.println("Thanks for playing!");
                wantsToPlay = false;   
            } else 
            // If neither yes nor no is the response, print out an error stating that the input is invalid
            // And set the boolean to false to terminate the while loop
            {
                System.out.println("Error: Invalid Input.");
                wantsToPlay = false; 
            }
        }
        // Close the scanner
        input.close();
    }
}
