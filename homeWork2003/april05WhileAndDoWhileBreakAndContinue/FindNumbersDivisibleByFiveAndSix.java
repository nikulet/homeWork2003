package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

import java.util.Scanner;

public class FindNumbersDivisibleByFiveAndSix {
    /*
    4.  (Find numbers divisible by 5 and 6). Write a program that
    display all the numbers from 100 to 1000,ten per line,that are
    divisible by 5 and 6.Numbers are separated by exactly one space.
     */
    public static void main(String[] args) {
        int from = 100;
        int to = 1000;
        int k = 0;

        do {
            if (from % 5 == 0 && from % 6 == 0) {
                System.out.print(from + " ");
                k++;
            }
            if (k == 10) {
                System.out.println();
                k = 0;
            }
            from++;
        } while (from <= to);
    }
}

