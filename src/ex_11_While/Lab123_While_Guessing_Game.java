package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
    //Guess a nummber between 1 - 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
       // System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");

        int guess;
        int attempts = 0;

        while(true){
            System.out.println("Enter another guess!");

            guess = scanner.nextInt();
            attempts++;

            if(guess < numberToGuess){
                System.out.println("Too low, Try again");
            }else if(guess > numberToGuess){
                System.out.println("Too high, Try again");
            }else{
                System.out.println("Correct! you guessed it in " + attempts+ "attempts");
                break;
            }
        }

    }
}
