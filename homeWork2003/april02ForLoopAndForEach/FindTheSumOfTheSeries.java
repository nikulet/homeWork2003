package tekWillHomeWorks.homeWork2003.april02ForLoopAndForEach;

import java.util.Scanner;

public class FindTheSumOfTheSeries {
    /*
    7.  Finde the sum of the series 2+22+222+2222+...+n  terms
    Given:
    number_of_terms=5
    So series will become 2+22+222+2222+22222
    Expected output:   24690
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numer of terms: ");
        long numberOfTerms = scanner.nextLong();
        System.out.print("So series will become: ");

        for (long s = 0; s <= numberOfTerms; ) {
            s = (s * 10) + 2;
            System.out.print(s + " + ");

            for (long i = 2; i <= numberOfTerms; ) {
                i = (i * 10) + s;
                System.out.print(i + " + ");

                for (long j = 2; j <= numberOfTerms; ) {
                    j = (j * 100) + i;
                    System.out.print(j + " + ");

                    for (long k = 2; k <= numberOfTerms; ) {
                        k = (k * 1000) + j;
                        System.out.print(k + " + ");

                        for (long l = 2; l <= numberOfTerms; ) {
                            l = (l * 10000) + k;
                            System.out.print(l + " + ");
                            System.out.println("Sum is: "+s+i+j+k+l);
                        }
                    }
                }
            }
        }
    }
}
