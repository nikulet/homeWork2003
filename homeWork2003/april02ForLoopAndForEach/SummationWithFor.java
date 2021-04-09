package tekWillHomeWorks.homeWork2003.april02ForLoopAndForEach;

public class SummationWithFor {
    /*
      4.  (Summation) Write a program to compute the following summation.
       */
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("   1     ");
        for (int i = 1; i < 624; i++) {
            System.out.print("         1       ");
            sum = i + 1;
        }
        System.out.print("         =  " + sum);
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print("-------    +    ");
        }
                 //programul ceva nu ruleaza corect

        for (int i = 10; i <= 624; i++) {
            System.out.print("-------    +    ");
        }

        System.out.print("  ---------------     =   --------------\n");
        int sum2 = 0;
        for (int j = 1; j <= 624; ) {
            System.out.print("  \u221A" + j + "+\u221A" + ++j + "        ");
            sum2 += j;
        }
        System.out.print("\n        " + sum + "\n");
        System.out.print(" =   ---------\n");
        System.out.print("       " + sum2);
    }
}
