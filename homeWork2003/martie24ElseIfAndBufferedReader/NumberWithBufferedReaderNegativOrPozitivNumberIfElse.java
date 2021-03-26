package homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberWithBufferedReaderNegativOrPozitivNumberIfElse {
    public static void main(String[] args) throws IOException {
        /*
1. Write a Java program to get a number from the user and print
whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write a number : ");
        int number = Integer.parseInt(reader.readLine());
        if (number < 0) {
            System.out.println("This number is negativ.");
        } else {
            System.out.println("The number is pozitiv.");
        }

    }
}
