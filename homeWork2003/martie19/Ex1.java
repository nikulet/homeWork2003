package homeWork2003.martie19;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("*************************************************************\n");

        /*
        1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti temperatura in Fahrenheit : ");
        int degreeInFahrenheit=scanner.nextInt();

        float toCelsius = (((degreeInFahrenheit - 32) * 5) / 9);  //to calculate in Celcius

        System.out.println("        Exercitiul 1\n\n" + (float) degreeInFahrenheit + " degree Fahrenheit is equals to " + toCelsius + " in Celsius.\n");

        System.out.println("*************************************************************\n");
    }
}
