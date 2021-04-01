package tekWillHomeWorks.homeWork2003.march31ForLOOP;

import java.util.Scanner;

public class DistanceTraveledWithVehicle {
    public static void main(String[] args) {
        /*
  The distance a vehicle travels can be calculatd as follows:
  Distance=Speed * Time
  For example,if a train travels 40 miles-per-hour for three hours,the distance
  traveled is 120 miles. Write a program that asks for the speed of a vehicle
  (in miles-per-hour) and the number of hours it has traveled.It should use a loop to display
  the distance a vehicle has traveled for each hour of a time period specified by the user.
  For example,if a vehicle is traveling at 40 mph for a three-hour time period,it should display
  aireport similar to the one that follows:
  Hour            Distance Traveled
  ----------------------------------
  1                   40
  2                   80
  3                   120
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the speed of a vehicle: ");
        int speedVehicle = scanner.nextInt();
        System.out.print("Enter the number of hours it has traveled: ");
        int numberOfHours = scanner.nextInt();
        System.out.println("\nHour              Distance Traveled");
        System.out.println("-----------------------------------");
        for (int i = 1; i <= numberOfHours; i++) {
            System.out.println(" " + i + "                      " + speedVehicle * i);
        }
    }
}
