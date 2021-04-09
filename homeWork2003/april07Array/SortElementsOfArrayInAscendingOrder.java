package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementsOfArrayInAscendingOrder {
    /*
    4.  Write a program in Java to sort elements of array in ascending order.
    Input the size of array: 5
    Input 5 elements in the array:
    element  -0:2
    element  -1:7
    element  -2:4
    element  -3:5
    element  -4:9
    or another representation would be
    [2,7,4,5,9]
    Expected Output:
    Elements of array in sorted ascending order:
    2 4 5 7 9
    Note:Do not use any Java methad for sorting.Use your own method!Hint-Hint:
    See Bubble Sort on Google
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored " +
                "in the array: ");
        int number = scanner.nextInt();
        System.out.println("Input " + number + " elements in the array.");
        int[] arrayNumber = new int[number];
        int nr = 1, s = 0, e = 0, a = 0, max = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Input " + nr + " element in the array: ");
            int declaretValue = scanner.nextInt();
            arrayNumber[i] = declaretValue;
            nr++;
            if (arrayNumber[i] > s || arrayNumber[0] > arrayNumber[1] && arrayNumber[0] > arrayNumber[2] &&
                    arrayNumber[0] > arrayNumber[3] || arrayNumber[0] > arrayNumber[4]) {
                e = arrayNumber[0];

                if (arrayNumber[1] > arrayNumber[i] && arrayNumber[1] < arrayNumber[2] &&
                        arrayNumber[1] > arrayNumber[3] && arrayNumber[1] > arrayNumber[4]) {
                    a = arrayNumber[1];
                }
            }

        }
        System.out.println("\n" + Arrays.toString(arrayNumber) + "\n");
        System.out.println("Elements of array in sorted ascending order: " + e);
    }
}
//Out put is not corect