package swt;

import java.util.List;

public class Employee extends User {
    private List<VacationDay> vacationDays;
    private int flexTime;
    private List<TimeSheet> monthlyWorkTime;
    private List<TimeSheet> timeSheets;

    // Constructor
    public Employee(String username, String password) {
        super(username, password);
    }

    // Request vacation
    public void requestVacation(VacationDay vacationDay) {
        // Implementation code here
    }

    // Delete vacation days
    public void deleteVacationDays(VacationDay vacationDay) {
        // Implementation code here
    }

    // Register monthly work time
    public void registerMonthyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }
}
