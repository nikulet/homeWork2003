package tekWillHomeWorks.homeWork2003.martie24ElseIfAndBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadsAnAnimalFromTheUserAndPrintsTheSoundItMakes {
    public static void main(String[] args) throws IOException {
        /*
4. Write a Java program that reads an animal from the user
and prints the sound it makes.
Test data
Input animal: Wolf
Expected Output :
Howl
Input animal: Sheep
Expected Output :
Baaaa
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write a type of animal: ");
        String animal = reader.readLine();


        if (animal.contains("Wolf") || animal.contains("wolf")) {
            System.out.println("Howl");
        } else if (animal.contains("Sheep") || animal.contains("sheep")) {
            System.out.println("Baaaa");
        } else if (animal.contains("Cow") || animal.contains("cow")) {
            System.out.println("Muuuuu");
        } else if (animal.contains("Cat") || animal.contains("cat")) {
            System.out.println("Meauuu");
        } else if (animal.contains("Dog") || animal.contains("dog")) {
            System.out.println("Hauuu");
        } else {
            System.out.println("This isn't a animal.");
        }


    }
}
