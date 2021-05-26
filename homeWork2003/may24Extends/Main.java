package tekWillHomeWorks.homeWork2003.may24Extends;

public class Main {
    public static void main(String[] args) {
        ProductionWorker productionWorker = new ProductionWorker();
        productionWorker.setEmployeeName("Petru");
        productionWorker.setEmployeeNumber("078-Y");
        productionWorker.setDate("20.02.2015");
        productionWorker.setShift(2);
        productionWorker.setHourlyPayRate(23.30);
        System.out.println("The worker name is " + productionWorker.getEmployeeName() + ", employee number is " + productionWorker.getEmployeeNumber() + ", the first day of work is "
                + productionWorker.getDate() + ", the work is to " + productionWorker.getShift() + ", the rate for hour is " + productionWorker.getHourlyPayRate());

        ProductionWorker productionWorker1 = new ProductionWorker();
        productionWorker1.setEmployeeName("Sandu");
        productionWorker1.setEmployeeNumber("032-A");
        productionWorker1.setDate("27.07.2018");
        productionWorker1.setShift(1);
        productionWorker1.setHourlyPayRate(21.90);
        System.out.println("The worker name is " + productionWorker1.getEmployeeName() + ", employee number is " + productionWorker1.getEmployeeNumber() + ", the first day of work is "
                + productionWorker1.getDate() + ", the work is to " + productionWorker1.getShift() + ", the rate for hour is " + productionWorker1.getHourlyPayRate());

        ProductionWorker pro = new ProductionWorker();
        pro.EmployeeName = "Nicu";
        pro.EmployeeNumber = "326-G";
        pro.date = "21.07.2018";
        pro.Shift = 1;
        pro.HourlyPayRate = 23.45;
        pro.toPrintEmployee(pro);


        ShiftSupervisor supra=new ShiftSupervisor();
        supra.EmployeeName="Ion";
        supra.EmployeeNumber="XXX-L";
        supra.date="31.03.2001";
        supra.SalariedEmployee=23453.35;
        System.out.println("The salary is: "+supra.yearBonus(2));

        TeamLeader sup=new TeamLeader();
        sup.EmployeeName="Ion";
        sup.EmployeeNumber="XXX-L";
        sup.date="31.03.2001";
        System.out.println("The salary is: "+sup.bonus(15));

    }
}
