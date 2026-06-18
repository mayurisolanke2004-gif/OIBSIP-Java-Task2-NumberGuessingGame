import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
       
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        int maxAttempts = 7;
        
        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        System.out.println("------------------------------------------");
        
       
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
           
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } 
            
            else if (guess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } 
           
            else {
                System.out.println("Too high! Try a lower number.");
            }
            
            
            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            System.out.println("------------------------------------------");
            
           
            if (attempts == maxAttempts) {
                System.out.println("Game Over! The correct number was: " + numberToGuess);
            }
        }
        sc.close(); 
    }
}