package tekWillHomeWorks.homeWork2003.march26TernarOperatorIfElseEtc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSpeedOfSound {
    public static void main(String[] args) throws IOException {
        /*
        12.The speed of Sound
        The following table shows the approximate speed of sound in air,water,and steel:
        Medium             Speed
          Air           1,100 feet per second
          Water         4,900 feet per second
          Steel         16,400 feet per second

        Write a program that asks the user to enter "air", "water", or "steel",
        and the distance that a sound have will travel in the medium.The program
        should then display the amount of time it will take.

        You can calculate the amount of time it takes sound to travel in air with
        the following formula:
        Time=Distance/1,100

        You can calculate the amount of time it takes sound to travel in water with
        the following formula:
        Time=Distance/4,900

        You can calculate the amount of time it takes sound to travel in steel with
        the following formula:
        Time=Distance/16,400
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter  a word from tham \"air\", \"water\", or \"steel\": ");
        String word = reader.readLine();

        System.out.println("Please, enter  a distance of sound: ");
        double distanceSound = Double.parseDouble(reader.readLine());

        double amountOfTimeAir = distanceSound / 1100d;
        double amountOfTimeWater = distanceSound / 4900d;
        double amountOfTimeSteel = distanceSound / 16400d;

        if (word.toLowerCase().contains("air")) {
            System.out.println("The amount of time for travel in the medium it will take " + amountOfTimeAir);
        } else if (word.toLowerCase().contains("water")) {
            System.out.println("The amount of time for travel in the medium it will take " + amountOfTimeWater);
        } else if (word.toLowerCase().contains("steel")) {
            System.out.println("The amount of time for travel in the medium it will take " + amountOfTimeSteel);
        } else {
            System.out.println("Woring! This word \"" + word + "\" isn't corect.");
        }

    }
}
