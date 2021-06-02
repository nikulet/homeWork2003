package tekWillHomeWorks.homeWork2003.may12StringAndStringBuilder;
/*
Ex2.  Word Counter
Write a method that accepts a String object as an arguments and returns the
number of words it contains.For instance,if the argument is "Four score and
seven years ago" the method should return the number 6.
Demonstrate the method in a program that asks the user to input a string and
then passes it to the method. The number of words in the string should he
displayed on the screen.
 */
public class WordCounter {
    public static void main(String[] args) {
        int sum = 0;
        WordCounter wordCounter = new WordCounter();
        String sentances = wordCounter.WordCounter("Astazi este o zi frumoasa si foarte calduroasa.");
        System.out.println(sentances);
        for (int i = 0, j = sentances.length(); i < j; i++) {
            if (sentances.charAt(i) == ' ') {
                sum += 1;
            }
        }
        System.out.print("The sum of sentences is: " + sum);
    }

    String WordCounter(String sentance) {
        return sentance;
    }
}
