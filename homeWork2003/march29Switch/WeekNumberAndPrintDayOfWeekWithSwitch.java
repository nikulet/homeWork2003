package tekWillHomeWorks.homeWork2003.march29Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekNumberAndPrintDayOfWeekWithSwitch {
    /*
    Write program to input week number(1-7) and print day week name using switch case.
    Program to find week day name using switch case.How to find day name of week using switch case in programming.
    Example:
    Input
    Input week number(1-7):  2
    Output
    Tuesday
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please,enter a number of week(1-7): ");
        short weekNumber = Short.parseShort(reader.readLine());

        switch (weekNumber) {
            case 1:
                System.out.println(" is Monday");
                break;
            case 2:
                System.out.println(" is Tuesday");
                break;
            case 3:
                System.out.println(" is Wednesday");
                break;
            case 4:
                System.out.println(" is Thursday");
                break;
            case 5:
                System.out.println(" is Friday");
                break;
            case 6:
                System.out.println(" is Saturday");
                break;
            case 7:
                System.out.println(" is Sunday");
                break;
            default:
                System.out.println("Attention!!!The number " + weekNumber + " is not a week day.");
        }

    }
}
