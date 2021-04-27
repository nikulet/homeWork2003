package tekWillHomeWorks.homeWork2003.april26Overloding;

/*
Homework assignment:
Create an utility class that has only overloaded methods in order to prove method overloading.
The class should be named:
PerimeterCalculator
This class should do what it's name suggests: it should calculate the perimeter for different shapes. It doesn't
know for which shape it calculates the perimeter, but knows different formulas based on the input parameters.
Formulas that I expect you to translate to code (and have respective methods, based on different method parameters):
Triangle: Perimeter = a + b + c
Square: Perimeter = 4 × a (a - length of side)
Rectangle: Perimeter = 2 × (a + b)
Quadrilateral: Perimeter = a + b + c + d
Circle: Circumference = 2πr (r - radius)
PS: I hope you still remember what non-access modifier needs to be used in method declaration in order to be able
to call methods without an instance.
 */
public class PerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("The periteter of Triangle is: " + PerimeterCalculator.getParametru(2, 4.4, 6));
        System.out.println("The perimter of Square is: " + PerimeterCalculator.getParametru(3.8));
        System.out.println("The perimeter of Rectangle is: " + PerimeterCalculator.getParametru(4, 7));
        System.out.println("The perimeter of Quadrilatera is: " + PerimeterCalculator.getParametru(3.4, 7.9, 5.7, 14.7));
        System.out.println("The Circumference of Circle is: " + PerimeterCalculator.getParametru(15.3, 2.4));
    }

    public static double getParametru(double a, double b, double c) {
        return a + b + c;
    }

    public static double getParametru(double a) {
        return 4 * a * (a - a / 4);
    }

    public static double getParametru(int a, int b) {
        return 2 * (a + b);
    }

    public static double getParametru(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static double getParametru(double r, double radius) {
        return 2 * Math.PI * r * (r - radius);
    }
}
