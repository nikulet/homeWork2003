package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramJava2DarrayOfSize3x3AndPrintMatrix {
    /*
    5. Write a program in Java for a 2D array (bi-dimensional array) of size 3x3
    and print the matrix.
Test Data :
Input elements in the matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [0],[2] : 3
element - [1],[0] : 4
element - [1],[1] : 5
element - [1],[2] : 6
element - [2],[0] : 7
element - [2],[1] : 8
element - [2],[2] : 9
or another representation would be
[1, 2, 3][4, 5, 6][7, 8, 9]
Expected Output :
The matrix is :
1 2 3
4 5 6
7 8 9
8:44
Experimentați dacă aveți timp și dorință, încercați să faceți nu doar cu for-loop
dar și cu alte cicluri
Hint-hint: încercați să printați array-urile uni-dimensionale și bi-dimensionale
cu for-each loop
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of line & row for matice bi-dimensional: ");
        int lineRow = scanner.nextInt();

        int[][] matriceBiDimensional = new int[lineRow][lineRow];
        int nr = 0;
        for (int i = 0; i < matriceBiDimensional.length; i++) {
            for (int j = 0; j < matriceBiDimensional[i].length; j++) {
                System.out.print("Enter a number for matrix bi-dimensional: [" + i + "][" + j + "] position: ");
                int lineRowNumber = scanner.nextInt();
                matriceBiDimensional[i][j] = lineRowNumber;
            }
        }
        System.out.println("\nMatrix:");
        for (int k = 0; k < matriceBiDimensional.length; ++k) {
            System.out.print("\n" + Arrays.toString(matriceBiDimensional[k]));
        }

        System.out.println("\n\nThe matrix is: ");
        for (int g = 0; g < matriceBiDimensional.length; g++) {
            for (int t = 0; t < matriceBiDimensional.length; t++) {
                nr = matriceBiDimensional[g][t];
                System.out.print(nr + "  ");
            }
            System.out.println();
        }
    }
}
