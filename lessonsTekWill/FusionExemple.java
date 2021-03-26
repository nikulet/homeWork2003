package lessonsTekWill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FusionExemple {
    public static void main(String[] args) throws IOException {
        System.out.println("Please ennter your name: ");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String name=reader.readLine(); //In this case is neceser to import IOException

        System.out.println("Hello "+name);

        System.out.println("How are you "+name+" ?");

        String answer=reader.readLine();
        if (answer.contains("fine"))
            System.out.println("Fine!It means you can continue with your Java lessons for a little bit longer.");
        else if (answer.contains("great"))
            System.out.println("Great! It means you can continue with your Java lessons for another month.");
        else if (answer.contains("bed"))
            System.out.println("Ouch!That's not good!You must replenish your batteries before continuing with his course.");
        else
            System.out.println("Oopsy daisy!I don't know how to react to this.");
    }
}
