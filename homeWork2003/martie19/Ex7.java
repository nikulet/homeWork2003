package homeWork2003.martie19;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
7. Create a class named DeclareDatatype.
In this class, declare a variable named 'intValue' of data type int that is assigned value 50. Secondly, declare a variable named 'doubleValue' of data type double that is assigned the value of 30.2.
Create a third variable, named 'sumOfIntAndDouble' which is the sum of the intValue variable and doubleValue variable.
What would be the data type of sumOfIntAndDouble? Add a comment to explain why is this happening.
 */

        Scanner scanner=new Scanner(System.in);

        System.out.println("        Exercitiul 7\nIntroduceti un numar intreg: ");
        int intValue=scanner.nextInt();
        System.out.println("Introduceti un numar cu zecimi: ");
        double doubleValue=scanner.nextDouble();
        double sumOfIntAndDouble;  //The sum of type int and double is double, becose ve value double contening 64biti
        //and isn't posibil atribuieted to type int 8 biti

        sumOfIntAndDouble=intValue+doubleValue;  //50+30.2=80.2
        System.out.println("\nSum intValue+doubleValue is "+sumOfIntAndDouble);  //Outputs: 80.2



    }
}
