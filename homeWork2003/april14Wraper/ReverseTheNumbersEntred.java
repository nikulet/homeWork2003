package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Scanner;

public class ReverseTheNumbersEntred {
    public static void main(String[] args) {
        /*
        1.  (Revers the numbers entred) Write a program that reads ten integers and displays them in the
        revers of the order in which they were read.
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] nrr = new int[numbers.length];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Integer number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nThe revers of the order in which they were read is: ");
        for (int i = 0, index = numbers.length - 1; i < numbers.length; i++, index--) {
            System.out.print((nrr[i] = numbers[index]) + " ");
        }
    }
}