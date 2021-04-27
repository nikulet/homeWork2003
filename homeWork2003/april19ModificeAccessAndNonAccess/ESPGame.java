package tekWillHomeWorks.homeWork2003.april19ModificeAccessAndNonAccess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Ex2  ESP Game
Write a program that tests your ESP (extrasensory perception).
The program should randomly select the name of a color from the following list of words.
Read,Greean,Blue,Orange,Yellow
To select a word,the program can generate a random number.For example,if the number
is 0,the selected word is read,if the number is 1,the selected word is Green,and so forth.

Next ,the program should ask the user to enter the color that the computer has selected.
After the user has entred his or her guess,the program should display the name of the randomly
selected color.The program should repeat this 10 times then display the number of
times the user correctly guessed the selected color.
 */
public class ESPGame {

    private static final Random RANDOM = new Random();  //initializtion random
    private static final String[] COLORS = {"Red", "Green", "Blue", "Orange", "Yellow"};  //defaind a array of type String

    public static void main(String[] args) {   //the class main
        Scanner in = new Scanner(System.in);  //initilalizing Scanner
        int sum = 0;  //declareted a varible of type int which conted the sum
        int i = 0;
        do {
            String computerChosenColor = getRandomColor(); //to atributed the value of random a vareble String computerChsenColor
//            String computerChosenColor = getRandomColorUsingSwitch(); same thing, only using switch

            System.out.println("Please guess the color the computer has chosen from the list of colors " + Arrays.toString(COLORS));
            String userChosenColor = in.nextLine();

            if (userChosenColor.equalsIgnoreCase(computerChosenColor)) {
                System.out.println("We have a match!");
                sum++;
            }
            i++;
        } while (i < 10);

        System.out.println("User has correctly guessed the selected color " + sum + " time(s)!");
    }

    private static String getRandomColor() {
        int index = RANDOM.nextInt(COLORS.length);
        return COLORS[index];
    }
//        private static String getRandomColorUsingSwitch() {
//            int randomNumberBetweenZeroAndFour = RANDOM.nextInt(5);
//            switch (randomNumberBetweenZeroAndFour) {
//                case 0:
//                    return "Red";
//                case 1:
//                    return "Green";
//                case 2:
//                    return "Blue";
//                case 3:
//                    return "Orange";
//                case 4:
//                    return "Yellow";
//                default:
//                    return "unknown";
//            }
//        }
}


//****************************************************************************
//    String[] color = {"Read", "Green", "Blue", "Orange", "Yellow"};
//    Scanner scanner = new Scanner(System.in);
//    Random colors = new Random();
//    int i = 0;
//    int sum = 0;
//        do {
//                int numberColor = colors.nextInt(4);
//                System.out.print("Please,enter the color that the computer has selected read,green,blue,orange or yellow: ");
//                String userColor = scanner.nextLine();
//                System.out.println("The color of random is: " + color[numberColor]);
//                if (userColor.toLowerCase().equals(color[numberColor].toLowerCase())) {
//                ++sum;
//                }
//                i++;
//                } while (i < 10);
//        System.out.println("\nThe number of times the user correctly guessed the selected color is: " + sum);
//        }
//        }