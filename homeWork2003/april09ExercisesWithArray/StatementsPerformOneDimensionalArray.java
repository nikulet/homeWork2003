package tekWillHomeWorks.homeWork2003.april09ExercisesWithArray;

import java.util.Arrays;

public class StatementsPerformOneDimensionalArray {
    /*
    3.  Write statements that perform the following one-dimensional array operations:
    a) Set the 10 elements of integer array counts to zero.
    b) Add one to each of the 15 elements of integer array bonus.
    c) Display the five values of integer array best Scores in column format.

    3. Scrieți enunțuri care să efectueze următoarele operații matriciale unidimensionale:
     a) Setați cele 10 elemente ale numărului de matrice întregi la zero.
     b) Adăugați câte unul la fiecare dintre cele 15 elemente ale bonusului matricei întregi.
     c) Afișați cele cinci valori ale matricei întregi Cele mai bune scoruri în format de coloană.
     */
    public static void main(String[] args) {

        int[] numbers = {12, 33, 4, 5, 2, 523, 42, 5, 21, 34, 54, 32, 12, 34, 23, 23, 34, 4, 231, 3, 3, 43, 235, 232};
        //********************************************************************
        System.out.println("a) Set the 10 elements of integer array counts to zero.");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 10) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));

        //********************************************************************
        System.out.println();
        System.out.println("b) Add one to each of the 15 elements of integer array bonus.");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 15) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));

        //********************************************************************
        //c) Afișați cele cinci valori ale matricei întregi Cele mai bune scoruri în format de coloană.
        System.out.println("\nc) Display the five values of integer array best Scores in column format.");
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i < 5) {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}