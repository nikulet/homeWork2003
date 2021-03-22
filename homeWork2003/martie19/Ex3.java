package homeWork2003.martie19;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
                /*
3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("        Exercitiul 3\n\nIntrodu un numar non-negative din 6 cifre: ");
        int nrr=scanner.nextInt();
        int ras=nrr/100000;
        int ras1=nrr/10000;
        int ras2=nrr/1000;
        int ras3=nrr/100;
        int ras4=nrr/10;
        int ras5=nrr/1;

        System.out.println("\nRaspunsul: "+ras5+"\n");
    }
}
