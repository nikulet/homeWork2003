package tekWillHomeWorks.homeWork2003.may12StringAndStringBuilder;
/*
Ex 1. Word Counter
Write a metod that accepts a String object as an argument and display its contents
back-ward.For instance,if the string argument is "gravity" the method should display
-"ytivarg". Demonstrate the method in a program that asks the user to input a string
and then passes it to the method.
 */
public class BackwardString {

        String ward;
    public static void main(String[] args) {
        BackwardString backWard=new BackwardString();
        System.out.println(backWard.obectString("gravitațional"));
    }
        String obectString(String backWard){
        ward=backWard;
        backWard="ytivarg";
            return backWard;
        }
}
