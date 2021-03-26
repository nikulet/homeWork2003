package homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertLetterGrandToNumber {
    public static void main(String[] args) throws IOException {
        /*Write a program that promts the user to enter a letter grand A,B,C,D, or F
        and displays its corresponding numeric value 4,3,2,1, or 0. Here is a sample run:
        Enter a letter grade: B
        The numeric valuce for grand B is 3
        Enter a letter grade: T
        T is an invalid grade
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a letter grade: ");
        String letter = reader.readLine();
        if (letter.contains("A")) {
            System.out.println("The numeric valuce for grand " + letter + " is 4");
        } else if (letter.contains("B")) {
            System.out.println("The numeric valuce for grand " + letter + " is 3");
        } else if (letter.contains("C")) {
            System.out.println("The numeric valuce for grand " + letter + " is 2");
        } else if (letter.contains("D")) {
            System.out.println("The numeric valuce for grand " + letter + " is 1");
        } else if (letter.contains("E")) {
            System.out.println("The numeric valuce for grand " + letter + " is 0");
        } else {
            System.out.println(letter + " is an invalid grade.");
        }
    }
}
