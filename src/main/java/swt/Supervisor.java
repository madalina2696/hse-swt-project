package swt;

import java.util.List;

public class Supervisor extends Employee {
    private List<Employee> employeesUnderSupervision;

    // Constructor
    public Supervisor(String username, String password) {
        super(username, password);
    }

    // Approve vacation request
    public void handleVacationRequest(TimeSheet timeSheet, int vacationDays, int totalVacationDays) {
        // Überprüfen, ob genügend Urlaubstage für die Anfrage verfügbar sind
        TimeSheet timesheet = new TimeSheet();

        vacationDays = timeSheet.getVacationDays();
        totalVacationDays = timeSheet.getTotalVacationDays();

        if (vacationDays <= totalVacationDays && vacationDays!=0) {
            int daysToAdd = +vacationDays;
            vacationDays = timeSheet.addVacationDays(daysToAdd);
            //approve an employee weiterleiten
        } 
        else {
            //System.out.println("Nicht genügend Urlaubstage verfügbar für die Anfrage.");
            //hier die rejectVacationRequest() methode einfügen für effizienteren code
        }
    }

    // Approve flex time
    public void handleFlexTime(Employee employee, int flexTime) {
        
        flexTime = employee.getFlexTime();            

        if (flexTime > 0){
            //approve an employee weiterleiten
        }
        else{
            //Reject Flextime 
        }
    }

    // Approve monthly work time
    public void handleMonthlyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }

    // Reject monthly work time
    public void rejectMonthlyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }
}
