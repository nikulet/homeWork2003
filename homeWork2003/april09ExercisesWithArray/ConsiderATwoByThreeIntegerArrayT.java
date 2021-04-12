package tekWillHomeWorks.homeWork2003.april09ExercisesWithArray;

import java.util.Arrays;
import java.util.Scanner;

public class ConsiderATwoByThreeIntegerArrayT {
    /*
    2.  Consider a two-by-three integer array t.
    a) Write a statment that declares and creates t.
    b) How many rows does t have?
    c) How many columns does t have?
    d) How many elements does t have?
    e) Write access expressions for all the elements in row 1 of t.
    f) Write access expresion for all the elements in column 2 of t.
    g) Write a single statment that sets the element of t in row 0 and column 1 to zero.
    h) Write individual statments to initialize each element of t to zero.
    i) Write a nested for statment that initializes each element of t to zero.
    j) Write a nested for statment that inputs the values for the elements of t from the user.
    k) Write a series of statments that determints and displays the smallest value in t.
    l) Write a single print f statment that displays the elements of the first row of t.
    m) Write a statment that totals the elements of the third column of t. Do not use repetition.
    n) Write a series of statments that displays the contents of t in tabular format.
    List the column indices as headings across the top,and list the row indices at the left of
    each row.
     */

    public static void main(String[] args) {
        int[][] t = {{3, 4}, {7, 8, 9}};           //new int[2][3];
        int numberOfRows = 1, numberOfColomns = 1, elements = 0;
        for (int row = 1; row < t.length + 1; row++) {
            for (int column = 1; column < t.length + 2; column++) {
                numberOfColomns = column;
                elements = row * column;
            }
            numberOfRows = row;
        }
        System.out.println("b) The numbers of rows in t is: " + numberOfRows + "\nc) The numbers of rows in t is: " + numberOfColomns);
        System.out.println("d) T have " + elements + " elements.");

        //e) Write access expressions for all the elements in row 1 of t.
        //e) Scrieți expresii de acces pentru toate elementele din rândul 1 al t.
        System.out.print("e) All the elements in row 1 of t: ");
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j] + " ");
            }
        }

        //f) Write access expresion for all the elements in column 2 of t.
        System.out.print("\nf) All the elements in column 2 of t is: ");
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t.length + 1; column++) {
                if (column == 1) {
                    System.out.print(t[row][column] + " ");
                }
            }
        }

        //g) Write a single statment that sets the element of t in row 0 and column 1 to zero.
        System.out.println("\ng) Sets the element of t in row 0 and column 1 to zero.");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0 && j == 1) {
                    t[i][j] = 1;
                }
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }


        //h) Write individual statments to initialize each element of t to zero.
        System.out.println("\nh) Individual statments to initialize each element of t to zero.");
        t[0][0] = 0;
        t[0][1] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }


        //i) Write a nested for statment that initializes each element of t to zero.
        System.out.println("\ni) Nested for statment that initializes each element of t to zero.");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        //j) Write a nested for statment that inputs the values for the elements of t from the user.
        System.out.println("\nj) Nested for statment that inputs the values for the elements of t from the user.");
        Scanner scanner = new Scanner(System.in);
        int temp;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print("Input the value for element [" + i + "][" + j + "] : ");
                int elementNumber = scanner.nextInt();
                t[i][j] = elementNumber;
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(t));

        //k) Write a series of statments that determints and displays the smallest value in t.
        System.out.println("k) Statments that determints and displays the smallest value in t.");
        for (int i = 0; i < t.length; ++i) {
            for (int j = 0; j < t[i].length; ++j) {
//                System.out.print("Input the value for element ["+i+"]["+j+"] : ");
//                int elementNumber=scanner.nextInt();
//                t[i][j]=elementNumber;
            }
        }

        System.out.println();
        // l) Write a single print f statment that displays the elements of the first row of t.
        System.out.println("l) The elements of the first row of t is: ");
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
        }

        System.out.println();
        //m) Write a statment that totals the elements of the third column of t. Do not use repetition.
        //m) Scrieți o declarație care totalizează elementele celei de-a treia coloane a t. Nu utilizați repetarea.
        System.out.println("m) The elements total of the third column of t is: ");


        System.out.println();
        //n) Write a series of statments that displays the contents of t in tabular format.
        System.out.println("n)  t in tabular format.");
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(" ___\n");
                System.out.println("| " + t[i][j] + " |");
                System.out.print(" ---\n");
            }
        }


    }
}
