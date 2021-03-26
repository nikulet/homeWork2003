package homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
(Phone key pads)The international standart letter/number mapping found on the telephone.
Write a program that promts the user to enter a letter and displays its corresponding number.
 */
public class PhoneKeyPadsLetterCorespondingNumberWithBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a letter: ");
        String letter = reader.readLine();

        if (letter.toUpperCase().contains("A") || letter.toUpperCase().contains("B") || letter.toUpperCase().contains("C")) {
            System.out.println("The corresponding number is 2");
        } else if (letter.toUpperCase().contains("D") || letter.toUpperCase().contains("E") || letter.toUpperCase().contains("F")) {
            System.out.println("The corresponding number is 3");
        } else if (letter.toUpperCase().contains("G") || letter.toUpperCase().contains("H") || letter.toUpperCase().contains("I")) {
            System.out.println("The corresponding number is 4");
        } else if (letter.toUpperCase().contains("J") || letter.toUpperCase().contains("K") || letter.toUpperCase().contains("L")) {
            System.out.println("The corresponding number is 5");
        } else if (letter.toUpperCase().contains("M") || letter.toUpperCase().contains("N") || letter.toUpperCase().contains("O")) {
            System.out.println("The corresponding number is 6");
        } else if (letter.toUpperCase().contains("P") || letter.toUpperCase().contains("Q") || letter.toUpperCase().contains("R") || letter.toUpperCase().contains("S")) {
            System.out.println("The corresponding number is 7");
        } else if (letter.toUpperCase().contains("T") || letter.toUpperCase().contains("U") || letter.toUpperCase().contains("V")) {
            System.out.println("The corresponding number is 8");
        } else if (letter.toUpperCase().contains("W") || letter.toUpperCase().contains("X") || letter.toUpperCase().contains("Y") || letter.toUpperCase().contains("Z")) {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println(letter + "isn't a letter.");
        }


    }

}
