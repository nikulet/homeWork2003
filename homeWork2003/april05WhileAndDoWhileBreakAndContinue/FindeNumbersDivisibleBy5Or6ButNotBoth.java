package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

public class FindeNumbersDivisibleBy5Or6ButNotBoth {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int t = 0;

        do {
            if (a % 5 == 0 || a % 6 == 0) {
                System.out.print(a + " ");
                t++;
            }
            if (t == 10) {
                System.out.println();
                t = 0;
            }
            a++;
        } while (a <= b);
    }
}
