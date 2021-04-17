package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    /*
    5.  Random Number Guessing Game
    Write a program that generates a random number and asks the user to guess what the number is.
    If the user's guess is higher that the random number, the program should display
    "Too higt, try again." If the user's guess is lower than the random number, the program should
    display "Too low, try again." The program should use a loop that repeats until the user correctly
    guesses the random number.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(50);
        boolean right = true;
        while (right) {
            System.out.print("Enter a number of 0 to 50 : ");
            int numberUser = scanner.nextInt();
//            int randomNumber = random.nextInt(50);
            System.out.println("Number user is: " + numberUser + ", and random number is: " + randomNumber + ".");
            if (numberUser > randomNumber) {
                System.out.println("\"Too higt, try again.\"");
            } else if (numberUser < randomNumber) {
                System.out.println("\"Too low, try again.\"");
            } else if (numberUser == randomNumber) {
                System.out.println("The numbers are equales.Exit.");
                right = false;
            }
        }
    }
}
