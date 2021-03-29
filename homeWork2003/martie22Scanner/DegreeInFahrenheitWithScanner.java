package tekWillHomeWorks.homeWork2003.martie22Scanner;
import java.util.Scanner;

public class DegreeInFahrenheitWithScanner {
    public static void main(String[] args) {

        /*
        1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("        Exercise 1\n\nWrite temperature in Fahrenheit : ");
        int degreeInFahrenheit = scanner.nextInt();
        float toCelsius = (((degreeInFahrenheit - 32) * 5) / 9);  //to calculate in Celcius
        System.out.println((float) degreeInFahrenheit + " degree Fahrenheit is equals to " + toCelsius + " in Celsius.\n");

    }
}
