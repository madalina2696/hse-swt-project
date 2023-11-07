import java.util.ArrayList;
import java.util.List;
import swt.TimeSheet;
import swt.User;
public class Employee extends User {
    private int flexTime; */
    private List<TimeSheet> timeSheets;
    private int totalSickDays;
    private int vacationDays;

    // Constructor
    public Employee(int id, String username, String password) {
        super(id ,username, password);
        this.timeSheets = new ArrayList<TimeSheet>(12);
        this.vacationDays = 30; //Anzahl Urlaubstage pro Jahr
    }

    // Request vacation
    public void requestVacation(int month, int vacationDays) {
         if (month >= 0 && month < timeSheets.size()) {
          if (vacationDays <= this.timeSheets.get(month).getVacationDays()) {
                timeSheets.get(month).getVacationDays().addVacationDays(vacationDays);
            }else {
                System.out.println("Nicht genügend Urlaubstage verfügbar.");
            } 
        }
    }

    // Delete vacation days
    public void deleteVacationDays(int month) {
        if (month >= 0 && month < timeSheets.size()) {
            int vacationDays = timeSheets.get(month).getVacationDays();
            this.vacationDays += vacationDays; // Urlaubstage wieder hinzufügen
            timeSheets.get(month).setVacationDays(0);
        }
    }

    // Register monthly work time
    public void registerMonthyWorkTime(TimeSheet timeSheet) {
        // Implementation code here
    }

    public void setVacationDays(int month, int vacationDays) {
         if (month >= 0 && month < timeSheets.size()) {
        timeSheets.get(month).setVacationDays(vacationDays);
         }
    }

    public int getVacationDays(int month) {
        if (month >= 0 && month < timeSheets.size()) {
         return timeSheets.get(month).getVacationDays();
        }
        return 0;
    }

    public void calculateTotalSickDays() {
        totalSickDays = 0;
        for (TimeSheet timeSheet : timeSheets) {
            totalSickDays += timeSheet.getSickDays();
        }
    }

    public int getSickDays(int month) {
      if (month >= 0 && month < timeSheets.size()) {
        return timeSheets.get(month).getSickDays();
    }
    return 0;
}
