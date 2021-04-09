package tekWillHomeWorks.homeWork2003.april02ForLoopAndForEach;


import java.util.Scanner;

public class FindFactoriaWithFor {
    /*
    6.  Write a loop to find the factorial of any number.
    For example: calculate the factorial of 5

   5!=5x4x3x2x1=120
     */
    public static void main(String[] args) {

        //Varianta 1

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please,enter a number for calculate a factorial: ");
//        long number = scanner.nextLong();
//        long sum3 = 1;
//        System.out.print(number + "! = ");
//        for (long s = number; 0 < s; s--) {
//            System.out.print(s + " x ");
//        }
//        System.out.print("=");
//        for (int i = 1, j = 2; i <= number; i++, j++) {
//            sum3 = i * sum3;
//        }
//        System.out.print(" " + sum3);


        //Varianta 2

        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        System.out.print("Input number of terms: ");
        int nr = scanner.nextInt();
        System.out.print(nr + "! = ");
        for (int i = nr; i >= 1; i--) {
            sum *= i;
            System.out.print(i + " x ");
        }
        System.out.println(" = " + sum);
    }
}
