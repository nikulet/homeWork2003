package lessonsTekWill;

import java.util.Scanner;

public class GetInputFromUserWithScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Write a number type String ");
        String s=scanner.nextLine();


        System.out.println("Write a number type int ");
        int a=scanner.nextInt();


        System.out.println("Write a number type float");
        float b=scanner.nextFloat();

        System.out.print("You etntred string "+s+", ");
        System.out.print("You etntred integer "+a+", ");
        System.out.println("You entred float "+b);
    }
}
