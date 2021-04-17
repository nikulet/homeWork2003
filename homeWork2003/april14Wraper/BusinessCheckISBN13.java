package tekWillHomeWorks.homeWork2003.april14Wraper;

import java.util.Arrays;
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
//        Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
//            String numberISBN = scanner.next();
//
//            long n = Long.parseLong(numberISBN); //am convertit numerile String in int
//            System.out.println("Stringul cu numere convertit intrun int de" +
//                    " tip primitiva este " + n);
//            int ds = numberISBN.length();  //aflam cite cifre contine Stringul introdus de la user cu cifre
//            System.out.println("Numarul introdus contine " + ds + " cifre.");


// Ce metoda sa folosec pentru a lua o cifra cite o cifra din long n   ??? pentru cazul de mai sus


        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int[] numbersConvertingFromStringToInt = new int[12];
        String[] theNumbersISBN = new String[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter a number for ISBN: ");
            String numbersISBN = scanner.nextLine();
            theNumbersISBN[i] = numbersISBN;
            int n = Integer.parseInt(theNumbersISBN[i]);
            numbersConvertingFromStringToInt[i] = n;
        }
        System.out.print("\nThe ISBN-13 number is: ");
        for (int nr : numbersConvertingFromStringToInt) {
            System.out.print(nr + " ");

        }
        b = 10 - (numbersConvertingFromStringToInt[0] + (3 * numbersConvertingFromStringToInt[1]) + numbersConvertingFromStringToInt[2] + (3 * numbersConvertingFromStringToInt[3]) + numbersConvertingFromStringToInt[4] + (3 * numbersConvertingFromStringToInt[5]) + numbersConvertingFromStringToInt[6] + (3 * numbersConvertingFromStringToInt[7]) + numbersConvertingFromStringToInt[8] + (3 * numbersConvertingFromStringToInt[9]) + numbersConvertingFromStringToInt[10] + (3 * numbersConvertingFromStringToInt[11])) % 10;
        if (b == 10) {
            System.out.print(0);
        } else
            System.out.print(b);
    }
}