package tekWillHomeWorks.homeWork2003.may24Extends;

/*
Ex 1. Employee and ProductionWorker Classes
 */
public class Employee {
    String EmployeeName;
    String EmployeeNumber;
    String date;

    Employee() {
        EmployeeName = "Nicu";
        EmployeeNumber = "345-AJF";
        date = "21.05.2021";
    }

    Employee(String newEmployeeName) {
        EmployeeName = newEmployeeName;
        EmployeeNumber = "345-AJF";
        date = "21.05.2021";
    }

    Employee(String newEmployeeName, String newEmployeeNumber) {
        EmployeeName = newEmployeeName;
        EmployeeNumber = newEmployeeNumber;
        date = "21.05.2021";
    }

    Employee(String newEmployeeName, String newEmployeeNumber, String newDate) {
        EmployeeName = newEmployeeName;
        EmployeeNumber = newEmployeeNumber;
        date = newDate;
    }


    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public String getDate() {
        return date;
    }

}