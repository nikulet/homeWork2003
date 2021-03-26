package lessonsTekWill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestWithBufferdReader {
    public static void main(String[] args) throws IOException //The word trows IOException is obligate to write here
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));  //Initializing a BufferedReader with calling a import java.io.BufferedReader

        String name=reader.readLine();  //Created a vareble of type String and this string is introdusing of user

        System.out.println(name);  //outputs
    }
}
