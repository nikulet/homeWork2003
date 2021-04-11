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
        //Varianta nr. 1  and a simple resolving

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored " +
                "in the array: ");
        int number = scanner.nextInt();
        System.out.println("Input " + number + " elements in the array.");
        int[] arrayNumber = new int[number];
        int nr = 1, temp = 0, max = 0, min = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Input " + nr + " element in the array: ");
            arrayNumber[i] = scanner.nextInt();
            nr++;
        }
        System.out.println();
        for (int g = 0; g < arrayNumber.length; g++) {
            System.out.println("element - " + g + " : " + arrayNumber[g]);
        }

        for (int i = 0; i < arrayNumber.length; ++i) {
            for (int j = i + 1; j < arrayNumber.length; ++j) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    temp = arrayNumber[i];  //the variable temp take  value of arrayNumber[i]
                    arrayNumber[i] = arrayNumber[j];   //the variable arrayNumber[i] take  value of arrayNumber[j]
                    arrayNumber[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrayNumber.length; ++i) {
            if (i == 0) {
                min = arrayNumber[i];
            }
            max = arrayNumber[i];
        }

        System.out.println("\nMatrix ascending is: \n" + Arrays.toString(arrayNumber) + "\n");
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}

//Varianta nr. 2 a long cod with if

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the number of elements to be stored " +
//                "in the array: ");
//        int number = scanner.nextInt();
//        System.out.println("Input " + number + " elements in the array.");
//        int[] arrayNumber = new int[number];
//        int nr = 1, max = 0, min = 0;
//        for (int i = 0; i < arrayNumber.length; i++) {
//            System.out.print("Input " + nr + " element in the array: ");
//            int declaretValue = scanner.nextInt();
//            arrayNumber[i] = declaretValue;
//            nr++;
//        }
//        System.out.println();
//        for (int g = 0; g < arrayNumber.length; g++) {
//            System.out.println("element -" + g + ":" + arrayNumber[g]);
//        }
//        for (int j = 0, l = 1; l < arrayNumber.length; l++) {
//            if (arrayNumber[j] > arrayNumber[l]) {  //is valid for two number only
//                max = arrayNumber[j];
//                min = arrayNumber[l];
//            } else {
//                max = arrayNumber[l];
//                min = arrayNumber[j];
//            }
//        }
//        for (int j = 0, l = 1, n = 2; n < arrayNumber.length; n++) {
//            if ((arrayNumber[j] > arrayNumber[l] && arrayNumber[j] > arrayNumber[n]) && (arrayNumber[l] > arrayNumber[n])) {
//                max = arrayNumber[j];   //max number j
//                min = arrayNumber[n];   //minim n
//            } else if ((arrayNumber[j] > arrayNumber[l] && arrayNumber[j] > arrayNumber[n]) && (arrayNumber[l] < arrayNumber[n])) {
//                max = arrayNumber[j];
//                min = arrayNumber[l];
//            } else if ((arrayNumber[j] > arrayNumber[l] && arrayNumber[j] < arrayNumber[n]) && (arrayNumber[j] < arrayNumber[n])) {
//                max = arrayNumber[n];
//                min = arrayNumber[l];
//            } else if ((arrayNumber[j] < arrayNumber[l] && arrayNumber[j] < arrayNumber[n]) && (arrayNumber[l] < arrayNumber[n])) {
//                max = arrayNumber[n];  //max n
//                min = arrayNumber[j];  //min j
//            } else if ((arrayNumber[j] < arrayNumber[l] && arrayNumber[j] < arrayNumber[n]) && (arrayNumber[l] > arrayNumber[n])) {
//                max = arrayNumber[l];
//                min = arrayNumber[j];
//            } else if ((arrayNumber[j] < arrayNumber[l] && arrayNumber[j] > arrayNumber[n]) && (arrayNumber[l] > arrayNumber[j])) {
//                max = arrayNumber[l];
//                min = arrayNumber[n];
//            }
//        }   //it is valid for only 3 numbers
//        System.out.println("\n" + Arrays.toString(arrayNumber) + "\n");
//        System.out.println("Maximum element is: " + max);
//        System.out.println("Minimum element is: " + min);


