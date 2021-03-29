package tekWillHomeWorks.homeWork2003.martie19ExerciseTypeIntDoubleBooleanEtc;

public class DegreeInFahrenheit {
    public static void main(String[] args) {
        /*
        1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */

        short nr = 212;  //Declareded a varieibel and initializing with 212
        // float fl=nr;  //Initializing the value nr of type short to varieble fl od type floate

        float toCelsius = (((nr - 32) * 5) / 9);  //to calculate in Celcius

        System.out.println("        Exercise 1\n\n" + (float) nr + " degree Fahrenheit is equals to " + toCelsius + " in Celsius.\n");
    }
}
