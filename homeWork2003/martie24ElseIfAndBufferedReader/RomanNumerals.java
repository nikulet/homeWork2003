package tekWillHomeWorks.homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomanNumerals {
    /*
    1.Roman Numbers
    Write a program that promts the user to enter a number within the range of 1 through 10.
    The program should display the Roman numeral version of that number.
    If the number is outside the range of 1 through 10,the program should display an error message.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number within the range of 1 through 10: ");
        byte nr = Byte.parseByte(reader.readLine());

        if (nr == 1) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"I\"");
        } else if (nr == 2) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"II\"");
        } else if (nr == 3) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"III\"");
        } else if (nr == 4) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"IV\"");
        } else if (nr == 5) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"V\"");
        } else if (nr == 6) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"VI\"");
        } else if (nr == 7) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"VII\"");
        } else if (nr == 8) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"VIII\"");
        } else if (nr == 9) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"IX\"");
        } else if (nr == 10) {
            System.out.println("The Roman numeral version of that number " + nr + " is \"X\"");
        } else {
            System.out.println("ATENTION! This number " + nr + " is  without the range of 1 through 10");
        }


    }
}
