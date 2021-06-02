package tekWillHomeWorks.homeWork2003.may12StringAndStringBuilder;

import java.util.Scanner;

/*
Ex  3   Sentance Capitalizer
Write a method that accepts a String object as an argument and returns a copy of
the string with the first character of each senence capitalized.For instance,if the
argument is "Hello.My  name is Joe.What is your name?" Demonstrate the method in a
program that asks the user to input a string and then passes it to the method.
The modified string should be displayed on the screen.
//********************************************************************
Scrieți o metodă care acceptă un obiect String ca argument și returnează o copie a
șirul cu primul caracter al fiecărei senențe cu majusculă. De exemplu, dacă
argumentul este "Bună ziua. Numele meu este Joe. Care este numele tău?" Demonstrați metoda într-un
program care cere utilizatorului să introducă un șir și apoi îl transmite metodei.
Șirul modificat trebuie afișat pe ecran.
 */
public class SentenceCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sent = scanner.nextLine();  //user info
        SentenceCapitalizer ss = new SentenceCapitalizer();
        System.out.print(ss.methodString(sent));

    }

    String methodString(String newsentenceCapitalizer) {
        String lower = newsentenceCapitalizer.toLowerCase();
        System.out.print(lower.toUpperCase().charAt(0));
        for (int i = 1, j = i + 1; i < lower.length(); i++, j++) {
            if (lower.charAt(i) == '.' || lower.charAt(i) == '?' || lower.charAt(i) == '!') {
                //
                // char gg=lower;
                //  System.out.print(lower.toUpperCase().charAt(gg+1));
            }
        }
        return newsentenceCapitalizer;
    }
}