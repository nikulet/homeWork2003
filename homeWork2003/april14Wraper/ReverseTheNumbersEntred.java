package tekWillHomeWorks.homeWork2003.april14Wraper;

public class ReverseTheNumbersEntred {
    public static void main(String[] args) {
        /*
        1.  (Revers the numbers entred) Write a program that reads ten integers and displays them in the
        revers of the order in which they were read.
         */
        int[] numbers = {32, 45, 53, 24, 53, 123, 534, 534, 3253, 453, 323, 543, 3254, 4535, 453, 566};
        int[] nr = new int[numbers.length];
        System.out.println("The revers of the order in which they were read is: ");
        for (int i = 0,index=numbers.length-1; i<numbers.length ; i++,index--) {
                System.out.print((nr[i] = numbers[index]) + " ");
            }
        }
    }