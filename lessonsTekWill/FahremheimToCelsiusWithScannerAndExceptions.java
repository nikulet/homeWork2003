package lessonsTekWill;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FahremheimToCelsiusWithScannerAndExceptions {
    public static void main(String[] args) {

        /*
        1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("        Exercise 1\n\nWrite temperature in Fahrenheit : ");
            int degreeInFahrenheit = scanner.nextInt();
            float toCelsius = (((degreeInFahrenheit - 32) * 5) / 9);  //to calculate in Celcius
            System.out.println((float) degreeInFahrenheit + " degree Fahrenheit is equals to " + toCelsius + " in Celsius.\n");
        } catch (InputMismatchException ex) {
            System.out.println("The input number has a wrong format! It must be a number,not String or character!");
        }
    }
}
