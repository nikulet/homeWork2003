package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Random;

public class DiceGame {
    /*
    6.  Dice Game
    Write a program that plays a simple dice game between the computer and the user.
    When the program runs,a loop should repeat 10 times. Each iteration of the loop should do the
    following:
 1) Generate a random integer in the range of 1 through 6. This is the value of the computer's die.
 2) Generate another random integer in the range of 1 trough 6.This is the of the user's die.
 3) The die with the highest value wins. (In case of a tie, there is no winner for that particular
 roll of the dice.)

 As the loop iterates,the program should keep count of the number of times the computer wins, and
 the number of times that the user wins. After the loop performs all of its iterations, the program should
 display who was the grand winner,the computer or the user.
     */
    public static void main(String[] args) {

        Random random = new Random();
        boolean ten = true;
        int scorComputer = 0, scorUser = 0;
        while (ten) {
            for (int i = 0; i < 5; i++) {
                int computerDie = random.nextInt(6);
                int userDie = random.nextInt(6);
                System.out.println(computerDie + " " + userDie);
                if (computerDie > userDie) {
                    ++scorComputer;
                } else if (computerDie < userDie) {
                    ++scorUser;
                }
            }
            if (scorComputer > scorUser) {
                System.out.println("The computer wins."/*+scorComputer*/);
                ten = false;
            } else if (scorComputer < scorUser) {
                System.out.println("The user wins."/*+scorUser*/);
                ten = false;
            } else if (scorComputer == scorUser) {
                System.out.println("The scor is equals.Try again.\n");
                ten = true;
            }
        }
    }
}
