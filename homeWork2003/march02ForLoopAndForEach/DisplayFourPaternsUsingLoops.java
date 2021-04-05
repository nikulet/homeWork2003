package tekWillHomeWorks.homeWork2003.march02ForLoopAndForEach;

public class DisplayFourPaternsUsingLoops {
    /*
    2.  (Display four paterns using loops).Use nested loops that display the
    following patterns in four separate programs:

    Pattern  A            Pattern B               Pattern  C           Pattern   D
    1                     1  2  3  4  5  6                   1      1  2  3  4  5  6
    1  2                  1  2  3  4  5                   2  1         1  2  3  4  5
    1  2  3               1  2  3  4                   3  2  1            1  2  3  4
    1  2  3  4            1  2  3                   4  3  2  1               1  2  3
    1  2  3  4  5         1  2                   5  4  3  2  1                  1  2
    1  2  3  4  5  6      1                   6  5  4  3  2  1                     1
     */


    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            for (int j = 2; j <= 2; j++) {
                for (int k = 3; k <= 3; k++) {
                    for (int n = 4; n <= 4; n++) {
                        for (int l = 5; l <= 5; l++) {
                            for (int s = 6; s <= 6; s++) {
                                System.out.println("Pattern  A                Pattern  B               Pattern  C            Pattern  D    ");
                                System.out.println(i + "                         " + i + "  " + j + "  " + k + "  " + n + "  " + l + "  " + s + "                  " + i + "            " + i + "  " + j + "  " + k + "  " + n + "  " + l + "  " + s);
                                System.out.println(i + "  " + j + "                      " + i + "  " + j + "  " + k + "  " + n + "  " + l + "                  " + j + "  " + i + "               " + i + "  " + j + "  " + k + "  " + n + "  " + l);
                                System.out.println(i + "  " + j + "  " + k + "                   " + i + "  " + j + "  " + k + "  " + n + "                  " + k + "  " + j + "  " + i + "                  " + i + "  " + j + "  " + k + "  " + n);
                                System.out.println(i + "  " + j + "  " + k + "  " + n + "                " + i + "  " + j + "  " + k + "                  " + n + "  " + k + "  " + j + "  " + i + "                     " + i + "  " + j + "  " + k);
                                System.out.println(i + "  " + j + "  " + k + "  " + n + "  " + l + "             " + i + "  " + j + "                  " + l + "  " + n + "  " + k + "  " + j + "  " + i + "                        " + i + "  " + j);
                                System.out.println(i + "  " + j + "  " + k + "  " + n + "  " + l + "  " + s + "          " + i + "                  " + s + "  " + l + "  " + n + "  " + k + "  " + j + "  " + i + "                           " + i);
                            }
                        }
                    }
                }
            }
        }
    }
}