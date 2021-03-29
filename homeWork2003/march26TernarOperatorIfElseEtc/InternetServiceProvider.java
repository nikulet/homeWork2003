package tekWillHomeWorks.homeWork2003.march26TernarOperatorIfElseEtc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InternetServiceProvider {
    /*
    13.Internet Service Provider
    An Internete service provider has three different subscription package for its custoamers:
    Package A:  For $9.95 per month 10 hours of access are provided.Additional hours are $2.00 per hour
    Package B:  For $13.95 per month 20 hours of access are provided.Additional hours are $1.00 per hour
    Package C:  For $19.95 per month unlimited access is provided.

    Write a program that calculate a customer's monthly bill.It should ask the user to enter the letter of the package the customer
    has purchased(A,B, or C) and the number of hours that were used.
    It should then display the total charges.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Package A:  For $9.95 per month 10 hours of access are provided.Additional hours are $2.00 per hour");
        System.out.println("Package B:  For $13.95 per month 20 hours of access are provided.Additional hours are $1.00 per hour");
        System.out.println("Package C:  For $19.95 per month unlimited access is provided.\n");

        System.out.println("Please, enter a letter that you would like to purchase(A,B, or C): ");
        String letter = reader.readLine();
        float mothlyBilll;
        /*
        Write a program that calculate a customer's monthly bill.It should ask the user to enter the letter of the package the customer
    has purchased(A,B, or C) and the number of hours that were used.
    It should then display the total charges.
         */

        if (letter.toLowerCase().equals("a")) {

            System.out.println("Please enter a number of hours that were used: ");
            float numbersOfHoursUsed = Float.parseFloat(reader.readLine());
            if (numbersOfHoursUsed <= 10f) {
                System.out.println(numbersOfHoursUsed + " hours of access are provided for $9.95 per month");
            }
            if (numbersOfHoursUsed > 10f) {
                mothlyBilll = 9.95f + 2f * (numbersOfHoursUsed - 10f);
                System.out.println(mothlyBilll);
            }
        } else if (letter.toLowerCase().equals("b")) {
            System.out.println("Please enter a number of hours that were used: ");
            float numbersOfHoursUsed = Float.parseFloat(reader.readLine());
            if (numbersOfHoursUsed <= 20f) {
                System.out.println(numbersOfHoursUsed + " hours of access are provided for $13.95 per month");
            }
            if (numbersOfHoursUsed > 20f) {
                mothlyBilll = 13.95f + (numbersOfHoursUsed - 20f);
                System.out.println(mothlyBilll);
            }
        } else if (letter.toLowerCase().equals("c")) {
            System.out.println("The package is for $19.95 per month unlimited access is provided.");
        }

    }
}
