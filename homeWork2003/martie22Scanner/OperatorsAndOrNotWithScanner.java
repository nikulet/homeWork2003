package tekWillHomeWorks.homeWork2003.martie22Scanner;

import java.util.Scanner;

public class OperatorsAndOrNotWithScanner {
    public static void main(String[] args) {
        /*
5. What's the output of this program?
int a = 18;
int b = 22;
int c = 30;
System.out.println(++a > 18 || b++ < 10);
System.out.println(b-- > 30 && a++ <= 19);
System.out.println(c++ > a && a < b || c++ < 30);
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
Which expressions will execute and which will not?
Aici la fel, încercați singuri să ajungeți la rezultat, și să scrieți în
comentarii alături de fiecare System.out.println care expresie este evaluată sau nu, și de ce
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("        Exercise 5\n\nWrite a first number: ");
        int aa = scanner.nextInt();
        System.out.println("Write a seconde number: ");
        int b = scanner.nextInt();
        System.out.println("Write a third number: ");
        int c = scanner.nextInt();

        //                  19 > 18  ||
        //                   true    ||
        //                          true
        System.out.println(++aa > 18 || b++ < 10);  //The resulte is true

        //                  22 > 30 &&
        //                   false  &&
        //                         false
        System.out.println(b-- > 30 && aa++ <= 19);  //The resulte is false

        //                 30 > 19 && 19 < 22 || 31 < 30
        //                   true  &&    true ||   false
        //                         true       ||   false
        //                                   true
        System.out.println(c++ > aa && aa < b || c++ < 30);  //The resulte is true

        System.out.println("aa = " + aa);  //The aa is equals with 19 it is the last number
        System.out.println("b = " + b);   //The b is equals with 21
        System.out.println("c = " + c + "\n");  //The c is equals with 31 it is the last number
    }
}
