package tekWillHomeWorks.homeWork2003.may12StringAndStringBuilder;

import java.util.Scanner;

/*
Imagine you are developing a software package for Amazon.com that requires users to
enter their own passwords.Your software requires that users passwords meet the following criteria:
a) The password should be at least six characters long.
b) The password should contain at least one uppercase and at least one lowecase letter.
c) The password should have at least one digit.

Write a class that verifies that a password meets the stated criteria.
Demonstrate the class in a program that allows the user to enter a password and then displays a
message indicating whether it is valid or not.
//***************************************
Imaginați-vă că dezvoltați un pachet software pentru Amazon.com care necesită utilizatorii
introduceți propriile parole. Software-ul dvs. necesită ca parolele utilizatorilor să îndeplinească următoarele criterii:
a) Parola trebuie să aibă cel puțin șase caractere.
b) Parola trebuie să conțină cel puțin o literă mare și cel puțin o literă mică.
c) Parola trebuie să aibă cel puțin o cifră.

Scrieți o clasă care verifică dacă o parolă îndeplinește criteriile stabilite.
Demonstrați clasa într-un program care permite utilizatorului să introducă o parolă și apoi afișează un
mesaj care indică dacă este valid sau nu.
 */
public class PasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        PasswordVerifier pas = new PasswordVerifier();


    }
}
