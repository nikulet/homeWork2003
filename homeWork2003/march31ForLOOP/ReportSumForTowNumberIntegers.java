package tekWillHomeWorks.homeWork2003.march31ForLOOP;

import java.util.Scanner;

public class ReportSumForTowNumberIntegers {
    /*
    Write a program that requests the user to enter two integers.The program should then
    calculate and report the sum of all the integers between and including the
    two integers.At this point,assume that the smaller integer is entered first.
    For example,if the user enters 2 and 9,the program should report that the sum of all
    the integers from 2 through 9 is 44.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number2 = scanner.nextInt();
        int nr1 = number1;
        int sum = 0;
        for (; number1 <= number2; number1++) {
            sum += number1;
        }
        System.out.println("The sum of all" +
                " the integers from " + nr1 + " through " + number2 + " is " + sum + ".");
    }
}
