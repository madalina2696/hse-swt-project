import java.util.ArrayList;
import java.util.List;
import swt.TimeSheet;
import swt.User;
public class Employee extends User {
    /* private int vacationDays;
    private int flexTime; */
    private List<TimeSheet> timeSheets;
    private int totalSickDays;

    // Constructor
    public Employee(String username, String password) {
        super(username, password);
        this.timeSheets = new ArrayList<TimeSheet>(12);
    }

    // Request vacation
    public void requestVacation(int vacationDay) {
        // Implementation code here
    }

    // Delete vacation days
    public void deleteVacationDays(int vacationDay) {
        // Implementation code here
    }

    // Register monthly work time
    public void registerMonthyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }

    public void setVacationDays(int month, int vacationDays) {
        timeSheets.get(month).setVacationDays(vacationDays);
    }

    public int getVacationDays(int month) {
        return timeSheets.get(month).getVacationDays();
    }

    public void calculateTotalSickDays() {
        totalSickDays = 0;
        for (TimeSheet timeSheet : timeSheets) {
            totalSickDays += timeSheet.getSickDays();
        }
    }

    public int getSickDays(int month) {
        return timeSheets.get(month).getSickDays();
    }
}
