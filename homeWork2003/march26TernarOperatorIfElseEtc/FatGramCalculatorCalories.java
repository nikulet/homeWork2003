package tekWillHomeWorks.homeWork2003.march26TernarOperatorIfElseEtc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FatGramCalculatorCalories {
    public static void main(String[] args) throws IOException {
      /*
      Write a program that asks the user to enter the number of calories and fat grams in a food.
      The program should display the percentage of the calories that come from fat.
      One gram of fat has 9 calories; therefore:
      Calories from fat =Fat grams*9
      The percentage of calories from fat can be calculated as follows:
      Calories from fat/Total calories
      If the calories from fat are less that 30 percent of the total calories of the food,it should
      also display a message indicating the food is low in fat.
*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of calories in a food: ");
        float calories = Float.parseFloat(reader.readLine());  //user is introdusing a number of callories
        System.out.println("Enter the number of fat grams in a food ");
        float fat = Float.parseFloat(reader.readLine());  //user is introdusing a number of fat in a food

        float caloriesfat = fat * 9f;
        float calpercentage = (100f * caloriesfat / calories);
        System.out.println("Percentage of the calories that come from fat is :" + calpercentage + "%");
        float conditionPercentage = calories * 30f / 100f;
        if (caloriesfat > conditionPercentage)
            System.out.println("The food has a good fat");
        else
            System.out.println("Food is low in fat");
    }
}
