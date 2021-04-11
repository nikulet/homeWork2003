package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberOfDuplicateElementsInAnArray {
    public static void main(String[] args) {
        /*
2.  Write a program in Java to count a total number of duplicate elements in an array.
Test Data:
Input the number of elements to be stored in the array: 3
Input 3 elements in the array:
element - 0:5
element - 1:1
element - 2:1
or another representation would be
[5,1,1]
Expected Output:
Total number of duplicate elements found in the array is: 1
         */

        //Varianta nr. 1

        int unsortedARrayWithDuplicates[] = {1, 5, 2, 3, 1, 6, 7, 1};

        int duplicateCounter = 0;
        for (int i = 0; i < unsortedARrayWithDuplicates.length; ++i) {
            for (int j = i + 1; j < unsortedARrayWithDuplicates.length; ++j) {
                if (unsortedARrayWithDuplicates[i] == unsortedARrayWithDuplicates[j]) {
                    duplicateCounter++;
                    break;
                }
            }
        }
        System.out.println("Number of duplicates: " + duplicateCounter);

//****************************************************************

        //Varianta nr. 2

        int temp;
        for (int i = 0; i < unsortedARrayWithDuplicates.length; ++i) {
            for (int j = i + 1; j < unsortedARrayWithDuplicates.length; ++j) {
                if (unsortedARrayWithDuplicates[i] < unsortedARrayWithDuplicates[j]) {
                    temp = unsortedARrayWithDuplicates[i];
                    unsortedARrayWithDuplicates[i] = unsortedARrayWithDuplicates[j];
                    unsortedARrayWithDuplicates[j] = temp;
                }
            }
        }
        duplicateCounter = 0;
        for (int index = 1; index < unsortedARrayWithDuplicates.length; ++index) {
            if (unsortedARrayWithDuplicates[index - 1] == unsortedARrayWithDuplicates[index]) {
                duplicateCounter++;
            }
        }
        System.out.println("Number of duplicates: " + duplicateCounter);

    }
}

// Varianta nr 3 ce mai grea cu if

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the number of elements to be stored in the array: ");
//        int number = scanner.nextInt();
//        int[] numbersOfArray = new int[number];
//        int index = 1, add = 0;
//        System.out.println("Input " + number + " elements in the array.\n");
//        for (int i = 0; i < numbersOfArray.length; i++) {
//            System.out.print("Input " + index + " element in the array: ");
//            int nr1 = scanner.nextInt();   //user write a number
//            numbersOfArray[i] = nr1;//puting the value of nr1 in to array
//            index++;
//        }
//        System.out.println();
//        for (int d = 0; d < numbersOfArray.length; d++) {
//            System.out.println("element  " + d + " : " + numbersOfArray[d]);
//        }
//
//
//        for (int j = 0; j < numbersOfArray.length; ++j) {
//            for (int x = 1; x < numbersOfArray.length; ++x) {
//                if (numbersOfArray[j] == numbersOfArray[x]) {
//                    add = 1;
//                }
//            }
//        }
//
//        for (int j = 0; j < numbersOfArray.length; ++j) {
//            for (int x = 1; x < numbersOfArray.length; ++x) {
//
//            }
//        }
//        System.out.println("\n" + Arrays.toString(numbersOfArray));
//        System.out.println("\nTotal number of duplicats elements found in the array is: " + add);


//maximul de cifre este 3 din care depisteaza daca sunt duplicate numerele sau nu