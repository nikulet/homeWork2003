package tekWillHomeWorks.homeWork2003.may12StringAndStringBuilder;

import java.util.Scanner;

/*
Ex. 4  Vowels and Consonants
Write a class with a constructor that accepts a String object as its argument.
The class should have a method that returns the number of vowels in the string,
and another method that returns the number of consonats in the string.
Demonstrate the class in a program that performs the following steps:
1. The user is asked to enter a string.
2. The program displays the following menu:
a. Count the number of vowels in the string.
b. Count the number of consonats in the string
c. Count both the vowels and consonants in the string.
d. Enter another string.
e. Exit the program.
3. The program performs the operation selected by the user and repeats until the user
select e, to exit the program.
//****************************************************************
Scrieți o clasă cu un constructor care acceptă un obiect String ca argument.
Clasa ar trebui să aibă o metodă care returnează numărul de vocale din șir,
și o altă metodă care returnează numărul de consoane din șir.
Demonstrați clasa într-un program care efectuează următorii pași:
1. Utilizatorul este rugat să introducă un șir.
2. Programul afișează următorul meniu:
A. Numărați numărul de vocale din șir.
b. Numărați numărul de consoane din șir
c. Numărați atât vocalele, cât și consoanele din șir.
d. Introduceți un alt șir.
e. Ieșiți din program.
3. Programul efectuează operația selectată de utilizator și se repetă până când utilizatorul
selectați e, pentru a ieși din program.
 */
public class VowelsAndConstants {
    public static void main(String[] args) {
        int sum = 0;
        boolean fr = true;
        Scanner scanner = new Scanner(System.in);
        while (fr) {
            System.out.print("Write a sinteces: ");
            String userWords = scanner.nextLine();
            if (userWords.equals("e") || userWords.equals("E")) {
                fr = false;
                break;
            }
            VowelsAndConstants words = new VowelsAndConstants(userWords);
            System.out.println("Count the number of vowels in the string is: " + words.methodVolwos(userWords));
            System.out.println("Count the number of consonats in the string is: " + words.methodConsoane(userWords));
        }
    }

    VowelsAndConstants(String gf) {
    }

    int sum = 0;

    int methodVolwos(String word) {
        for (int i = 0; i < word.length(); i++) {
            char litera = word.charAt(i);
            if (litera == 'a' || litera == 'A' || litera == 'o' || litera == 'O' || litera == 'e' || litera == 'E' || litera == 'i' || litera == 'I' || litera == 'u' || litera == 'U') {
                sum += 1;
            }
        }
        return sum;
    }

    int sums = 0;

    int methodConsoane(String newWord) {
        for (int i = 0; i < newWord.length(); i++) {
            char literas = newWord.charAt(i);
            if (!(literas == 'a' || literas == 'A' || literas == 'o' || literas == 'O' || literas == 'e' || literas == 'E' || literas == 'i' || literas == 'I'
                    || literas == 'u' || literas == 'U' || literas == '?' || literas == '.' || literas == '!' || literas == ',' || literas == '&' || literas == '*' || literas == '&' || literas == '%' || literas == '$'
                    || literas == '#' || literas == '@' || literas == '^' || literas == '(' || literas == ')' || literas == '[' || literas == ']' || literas == ';' || literas == '\'' || literas == ',' || literas == '_' || literas == '+'
                    || literas == '-' || literas == ':' || literas == '>' || literas == '<' || literas == '\"' || literas == '=' || literas == ' ')) {
                sums += 1;
            }
        }
        return sums;
    }
}

