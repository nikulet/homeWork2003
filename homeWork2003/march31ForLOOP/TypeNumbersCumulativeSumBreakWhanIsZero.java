package tekWillHomeWorks.homeWork2003.march31ForLOOP;

import java.util.Scanner;

public class TypeNumbersCumulativeSumBreakWhanIsZero {
    /*
    Write a program that asks the user to type in numbers.
    After each entery,the program should report the cumulativ sum of the entries to date.
    The program should terminate when the user enters 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNumberEntred = 0;
        System.out.print("Enter a number: ");
        for (int number = scanner.nextInt(); number !=0; number = scanner.nextInt() ){
            sumNumberEntred+= number;
            System.out.println("Cumulativ sum of the entries: " + sumNumberEntred);
            System.out.print("Enter a number: ");
        }
    }
}
