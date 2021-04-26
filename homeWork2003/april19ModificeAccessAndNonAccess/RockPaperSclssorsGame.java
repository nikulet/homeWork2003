package tekWillHomeWorks.homeWork2003.april19ModificeAccessAndNonAccess;

import java.util.Random;
import java.util.Scanner;

/*
Ex 1.   Write a program that lets the user play the game of Rock,Paper,Scissors aginst the
computer.The program should work as follows.

1.When the program hegins,a random number in the range of 1 through 3 is generated.
If the number is 1 ,then the computer has chosen rock.If the number is 2,then the computer has
chosen paper.If the number is 3,then the computer has chosen scissors.
(Don't display the computer's choice yet.)

2.The user entres his or her choice of "rock", "paper", or "scissors" at the keybord.
(You can use a menu if you prefer.)

3.The computer's choice is displayed.

4.A winner is selected according to the following rules:
a)If one player chooses rock and the other player chooses scissors,then rock wins.
(The rock smashes the scissors.)
b)If me player chooses scissors and the other player chooses paper,then scissors wins.
(Scissors cuts paper.)
c)If one player chooses paper and the other player chooses rock,then paper wins.
(Paper wraps rock.)
d)If both players make the same choice,the game must be played again to determine the winner.

Be sure to divide the program into methods that perform each major task.
 */
public class RockPaperSclssorsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand=random.nextInt(3);
        String[] numberRandom={"rock","paper","scissors"};
        boolean tru=true;
        while(tru) {
            System.out.print("Enter what you want rock,paper,scissors: ");
            String userEntredString = scanner.nextLine();
            String computerCoice = numberRandom[rand];
            System.out.println("The computer choice is " + computerCoice);

            if (userEntredString.toLowerCase().equals("rock")&&computerCoice.equals("scissors")||userEntredString.toLowerCase().equals("scissors")&&computerCoice.equals("rock")){
                System.out.println("The rock wins");
                tru=false;
            }
           else if (userEntredString.toLowerCase().equals("scissors")&&computerCoice.equals("paper")||userEntredString.toLowerCase().equals("paper")&&computerCoice.equals("scissors")){
                System.out.println("The scissors wins");
                tru=false;
            }
           else if (userEntredString.toLowerCase().equals("paper")&&computerCoice.equals("rock")||userEntredString.toLowerCase().equals("rock")&&computerCoice.equals("paper")){
                System.out.println("The paper wins");
                tru=false;
            }
           else if (userEntredString.toLowerCase().equals("paper")&&computerCoice.equals(computerCoice)||userEntredString.toLowerCase().equals("rock")&&computerCoice.equals(computerCoice)||userEntredString.toLowerCase().equals("scissors")&&computerCoice.equals(computerCoice)){
                System.out.println("Try agin");
               tru=true;
            }
        }
    }
}
