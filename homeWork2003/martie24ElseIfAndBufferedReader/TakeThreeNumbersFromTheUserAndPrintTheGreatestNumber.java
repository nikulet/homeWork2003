package homeWork2003.martie24ElseIfAndBufferedReader;

import lessonsTekWill.BuffereddReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeThreeNumbersFromTheUserAndPrintTheGreatestNumber {
    public static void main(String[] args) throws IOException {
        /*
2. Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
         */
        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your first number: ");
        int nr1 = Integer.parseInt(reder.readLine());  //to import a Exception for number integers and zecimals

        System.out.println("Enter your second number: ");
        int nr2 = Integer.parseInt(reder.readLine());

        System.out.println("Enter your third number: ");
        int nr3 = Integer.parseInt(reder.readLine());

        System.out.println("Input the 1st number: " + nr1);
        System.out.println("Input the 2nd number: " + nr2);
        System.out.println("Input the 3rd number: " + nr3);

        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("The greatest " + nr1);
        } else if (nr2 > nr1 && nr2 > nr3) {
            System.out.println("The greatest " + nr2);
        } else if (nr3 > nr1 && nr3 > nr2) {
            System.out.println("The greatest " + nr3);
        } else {
            System.out.println("Erroare");
        }


    }
}
