package tekWillHomeWorks.homeWork2003.april02ForLoopAndForEach;

public class SumASeries {
    /*
    3. (Sum a series)Write a program to sum the following series:
     */
    public static void main(String[] args) {
        int sum = 0;
        for (byte i = 1; i <= 97; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "     ");
                sum += i;
            }
        }
        System.out.print("   " + sum + "\n");
        for (byte k = 0; k < 5; k++) {
            System.out.print("-  +  ");
        }
        for (byte l = 0; l < 43; l++) {
            System.out.print("--  +  ");
        }
        System.out.println("--    =   ----  ;");
        int sum1 = 0;
        for (byte j = 3; j <= 99; j++) {
            if (j % 2 == 1) {
                System.out.print(j + "     ");
                sum1 += j;
            }
        }
        System.out.print("  " + sum1);
    }
}

