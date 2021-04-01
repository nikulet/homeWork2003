package tekWillHomeWorks.homeWork2003.march31ForLOOP;

public class CalculateTheProductOfOddIntegers {
    public static void main(String[] args) {
        /*
1.  Write an application that calcultes the product of the odd integers from 1 to 15.
         */
        for (int calculatingTheproduct = 1; calculatingTheproduct <= 15; calculatingTheproduct++) {
            if (calculatingTheproduct % 2 == 1) {
                System.out.println(calculatingTheproduct);
            }
        }
    }
}
