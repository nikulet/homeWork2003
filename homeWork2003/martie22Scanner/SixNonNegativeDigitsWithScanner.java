package tekWillHomeWorks.homeWork2003.martie22Scanner;

import java.util.Scanner;

public class SixNonNegativeDigitsWithScanner {
    public static void main(String[] args) {
                /*
3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("        Exercise 3\n\nWrite a number non-negative of 6 numbers: ");
        int nrr = scanner.nextInt();
        int ras = nrr % 100000;
        int ras1 = nrr % 10000;
        int ras2 = nrr % 1000;
        int ras3 = nrr % 100;
        int ras4 = nrr % 10;
        int ras5 = nrr % 1;
        System.out.println("\nThe resulte is : " + ras5 + "\n");
    }
}
