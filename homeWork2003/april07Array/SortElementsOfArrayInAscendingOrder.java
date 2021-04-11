package tekWillHomeWorks.homeWork2003.april07Array;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
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
        //Varianta nr. 1 metoda de miina de rezoovat
        int[] unsortedArray = {10, 3, 7, 8, 2, 1, 11, 5};

        int temp;
        int size = unsortedArray.length;

        System.out.println(Arrays.toString(unsortedArray));
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (unsortedArray[i] < unsortedArray[j]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
            System.out.println(i + 1 + " iteration: " + Arrays.toString(unsortedArray));
        }

        int randomArray[] = new int[20000000];

        Random random = new Random();
        for (int i = 0; i < randomArray.length; ++i) {
            randomArray[i] = random.nextInt(100);
        }
        int randomArrayCopy[] = Arrays.copyOf(randomArray, randomArray.length);

        System.out.println("Start sorting original array");

        LocalTime firstSortingStart = LocalTime.now();
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (randomArray[i] < randomArray[j]) {
                    temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
        }
        LocalTime firstSortingEnd = LocalTime.now();

        System.out.println("Finished sorting original array, time: " + firstSortingEnd + " - " + firstSortingStart);

        LocalTime secondSortingStart = LocalTime.now();
        System.out.println("Start sorting copy array");
        Arrays.sort(randomArrayCopy);
        LocalTime secondSortingEnd = LocalTime.now();
        System.out.println("Finished sorting copy array, time: " + secondSortingEnd + " - " + secondSortingStart);

    }
}


//   Varianta nre 2 cu if

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the number of elements to be stored " +
//                "in the array: ");
//        int number = scanner.nextInt();
//        System.out.println("Input " + number + " elements in the array.");
//        int[] arrayNumber = new int[number];
//        int nr = 1, b = 0, c = 0, a = 0;
//        for (int i = 0; i < arrayNumber.length; i++) {
//            System.out.print("Input " + nr + " element in the array: ");
//            int declaretValue = scanner.nextInt();
//            arrayNumber[i] = declaretValue;
//            nr++;
//        }
//        System.out.println();
//        for (int j = 0; j < arrayNumber.length; j++) {
//            System.out.println("element -" + j + ":" + arrayNumber[j]);
//        }
//        for (int l = 0, g = 1; g < arrayNumber.length; g++) {
//
//            if (arrayNumber[l] > arrayNumber[g]) {
//                a = arrayNumber[g];
//                b = arrayNumber[l];
//            }
//        }
////*********************************************************
//        for (int l = 0, g = 1, x = 2; x < arrayNumber.length; x++) {
//            if ((arrayNumber[l] > arrayNumber[g] && arrayNumber[l] > arrayNumber[x])
//                    && (arrayNumber[g] > arrayNumber[x])) {
//                a = arrayNumber[x];
//                b = arrayNumber[g];
//                c = arrayNumber[l];
//            } else if ((arrayNumber[l] > arrayNumber[g] && arrayNumber[l] > arrayNumber[x])
//                    && (arrayNumber[g] < arrayNumber[x])) {
//                a = arrayNumber[g];
//                b = arrayNumber[x];
//                c = arrayNumber[l];
//            } else if ((arrayNumber[l] > arrayNumber[g] && arrayNumber[l] < arrayNumber[x])
//                    && (arrayNumber[g] < arrayNumber[x])) {
//                a = arrayNumber[g];
//                b = arrayNumber[l];
//                c = arrayNumber[x];
//            }
//            else if ((arrayNumber[l] < arrayNumber[g] && arrayNumber[l] < arrayNumber[x])
//                    && (arrayNumber[g] < arrayNumber[x])) {
//                a = arrayNumber[l];
//                b = arrayNumber[g];
//                c = arrayNumber[x];
//            }else if ((arrayNumber[l] < arrayNumber[g] && arrayNumber[l] < arrayNumber[x])
//                    && (arrayNumber[g] > arrayNumber[x])) {
//                a = arrayNumber[l];
//                b = arrayNumber[x];
//                c = arrayNumber[g];
//            }
//            else if ((arrayNumber[l] < arrayNumber[g] && arrayNumber[l] > arrayNumber[x])
//                    && (arrayNumber[l] > arrayNumber[x])) {
//                a = arrayNumber[g];
//                b = arrayNumber[x];
//                c = arrayNumber[l];
//            }
//            System.out.println("\n" + Arrays.toString(arrayNumber) + "\n");
//            System.out.println("Elements of array in sorted ascending order: " + a + " " + b+" "+c);
//        }




