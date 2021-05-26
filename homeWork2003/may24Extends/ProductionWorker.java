package tekWillHomeWorks.homeWork2003.may24Extends;

public class ProductionWorker extends Employee {
    int Shift;  //schimburi: de zi si de noapte
    double HourlyPayRate; //rata pentru plata pentru ora

    public void setShift(int shift) {
        Shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        HourlyPayRate = hourlyPayRate;
    }

    public String getShift() {
        if (Shift==1){
            return "day";
        }
        else if(Shift==2){
            return "night";
        }
        else return "This number is not a Shift";
    }

    public double getHourlyPayRate() {
        return HourlyPayRate;
    }

    ProductionWorker() {
        Shift = 1;
        HourlyPayRate = 14.70;
    }

    ProductionWorker(int newShift) {
        Shift = newShift;
        HourlyPayRate = 18.58;
    }

    ProductionWorker(int newShift, double newHourlyPayRate) {
        Shift = newShift;
        HourlyPayRate = newHourlyPayRate;
    }


    public void toPrintEmployee(ProductionWorker worker) {
        System.out.println("Name " + worker.EmployeeName + ", employee number is " + worker.EmployeeNumber + ", the first day of work is "
                + worker.date + ", the work is to " + worker.getShift() + ", the rate for hour is " + worker.getHourlyPayRate());
    }

}
