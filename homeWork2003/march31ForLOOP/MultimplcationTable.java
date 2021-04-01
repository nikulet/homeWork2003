package tekWillHomeWorks.homeWork2003.march31ForLOOP;

import java.util.Scanner;

public class MultimplcationTable {
    /*
    Write a program that display a multimplication table.
    The program should ask the user to enter a number and also
    the range up to which the user wants to display the multiplication table.
    For exemple, the multiplication table for the number 3 up to range 2 would look like:
    3 x 1 = 3
    3 x 2 = 6
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the number you want to multiply: ");
        int numberRange = scanner.nextInt();
        for (int i = 0; i <= numberRange; i++) {
            int sum = number * i;
            System.out.println(number + " x " + i + " = " + sum);
        }

    }
}
