package tekWillHomeWorks.homeWork2003.martie19ExerciseTypeIntDoubleBooleanEtc;

public class IncrimentedDectimentedOperations {
    public static void main(String[] args) {
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
        System.out.println("        Exercise 4\n\nThe resulte is: " + result + "\n");   //Resulte is 3
    }
}
