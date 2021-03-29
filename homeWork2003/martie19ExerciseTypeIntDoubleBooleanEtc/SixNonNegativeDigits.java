package tekWillHomeWorks.homeWork2003.martie19ExerciseTypeIntDoubleBooleanEtc;

public class SixNonNegativeDigits {
    public static void main(String[] args) {
                /*
3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/
        int nrr = 123456;
        int ras = nrr / 100000;
        int ras1 = nrr / 10000;
        int ras2 = nrr / 1000;
        int ras3 = nrr / 100;
        int ras4 = nrr / 10;
        int ras5 = nrr / 1;
        System.out.println("\nThe raesult is: " + ras5 + "\n");
    }
}
