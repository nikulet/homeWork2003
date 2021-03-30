package tekWillHomeWorks.homeWork2003.march29Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleAritmeticCalculatorWithSwitch {
    /*
3. Write a Java program which represent a simple arithmetic calculator.
User will enter 3 parameters, the operator, the first number and the second number.
Test Data
Input data:
operator: '+'
first number: 20
second number: 30
Expected output:
20 + 30 = 50
Another example -
operator: '/'
first number: 18
second number: 3
Expected output:
18 / 3 = 6;
Use a switch statement for this exercise and limit yourself to +, -, *, / operations
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please,enter your first number: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Please,enter your second number: ");
        double secondNumber = Double.parseDouble(reader.readLine());
        System.out.println("Please,enter what operation do you have to execut(+,-,*,or /): ");
        String operator = reader.readLine();
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("\n" + firstNumber + operator + secondNumber + "=" + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("\n" + firstNumber + operator + secondNumber + "=" + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("\n" + firstNumber + operator + secondNumber + "=" + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("\n" + firstNumber + operator + secondNumber + "=" + result);
                break;
            default:
                System.out.println("Attention!!!You operator or number is not corect");
        }

    }
}
