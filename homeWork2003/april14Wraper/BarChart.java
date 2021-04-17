package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    /*
   4.   Write a program that asks the user to enter today's sales for five stores.
    The program should display a bar chart comparing each store's sales.Create each bar in the
    bar chart by displaying a row of asteriks. Each asteriks should represent $100 of sales.
    Here is an exemple of the program's output:
    Enter today's sales for store 1: 1000[enter]
    Enter today's sales for store 2: 1200[enter]
    Enter today's sales for store 3: 1800[enter]
    Enter today's sales for store 4: 800[enter]
    Enter today's sales for store 5: 1900[enter]

    Sales bar chart
    Store 1: **********
    Store 2: ************
    Store 3: ******************
    Store 4: ********
    Store 5: *******************
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nr = new int[5];
        byte index = 1;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter today's sales for store " + index + ": ");
            nr[i] = scanner.nextInt();
            index++;
        }
        System.out.println("\nThe numbers enterd " + Arrays.toString(nr) + "\n");
        System.out.println("SALES BAR CHART");
        for (int i = 0, ind = 1; i < nr.length; i++, ind++) {
            if (nr[i] % 100 == 0) {
                sum = nr[i] / 100;
                System.out.print("Store " + ind + " : ");
                for (; sum > 0; sum--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
