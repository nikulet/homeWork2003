package lessonsTekWill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BuffereddReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Write a string: ");
        String newLine = reader.readLine();  //In this case is neceser to import IOException

//        System.out.println("Enter a number: ");
//        int myIntegerr=Integer.parseInt(newLine);


        System.out.println("Write a words: ");
        char[] buffer = new char[20];
        reader.read(buffer, 0, buffer.length);


        System.out.println("Enter a number: ");
        int myInteger = Integer.parseInt(reader.readLine());


        System.out.println("New line is " + newLine);
        // System.out.println(myIntegerr);
        System.out.println("First 20 characters of new line is: " + Arrays.toString(buffer));
        System.out.println("My integer with bufferedReader is: " + myInteger);

    }
}
