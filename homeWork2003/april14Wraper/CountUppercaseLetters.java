package tekWillHomeWorks.homeWork2003.april14Wraper;

import javax.swing.*;
import java.util.Scanner;

public class CountUppercaseLetters {
    /*
    3.  (Count uppercase letters) Write a program that promts the user to enter a string
    and displays the number of the uppercase letters in the string.
    Enter a string: Welcome to Java
    The number of uppercase letters is: 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String wordsStringUpperCase = scanner.next();
        int as = wordsStringUpperCase.length();
        int sum = 0;
        for (int i = 0; i < as; i++) {
            if (Character.isUpperCase(wordsStringUpperCase.charAt(i))) {
                sum++;
            }
        }
        System.out.println("The number of uppercase letters is: " + sum);
    }
}


