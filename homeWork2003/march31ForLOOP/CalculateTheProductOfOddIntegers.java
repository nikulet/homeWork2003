package tekWillHomeWorks.homeWork2003.march31ForLOOP;

public class CalculateTheProductOfOddIntegers {
    public static void main(String[] args) {
        /*
1.  Write an application that calcultes the product of the odd integers from 1 to 15.
         */
        long produsIntegersNumbers = 1L;
        for (long calculatingTheproduct = 1; calculatingTheproduct <= 15; calculatingTheproduct++) {
            produsIntegersNumbers = produsIntegersNumbers * calculatingTheproduct;
        }
        System.out.println("The product of the odd integers from 1 to 15 is " + produsIntegersNumbers);
    }
}
