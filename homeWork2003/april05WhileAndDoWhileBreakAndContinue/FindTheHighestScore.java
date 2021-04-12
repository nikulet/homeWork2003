package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

import java.util.Scanner;

public class FindTheHighestScore {
    /*
    3.  (Find the highest score) Write a program that prompts the user to enter the number of
    students and each student's name and score, and finally display the name of the student
    with the highest score.

    3. (Găsiți cel mai mare scor) Scrieți un program care îi solicită utilizatorului să introducă numărul de
     studenților și numele și scorul fiecărui elev și, în cele din urmă, afișează numele studentului
     cu cel mai mare scor.
     */
    public static void main(String[] args) {

        //Enter the number of students
        System.out.print("\nEnter the numbers of students: ");
        Scanner in = new Scanner(System.in);
        int nbrStudents = in.nextInt();

        //Enter the each name and score for all students
        int i = 1;
        int highestScore = 0;
        String nameHighestScore = "";

        do {
            in.nextLine();
            System.out.print("\nEnter the name of student: ");
            String name = in.nextLine();
            System.out.print("Enter the score: ");
            int score = in.nextInt();

            if (score > highestScore) {
                highestScore = score;
                nameHighestScore = name;
            }
            i++;
        } while (i <= nbrStudents);

        System.out.println("\nThe student with highest score is: " + nameHighestScore + "\tgrade " + highestScore);
    }
}
