package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Scanner;

public class BusinessCheckISBN13 {
    public static void main(String[] args) {
        /*
        2.  (Business: check ISBN-13) ISBN-13 is a new standard for identifying books.
        It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13.  The last digit d13 is a cheksum,
        which is calculated from the other digits using the following formula:
        10-(d1+3d2+d3+3d4+d5+3d6+d7+3d8+d9+3d10+d11+3d12) %10
        If the checksum is 10, replace it with 0. Your program should read the input as a string.
        Here are simple runs:
        Enter the first 12 digits of an ISBN-13 as a string: 978013213080
        The ISBN-13 number is 9780132130806
        Enter the first 12 digits of an ISBN-13 as a string: 978013213079
        The ISBN-13 number is 9780132130790
        Enter the first 12 digits of an ISBN-13 as a string: 97801320
        97801320 is an invalid input
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String numberISBN = scanner.next();
        long b = 0;
        long n = Long.parseLong(numberISBN); //am convertit numerile String in int
        System.out.println("The String converting in long is: " + n);
        int ds = numberISBN.length();  //aflam cite cifre contine Stringul introdus de la user cu cifre
        System.out.print("The string lenght is: " + ds + "\n");
        long[] stringconvertToNumber = new long[numberISBN.length() + 1];
        for (int i = 0; i < numberISBN.length(); i++) {
            char c = numberISBN.charAt(i);
            long k = Character.digit(c, 10);
            stringconvertToNumber[i] = k;
        }
        if (stringconvertToNumber.length != 13) {
            System.out.println(numberISBN + " is a invalid input.");
        } else {
            b = 10 - (stringconvertToNumber[0] + (3 * stringconvertToNumber[1]) + stringconvertToNumber[2] + (3 * stringconvertToNumber[3]) + stringconvertToNumber[4] + (3 * stringconvertToNumber[5]) + stringconvertToNumber[6] + (3 * stringconvertToNumber[7]) + stringconvertToNumber[8] + (3 * stringconvertToNumber[9]) + stringconvertToNumber[10] + (3 * stringconvertToNumber[11])) % 10;
            System.out.print("The ISBN-13 number is:  ");
            System.out.print(numberISBN + (b == 10 ? 0 : b));
        }
    }
}