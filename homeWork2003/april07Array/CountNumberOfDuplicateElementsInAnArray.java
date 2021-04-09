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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int number = scanner.nextInt();
        int[] numbersOfArray = new int[number];
        int index = 1, add = 0;
        System.out.println("Input " + number + " elements in the array.\n");
        for (int i = 0; i < numbersOfArray.length; i++) {
            System.out.print("Input " + index + " element in the array: ");
            int nr1 = scanner.nextInt();   //user write a number
            for (int j = 0; j < numbersOfArray.length; j++) {
                if (numbersOfArray[j] == nr1) {  //it's working only for one,two dublicate, for three ore
                    //  more is not working
                    add += 1;
                    if (add == 3) {
                        add -= 1;
                    }
                }
            }
            numbersOfArray[i] = nr1;//puting the value of nr1 in to array
            System.out.println("element " + i + " : " + nr1);  //printing the value of element position
            index++;
        }
        System.out.println("\n" + Arrays.toString(numbersOfArray));
        System.out.println("\nTotal number of duplicats elements found in the array is: " + add);
    }
}

//maximul de cifre este 3 din care depisteaza daca sunt duplicate numerele sau nu