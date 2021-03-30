package tekWillHomeWorks.homeWork2003.march29Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalOfDaysInMonthWithSwitch {
    /*
    Write a program to input month number and print total number of days in month
    using switch...case.  program to find total number of days in a month using switch...case.
    Logic to print number of days in a month using switch...case  in progrsmming.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please,enter a month number: ");
        short numberMonth=Short.parseShort(reader.readLine());

        switch (numberMonth){
            case 1:
                System.out.println("Total number of days in the month January are of 31");
                break;
            case 2:
                System.out.println("Total number of days in month February are of 29");
                break;
            case 3:
                System.out.println("Total number of days in month March are of 31");
                break;
            case 4:
                System.out.println("Total number of days in month April are of 30");
                break;
            case 5:
                System.out.println("Total number of days in month May are of 31");
                break;
            case 6:
                System.out.println("Total number of days in month June are of 30");
                break;
            case 7:
                System.out.println("Total number of days in month July are of 31");
                break;
            case 8:
                System.out.println("Total number of days in month August are of 31 ");
                break;
            case 9:
                System.out.println("Total number of days in month September are of 30");
                break;
            case 10:
                System.out.println("Total number of days in month October are of 31");
                break;
            case 11:
                System.out.println("Total number of days in month November are of 30");
                break;
            case 12:
                System.out.println("Total number of days in month December are of 31");
                break;
            default:
                System.out.println("Attention!!!The number \""+numberMonth+"\" is not a number of month.");
        }
    }
}
