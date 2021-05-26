package tekWillHomeWorks.homeWork2003.may24Extends;

/*
In a particular factory,a leader is an hourly paid production worker that leads a amall team.
In addition to hourly pay,team leaders earn a fixed monthly bonus.Team leaders are required to
attend a minimum number of hours of training per year.Design a TeamLeamLeader class that extends
the ProductionWorker class you designed in Programming Cgallenge 1. The TeamLeader class should
have fields for the monthly bonus amount,the required number of training hours,and the number of
training hours that the team leader has attended.Write one or more constructors and the appropriate
accessor and mutator methods for the class.Demonstrate the class by writing a program that uses a
TeamLeader object.
//*******************************************************************************************
Într-o anumită fabrică, un lider este un lucrător plătit pe oră, care conduce o echipă mică.
În plus față de plata pe oră, liderii de echipă câștigă un bonus fix lunar. Liderii de echipă
trebuie să participe la un număr minim de ore de instruire pe an. o clasă TeamLeamLeader care
extinde clasa ProductionWorker pe care ați proiectat-o în Programare Cgallenge 1. Clasa TeamLeader
ar trebui să aibă câmpuri pentru suma lunară a bonusului, numărul necesar de ore de antrenament și
numărul de ore de antrenament la care a participat șeful echipei. Scrieți unul sau mai mulți
constructori și metodele de accesor și mutator adecvate pentru clasă. Demonstrați clasa scriind
un program care utilizează un obiect TeamLeader.
 */
public class TeamLeader extends ProductionWorker {
    private final double MonthlyBonus=12.45;
   private final double RequiredNumberOfTrainingHouers=7;
    double NumberOfTrainingHoursThatAttended;

    TeamLeader() {
        NumberOfTrainingHoursThatAttended = 0.0;
    }

    TeamLeader( double newNumberOfTrainingHoursThatAttended) {
        NumberOfTrainingHoursThatAttended = newNumberOfTrainingHoursThatAttended;
    }

     double bonus(int hours) {
        if (NumberOfTrainingHoursThatAttended <= RequiredNumberOfTrainingHouers) {
            return 14325.60;
        } else {
            return (hours * 12.45)+14325.60;
        }
    }
}
