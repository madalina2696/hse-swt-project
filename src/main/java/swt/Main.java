import swt.User.UserAuthentication;

public class Main {

    public static void main(String[] args) {
        UserAuthentication user = new UserAuthentication("alice", "secret123");

        // Einloggen
        user.logIn();
        System.out.println("Benutzer ist eingeloggt: " + user.isUserLoggedIn());

        // Ausloggen
        user.logOut();
        System.out.println("Benutzer ist ausgeloggt: " + user.isUserLoggedIn());
    }
}