package tekWillHomeWorks.homeWork2003.april19ModificeAccessAndNonAccess;

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
    public static void main(String[] args) {
        String[] color={"Read","Green","Blue","Orange","Yellow"};
        Random colors=new Random();
        Scanner scanner=new Scanner(System.in);
        int i=0;
        int sum=0;
        do {
            int numberColor=colors.nextInt(4);
            System.out.print("Please,enter the color that the computer has selected read,green,blue,orange or yellow: ");
            String userColor=scanner.nextLine();
            System.out.println("The color of random is: "+color[numberColor]);
            if (userColor.toLowerCase().equals(color[numberColor].toLowerCase())) {
                ++sum;
            }
            i++;
        }while (i<10);
        System.out.println("\nThe number of times the user correctly guessed the selected color is: "+sum);
    }
}
