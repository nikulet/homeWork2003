package tekWillHomeWorks.homeWork2003.april02ForLoopAndForEach;


import java.util.Scanner;

public class FibonacciSeriesUpToNTermsUsingForLoop {
    /*
    5.  Write a program to print Fibonacci series up to n terms using loop.
    Exemple:
    Input:  Input number of terms: 10
    Output:  Fibonacci series:
    0,1,1,2,3,5,8,13,21,34
    Formula  F(n)=F(n-1)+F(n-2);
     */
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int nr=scanner.nextInt();
        int n=0;
        for (int i=0;i<=nr;i++){
            n=(i+n)*1;   //0+0=0*1=0  1+0=1*1=1  2+1=3*1  3+3=6
            System.out.println(n);   //0  1  3
        }


    }
}
