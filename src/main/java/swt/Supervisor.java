package swt;

import java.util.List;

public class Supervisor extends Employee {
    private List<Employee> employeesUnderSupervision;

    // Constructor
    public Supervisor(String username, String password) {
        super(username, password);
    }

    // Approve vacation request
    public void approveVacationRequest(TimeSheet vacationDay) {
        // Implementation code here
    }

    // Reject vacation request
    public void rejectVacationRequest(VacationDay vacationDay) {
        // Implementation code here
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
