package homeWork2003.martie19;

public class Ex3 {
    public static void main(String[] args) {
                /*
3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/

        int nrr=123456;
        int ras=nrr/nrr%nrr;
        int ras1=nrr/nrr+1%nrr;
        int ras2=nrr/nrr+2%nrr;
        int ras3=nrr/nrr+3%nrr;
        int ras4=nrr/nrr+4%nrr;
        int ras5=nrr/nrr+5%nrr;

        System.out.println("        Exercitiul 3\n\nRaspunsul: "+ras+" "+ras1+" "+ras2+" "+ras3+" "+ras4+" "+ras5+"\n");



    }
}
