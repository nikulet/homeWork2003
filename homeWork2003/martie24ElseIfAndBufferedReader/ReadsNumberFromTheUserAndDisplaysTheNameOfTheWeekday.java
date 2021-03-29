package tekWillHomeWorks.homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadsNumberFromTheUserAndDisplaysTheNameOfTheWeekday {
    public static void main(String[] args) throws IOException {
        /*
3. Write a Java program that reads a number from the user and displays the name of the weekday based on user's number.
Test Data
Input number: 3
Expected Output :
Wednesday
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number: ");
        byte numberWeek = Byte.parseByte(reader.readLine());

        if (numberWeek == 1) {
            System.out.println("Monday");
        } else if (numberWeek == 2) {
            System.out.println("Tuesday");
        } else if (numberWeek == 3) {
            System.out.println("Wednesday");
        } else if (numberWeek == 4) {
            System.out.println("Thursday");
        } else if (numberWeek == 5) {
            System.out.println("Friday");
        } else if (numberWeek == 6) {
            System.out.println("Saturday");
        } else if (numberWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("This number isn't a day in the week.");
        }


    }
}
