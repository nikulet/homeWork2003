package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

import java.util.Scanner;

public class ConversionFromMilesToKilometers {
    /*
    2. (Conversion from miles to kilometers).
    Write a program that display the following table(note that 1 mile is 1.609 kilometers):
    Miles          Kilometers
    1              1.609
    2              3.218
    ...
    9              14.481
    10             16.090
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of miles for converting in kilometers: ");
        int number = scanner.nextInt();
        System.out.println("Miles       Kilometers");
        double sum = 0;
        int i = 1;
        while (i <= number) {
            sum = i * 1.609D;
            System.out.println(i + "       " + sum);
            i++;
        }
    }
}
