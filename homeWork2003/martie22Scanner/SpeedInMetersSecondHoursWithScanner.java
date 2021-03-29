package tekWillHomeWorks.homeWork2003.martie22Scanner;

import java.util.Scanner;

public class SpeedInMetersSecondHoursWithScanner {
    public static void main(String[] args) {

/* 2.Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
 hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
 (hint: 1 mile = 1609 meters).
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 */

        double speedMetersPerSeconds, speedKilometersPerHour, speedMilesPerHour;
        // mile = 1609;
        Scanner scanner = new Scanner(System.in);
        System.out.println("        Exercise 2\n\nWrite a number of meters: ");
        int meters = scanner.nextInt();
        System.out.println("Write a number of hours: ");
        int hour = scanner.nextInt();
        System.out.println("Write a number of minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Write a number of seconds: ");
        int seconds = scanner.nextInt();

        speedMetersPerSeconds = meters / (((hour * 3600.0) + (minutes * 60)) + seconds);    //meters%seconds/meters;
        speedKilometersPerHour = ((meters / 1000.0F) / (hour + (minutes / 60.0) + (seconds / 3600.0)));
        speedMilesPerHour = ((meters / 1609.0F) / (hour + (minutes / 60.0F) + (seconds / 3600.0F)));
        System.out.println("Your speed in meters/second is: " + speedMetersPerSeconds + "\nYour speed in km/h is: " + speedKilometersPerHour +
                "\nYour speed in miles/h is: " + speedMilesPerHour + "\n");
    }
}
