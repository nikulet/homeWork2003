package tekWillHomeWorks.homeWork2003.april07Array;

import java.util.Arrays;
import java.util.Scanner;

public class PatternsBiDimensionalArrayAndInitializeThemUsing {
    /*
6.  Write a Java program that will print given patterns (use bi-dimensional arrays
and initialize them using for-loops!)

Pattern A:     Pattern B:       Pattern C:
1 0 0 0        0 0 0 1          1 1 1 1
0 1 0 0        0 0 1 0          1 0 0 1
0 0 1 0        0 1 0 0          1 0 0 1
0 0 0 1        1 0 0 0          1 1 1 1
     */
    public static void main(String[] args) {

        //Varianta nr. 2 cu if

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter e number for a line & row array: ");
//        int nrLineRow = scanner.nextInt();
//        int[][] biDimensionalArray = new int[nrLineRow][nrLineRow];
//        for (int i = 0; i < biDimensionalArray.length; i++) {
//            for (int j = 0; j < biDimensionalArray.length; j++) {
//                if (i == 0 && j == 0) {
//                    biDimensionalArray[i][j] = 1;
//                } else if (i == 1 && j == 1) {
//                    biDimensionalArray[i][j] = 1;
//                } else if (i == 2 && j == 2) {
//                    biDimensionalArray[i][j] = 1;
//                } else if (i == 3 && j == 3) {
//                    biDimensionalArray[i][j] = 1;
//                }
//            }
//        }
//        System.out.println("Pattern A: ");
//        for (int f = 0; f < biDimensionalArray.length; f++) {
//            System.out.println(Arrays.toString(biDimensionalArray[f]));
//        }
////*****************************************************
//        System.out.print("\n");
//        int[][] twoDimensions = new int[nrLineRow][nrLineRow];
//        for (int e = 0; e < twoDimensions.length; e++) {
//            for (int z = 0; z < twoDimensions.length; z++) {
//                if (e == 0 && z == 3) {
//                    twoDimensions[e][z] = 1;
//                } else if (e == 1 && z == 2) {
//                    twoDimensions[e][z] = 1;
//                } else if (e == 2 && z == 1) {
//                    twoDimensions[e][z] = 1;
//                } else if (e == 3 && z == 0) {
//                    twoDimensions[e][z] = 1;
//                }
//            }
//        }
//        System.out.println("Pattern B: ");
//        for (int q = 0; q < twoDimensions.length; q++) {
//            System.out.println(Arrays.toString(twoDimensions[q]));
//        }
//        //*****************************************************
//        System.out.print("\n");
//        int[][] twoDimensionsT = new int[nrLineRow][nrLineRow];
//        for (int e = 0; e < twoDimensionsT.length; e++) {
//            for (int z = 0; z < twoDimensionsT.length; z++) {
//                if (e == 0 && z == 0) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 0 && z == 1) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 0 && z == 2) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 0 && z == 3) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 1 && z == 0) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 1 && z == 3) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 2 && z == 0) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 2 && z == 3) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 3 && z == 0) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 3 && z == 1) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 3 && z == 2) {
//                    twoDimensionsT[e][z] = 1;
//                } else if (e == 3 && z == 3) {
//                    twoDimensionsT[e][z] = 1;
//                }
//            }
//        }
//        System.out.println("Pattern C: ");
//        for (int q = 0; q < twoDimensionsT.length; q++) {
//            System.out.println(Arrays.toString(twoDimensionsT[q]));
//        }

        //**********************************************************************

        //Varianta nr. 1 a vary simple metod

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the matrix size: ");
        int martixSize = scanner.nextInt();

        int[][] matrix = new int[martixSize][martixSize];

        for (int row = 0; row < matrix.length; ++row) {
            for (int colum = 0; colum < matrix[row].length; ++colum) {
                System.out.print("Give a value on [" + row + "][" + colum + "] position: ");
                matrix[row][colum] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix[row].length; ++column) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //*************************************************
        //metoda cu ForEach
        System.out.println("\n" + Arrays.deepToString(matrix));

        for (int[] list : matrix) {
            for (int number : list) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

