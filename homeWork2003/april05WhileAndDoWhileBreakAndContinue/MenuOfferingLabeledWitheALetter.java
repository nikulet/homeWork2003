package tekWillHomeWorks.homeWork2003.april05WhileAndDoWhileBreakAndContinue;

import java.util.Scanner;

public class
MenuOfferingLabeledWitheALetter {
    public static void main(String[] args) {
        /*Write a precursor to a menu-driven program.
        The program should display a menu offering four choices,each labeled with a letter.
        If the user responds with a letter other than one the four valid choices,the program
        should prompt the user to enter a valid response until the user complies.
        Then the program should use a switch to select a simple action based on the user's
        selectio. A program run could look something like this:
        Please enter one of the following choices:
        c)carnivore         p)pianist
        t)tree              g)game
        f
        Please enter a c,p,t or g: q
        Please enter a c,p,t or g: t
        A maple is a tree.
         */
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter a c,p,t or g: ");
//        System.out.println("c)carnivore         p)pianist\n" +
//                "t)tree              g)game");
//        String letter=scanner.nextLine();
        boolean leter = false;
        while (!false) {
            letter();
            System.out.println("Please enter a c,p,t or g: ");
            String letters = scanner.nextLine();
            if (letters.equals("c") || letters.equals("p") ||
                    letters.equals("t") || letters.equals("g"))
                leter = true;

        }
    }



    static  void letter(){
        System.out.println("c)carnivore         p)pianist\n" +
                "t)tree              g)game");
    }




static void  executeOption(){
//        switch () {
//            case "c":
//                System.out.println("Tinger is a animal carnivore.");
//                break;
//            case "t":
//                System.out.println("A maple is a tree.");
//                break;
//            case "p":
//                System.out.println("Alfred Brendel is a pianist.");
//                break;
//            case "g":
//                System.out.println("Contra Straik is a game.");
//                break;
//        }
        }
    }
