package tekWillHomeWorks.homeWork2003.march02ForLoopAndForEach;

import java.util.Scanner;

public class BarChartPrintingProgram {
    /*
    1.  (Bar Chart Printing Program)
    One interesting appication of computers is to display graphs and bar charts.
    Write an application that reads five numbers between 1 and 30.
    For each number that's read,your program should display the same numbers of adjacent asterisks.
    For example,if your program reads the number 7, it should display *******.
    Display the bars of asterisks after you read all five numbers.

     O aplicație interesantă a computerelor este afișarea de grafice și diagrame.
     Scrieți o aplicație care citește cinci numere între 1 și 30.
     Pentru fiecare număr citit, programul dvs. ar trebui să afișeze aceleași numere de asteriscuri adiacente.
     De exemplu, dacă programul dvs. citește numărul 7, acesta ar trebui să afișeze ************.
     Afișați barele asteriscurilor după ce ați citit toate cele cinci numere.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameNumbers = {"first", "second", "third", "fourth", "fifth"};
        String[] asterisks = {"*", "**", "***", "****", "*****", "******", "*******", "********", "*********", "**********",
                "***********", "************", "*************", "**************", "***************", "****************", "*****************", "******************", "******************", "******************",
                "*******************", "********************", "*********************", "**********************", "***********************", "************************", "*************************",
                "**************************", "***************************", "****************************"};

        //  Metoda  1

        for (int i = 0; i <= 4; i++) {
            System.out.print("Please, enter a " + nameNumbers[i] + " number between 1 and 30 : ");
            int number = scanner.nextInt();
            for (; number > 30 || number <= 0; ) {
                System.out.println("\nPlease,enter a corect number between 1 and 30: ");
                int numb = scanner.nextInt();
                number = numb;
            }
            System.out.println(asterisks[number - 1]);
        }
        System.out.println("Finish");

//*****************************************************************************

        //  Metod  2

//        for (int i = 0 ;i <=4; i++) {
//            System.out.print("Please, enter a " + nameNumbers[i] + " number between 1 and 30 : ");
//            int number = scanner.nextInt();
//for (;number>30||number<=0;){
//    System.out.println("\nPlease,enter a corect number between 1 and 30: ");
//    int numb=scanner.nextInt();
//    number=numb;
//}
//            if (number==1){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==2){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==3){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==4){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==5){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==6){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==7){
//                System.out.println(asterisks[number -1]);
//            }else if (number==8){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==9){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==10){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==11){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==12){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==13){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==14){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==15){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==16){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==17){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==18){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==19){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==20){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==21){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==22){
//                System.out.println(asterisks[number -1]);
//            }else if (number==23){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==24){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==25){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==26){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==27){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==28){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==29){
//                System.out.println(asterisks[number -1]);
//            }
//            else if (number==30){
//                System.out.println(asterisks[number -1]);
//            }
//        }
//        System.out.println("Finish.");
    }
}

