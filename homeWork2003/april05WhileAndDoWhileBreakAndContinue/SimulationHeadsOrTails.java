package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

public class SimulationHeadsOrTails {
    /*
    6.  (Simulation: heads or tails) Write a program that simulates flipping a coin one million
     times and displays the number of heads and tails.
     */
    public static void main(String[] args) {
        int l = 0;
        int w = 0;
        for (int i = 0; i < 1000000; i++) {
            int value = (int) (Math.random() * 2);
            if (value == 0)
                l++;
            else w++;
        }
        System.out.println("Flipping a coin one million times\nHeads: " + l + "\tTails: " + w);
    }
}
