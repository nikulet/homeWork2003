package tekWillHomeWorks.homeWork2003.april09ExercisesWithArray;

import java.util.Arrays;

public class DisplayValueInitializeFloatingPointCopyElementSmallestAndLargestValues {
    /*
    1.  Write Java statements to accompish each of the following tasks:
    a) Display the value of element 6 of array f.
    b) Initialize each of the five elements of one-dimensional integer array g to 8.
    c) Total the 100 elements of floating-point array c.
    d) Copy 11-element array a into the first portion of array b, witch contains 34 elements.
    e) Determine and display the smallest and largest values contained in 99-elements floating-point array w.


    1. Scrieți instrucțiuni Java pentru a însoți fiecare dintre următoarele sarcini:
     a) Afișați valoarea elementului 6 al matricei f.
     b) Inițializați fiecare dintre cele cinci elemente ale matricei întregi unidimensionale g la 8.
     c) Totalizați cele 100 de elemente ale matricei în virgulă mobilă c.
     d) Copiați matricea a 11 elemente în prima porțiune a matricei b, vrăjitoarea conține 34 de elemente.
     e) Determinați și afișați cele mai mici și cele mai mari valori conținute în matricea cu virgulă mobilă de 99 de elemente w.
     */
    public static void main(String[] args) {
        // a) Display the value of element 6 of array f.
        int[] f = {2, 5, 7, 9, 3, 5, 6, 1, 45, 21};
        int element6 = 0;
        for (int element = 0; element < f.length; ++element) {
            if (element == 5) {
                element6 = f[5];
            }
        }
        System.out.println("a) Element 6 of array f is: " + element6);

        //************************************************************
        //  b) Initialize each of the five elements of one-dimensional integer array g to 8.

        int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int initialize = 0; initialize < 5; initialize++) {
            g[initialize] = 8;
        }
        System.out.println("b) The five elements of one-dimensional integer array g is initializing with 8: " + Arrays.toString(g));

        //******************************************************************
        // c) Total the 100 elements of floating-point array c.

        System.out.print("c) The 100 elements of floating-point array c is: ");
        float[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        System.out.print(Arrays.toString(c));

        //******************************************************************
        //d) Copy 11-element array a into the first portion of array b, witch contains 34 elements.

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] b = {20, 21, 22, 23, 24, 25, 2, 6, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 21, 3434, 323};
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("\nd) The changes number is: " + Arrays.toString(b));

        //******************************************************************
        //e) Determine and display the smallest and largest values contained in 99-elements floating-point array w.
        //e) Determinați și afișați cele mai mici și cele mai mari valori conținute în matricea cu virgulă mobilă de 99 de elemente w.

        float[] w = {1, 27, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println("e) Determine and display the smallest and largest values contained in 99-elements floating-point array w.");
        float temp;
        for (int i = 0; i < w.length; i++) {
            for (int j = i + 1; j < w.length; j++) {
                if (w[i] > w[j]) {
                    temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }
        System.out.println("The smallest values: ");
        for (int smallestNumbers = 0; smallestNumbers < 50; smallestNumbers++) {
            System.out.print(w[smallestNumbers] + ", ");
        }
        System.out.println("\nThe largest values: ");
        for (int s = 50; s < 99; s++) {
            System.out.print(w[s] + ", ");
        }
    }
}
