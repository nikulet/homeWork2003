package tekWillHomeWorks.homeWork2003.may24Extends;
/*
In a particular factory,a shift supervisor is a salaried employee who supervises a shift.
In addition to a salary,the supervisor earns a yearly bonus when his or her shift meets production
goals.Design a ShiftSupervisor class that extends the Employee class you created in Programming
Challenge 1. The ShiftSupervisor class should have a field that holds the annual salary and a field
that holds the annual production bonus that a shift supervisor has earned. Write one or more constructors
and the appropriate accessor and mutator methods for the class. Demonstrate the class by writing a program
that uses a ShiftSupervisor object.
//******************************************************************
Într-o anumită fabrică, un supraveghetor de schimb este un angajat salariat care supraveghează o
schimbare. În plus față de salariu, supraveghetorul câștigă un bonus anual atunci când schimbul
său îndeplinește obiectivele de producție. un domeniu care deține bonusul anual de producție
câștigat de un supraveghetor de schimb. Scrieți unul sau mai mulți constructori și metodele de
accesor și mutator adecvate pentru clasă. Demonstrați clasa scriind un program care utilizează un
obiect ShiftSupervisor.
 */
public class ShiftSupervisor extends Employee {
    double SalariedEmployee;
    ShiftSupervisor(){
        SalariedEmployee=0;
    }
    ShiftSupervisor(double salarieForMonth){
        SalariedEmployee=salarieForMonth;
    }

    public double anualSalarie(){
        return SalariedEmployee;
    }

     double yearBonus(int hours) {
        if (hours <= 10) {
            return SalariedEmployee;
        } else {
            return 14325.60+(hours*15.85);
        }
    }
}
