package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSumOfAllElementsOftHEaRRAY {
    public static void main(String[] args) {
        /*
        1.  Write a program in Java to find the sum of all elements
        of the array.Test Data:
        Input 3 elements in the array:
        element -0:2
        element -1:5
        element -2:8
        or another representation would be
        [2,5,8]
        Expected Output:
        Sum of all elements stored in the array is: 15
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored " +
                "in the array: ");
        int number = scanner.nextInt();
        System.out.println("Input " + number + " elements in the array.");
        int[] arrayNumber = new int[number];
        int nr = 1, sum = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Input " + nr + " element in the array: ");
            int declaretValue = scanner.nextInt();
            arrayNumber[i] = declaretValue;
            nr++;
            System.out.println("element -" + i + ":" + declaretValue);
            sum += declaretValue;
        }
        System.out.println("\n" + Arrays.toString(arrayNumber) + "\n");
        System.out.println("Sum of all elements stored in the array is: " + sum);
    }
}
