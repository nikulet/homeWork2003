package tekWillHomeWorks.homeWork2003.march29Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetectsKeyPressesAndPrintsWithSwitch {
    public static void main(String[] args) throws IOException {
        /*
1. Write a Java program that detects key presses and prints to user the pressed key.
Test Data
Input key: 'a'
Expected Output :
You pressed 'a' character
Use a switch statement and limit yourself to 10 cases (say, from 0 to 9)
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a letter key for login only with letters smallest: ");
        String keyPressed = reader.readLine();

        switch (keyPressed) {
            case "a":
                System.out.println("You pressed \'a\' character");
                break;
            case "b":
                System.out.println("You pressed \'b\' character");
                break;
            case "c":
                System.out.println("You pressed \'c\' character");
                break;
            case "d":
                System.out.println("You pressed \'d\' character");
                break;
            case "e":
                System.out.println("You pressed \'e\' character");
                break;
            case "f":
                System.out.println("You pressed \'f\' character");
                break;
            case "g":
                System.out.println("You pressed \'g\' character");
                break;
            case "h":
                System.out.println("You pressed \'h\' character");
                break;
            case "i":
                System.out.println("You pressed \'i\' character");
                break;
            case "î":
                System.out.println("You pressed \'î\' character");
                break;
            default:
                System.out.println("Worning!This tetter is not a smallest or is not a letter. ");
        }

    }
}
