package swt;

public class TimeSheet{

    private int month;
    private double totalHours;
    private String status;
    private int vacationDays;
    private int sickDays;
    private int totalVacationDays;
    /* private int totalSickDays; */

    // Konstruktor

    public void Timesheet(int month, double totalHours, String status, int vacationDays, int sickDays,
            int totalSickDays, int totalVacationDays) {

        this.month = month;
        this.totalHours = totalHours;
        this.status = status;
        this.vacationDays = vacationDays;
        this.sickDays = sickDays;
        this.totalVacationDays = totalVacationDays;
    }

    // Getter und Setter-Methoden für die Attribute
    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getTotalVacationDays() {
        return totalVacationDays;
    }

    public void setTotalVacationDays(int totalVacationDays){
        this.totalVacationDays = totalVacationDays;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public int addVacationDays(int vacationDays){

        return vacationDays;

    }
}
//class SickDays {
    // Attributes and methods
    // add employee
   // private int totalSickDays;

    // Konstruktor
   // public SickDays() {

      //  this.totalSickDays = 0; // Zu Beginn hat der Mitarbeiter 0 Krankheitstage

    //{

    //public int getTotalSickDays() {
        //return totalSickDays;
    //}

    //public void addSickDays(int numberOfSickDays) {
     //   if (numberOfSickDays > 0) {
       //     totalSickDays += numberOfSickDays;
       // }
    //}
//} */
//}