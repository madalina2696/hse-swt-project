package swt;

import java.util.List;

public class Supervisor extends Employee {
    private List<Employee> employeesUnderSupervision;

    // Constructor
    public Supervisor(String username, String password) {
        super(username, password);
    }

    // Approve vacation request
    public void approveVacationRequest(TimeSheet timeSheet, int vacationDays) {
        // Überprüfen, ob genügend Urlaubstage für die Anfrage verfügbar sind
        if (vacationDays <= timeSheet.getVacationDays().getTotalVacationDays()) {
            timeSheet.getVacationDays().addVacationDays(-vacationDays);
        } else {
            System.out.println("Nicht genügend Urlaubstage verfügbar für die Anfrage.");
        }
    }
    
    // Reject vacation request
    public void rejectVacationRequest(TimeSheet timeSheet) {
        int vacationDays = timeSheet.getVacationDays().getTotalVacationDays();
        timeSheet.getVacationDays().addVacationDays(-vacationDays);
    }

    // Approve flex time
    public void approveFlexTime(Employee employee) {
        // Implementation code here
    }

    // Reject flex time
    public void rejectFlexTime(Employee employee) {
        // Implementation code here
    }

    // Approve monthly work time
    public void approveMonthlyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }

    // Reject monthly work time
    public void rejectMonthlyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }
}
