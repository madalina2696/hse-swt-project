import swt.Employee;

public class Main {

    public static void main(String[] args) {
        UserAuthentication userAuth = new UserAuthentication("alice", "secret123");

        Employee user = new Employee("BOB", "secure");

        user.setVacationDays(0, 30);
        

        /* // Einloggen
        userAuth.logIn();
        System.out.println("Benutzer ist eingeloggt: " + user.isUserLoggedIn());

        // Ausloggen
        userAuth.logOut();
        System.out.println("Benutzer ist ausgeloggt: " + user.isUserLoggedIn()); */
    }
}