package tekWillHomeWorks.homeWork2003.martie19ExerciseTypeIntDoubleBooleanEtc;

public class AllExercise {
    public static void main(String[] args) {
        System.out.println("*************************************************************\n");

        /*
        1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */

        short nr = 212;  //Declareded a varieibel and initializing with 212
        // float fl=nr;  //Initializing the value nr of type short to varieble fl od type floate

        float toCelsius = (((nr - 32) * 5) / 9);  //to calculate in Celcius

        System.out.println("        Exercitiul 1\n\n" + (float) nr + " degree Fahrenheit is equals to " + toCelsius + " in Celsius.\n");

        System.out.println("*************************************************************\n");



/* 2.Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
 hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
 (hint: 1 mile = 1609 meters).
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 */
        // 1h=3600scunde

        double speedMetersPerSeconds, speedKilometersPerHour, speedMilesPerHour;
        double mile = 1.609D;
        double meters = 2500D;
        byte hour = 5;
        byte minutes = 56;
        byte seconds = 23;

        speedMetersPerSeconds = meters % seconds / seconds;    //meters%seconds/meters;
        speedKilometersPerHour = meters % hour / hour;
        speedMilesPerHour = meters * mile / hour;
        System.out.println("        Exercitiul 2\n\nYour speed in meters/second is: " + speedMetersPerSeconds + "\nYour speed in km/h is: " + speedKilometersPerHour +
                "\nYour speed in miles/h is: " + speedMilesPerHour + "\n");


        System.out.println("*************************************************************\n");




        /*
3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/

        int nrr = 123456;
        int ras = nrr / nrr % nrr;
        int ras1 = nrr / nrr + 1 % nrr;
        int ras2 = nrr / nrr + 2 % nrr;
        int ras3 = nrr / nrr + 3 % nrr;
        int ras4 = nrr / nrr + 4 % nrr;
        int ras5 = nrr / nrr + 5 % nrr;

        System.out.println("        Exercitiul 3\n\nRaspunsul: " + ras + " " + ras1 + " " + ras2 + " " + ras3 + " " + ras4 + " " + ras5 + "\n");

        System.out.println("*************************************************************\n");



/*
4. What's the result of given expression?
int a = 7;
int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
What's the result of a after evaluating the expression?
Aici încercați să rezolvați singuri, și la tema pentru acasă să scrieți cum ați ajuns la rezultat,
 cum am făcut și la lecție.
 */

        int a = 7;
        //             8  -  7 +  7  +   9  - 9  -   7  - 7  +   9
        //                1    +  7  +   9  - 9  -   7  - 7  +   9
        //                       8   +   9  - 9  -   7  - 7  +   9
        //                              17  - 9  -   7  - 7  +   9
        //                                    8  -   7  - 7  +   9
        //                                           1  - 7  +   9
        //                                               -6  +   9
        //                                                    3
        int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
        System.out.println("        Exercitiul 4\n\nThe resulte is: " + result + "\n");   //Resulte is 3

        System.out.println("*************************************************************\n");



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

        int aa = 18;
        int b = 22;
        int c = 30;
        System.out.println("        Exercitiul 5\n\n");
        //                  19 > 18  ||  22 < 10
        //                   true    ||   false
        //                          true
        System.out.println(++aa > 18 || b++ < 10);  //The resulte is true

        //                  23 > 30 &&  19  <= 19
        //                   false  &&     true
        //                         false
        System.out.println(b-- > 30 && aa++ <= 19);  //The resulte is false

        //                 30 > 20 && 20 < 22 || 31 < 30
        //                   true  &&    true ||   false
        //                   true  &&        true
        //                         true
        System.out.println(c++ > aa && aa < b || c++ < 30);  //The resulte is true

        System.out.println("aa = " + aa);  //The aa is equals with 19 it is the last number
        System.out.println("b = " + b);   //The b is equals with 23  worning
        System.out.println("c = " + c + "\n");  //The c is equals with 31 it is the last number

        System.out.println("*************************************************************\n");



/*
6. Re-write the following example, with shorter operators. Before running the program, in the comments,
 try to write the value. Then verify at the end if you've followed correctly all the calculations.
 */


        System.out.println("        Exercitiul 6\n\n");
        int resultt = 1 + 2;    //resultt is 1+2= 3
        System.out.println(resultt);

        resultt = resultt - 1;  //resultt is 3-1=2
        System.out.println(resultt);

        resultt = resultt * 2;  //resultt is 2*2= 4
        System.out.println(resultt);

        resultt = resultt / 2;  //resultt is 4/2=2
        System.out.println(resultt);

        resultt = resultt + 8;  //resultt is 2+8=10
        resultt = resultt % 7;  //resultt is 10%7=3
        System.out.println(resultt + "\n");  //resultt is 3

        System.out.println("*************************************************************\n");

/*
7. Create a class named DeclareDatatype.
In this class, declare a variable named 'intValue' of data type int that is assigned value 50. Secondly, declare a variable named 'doubleValue' of data type double that is assigned the value of 30.2.
Create a third variable, named 'sumOfIntAndDouble' which is the sum of the intValue variable and doubleValue variable.
What would be the data type of sumOfIntAndDouble? Add a comment to explain why is this happening.
 */

        int intValue = 50;
        double doubleValue = 30.2;
        double sumOfIntAndDouble;  //The sum of type int and double is double, becose ve value double contening 64biti
        //and isn't posibil atribuieted to type int 8 biti

        sumOfIntAndDouble = intValue + doubleValue;  //50+30.2=80.2
        System.out.println("        Exercitiul 7\n\nSum intValue+doubleValue is " + sumOfIntAndDouble + "\n");  //Outputs: 80.2

        System.out.println("*************************************************************\n");


    }
}


