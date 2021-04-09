package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaximumAndMinimumElementInAnArray {
    /*
    3.  Write a program in Java to find the maximum and minimum element in an array.
    Test Data:
    Input the number of elemets to be stored in the array:  3
    Input 3 elements in the array:
    element - 0:45
    element - 1:25
    element - 2:21
    or another representation would be
    [45,25,21]
    Expected Output:
    Maximum element is: 45
    Minimum element is: 21
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored " +
                "in the array: ");
        int number = scanner.nextInt();
        System.out.println("Input " + number + " elements in the array.");
        int[] arrayNumber = new int[number];
        int nr = 1, max = 0, min = 0, s = 0, e = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Input " + nr + " element in the array: ");
            int declaretValue = scanner.nextInt();
            arrayNumber[i] = declaretValue;
            nr++;
            System.out.println("element -" + i + ":" + declaretValue);
            for (int j = 0; j < arrayNumber.length; j++) {
                if (declaretValue > arrayNumber[j] || declaretValue > max) {  //is valid for two number only
                    max = declaretValue;   //max number

                } else if (declaretValue < arrayNumber[j] || declaretValue <= max) {
                    min = declaretValue;  //min number
                }
            }
        }
        System.out.println("\n" + Arrays.toString(arrayNumber) + "\n");
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}

//output incorect nu de fiecare data

