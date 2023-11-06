package swt;

public class User {

    private String username;
    private String password;

    // Konstruktor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter-Methode
    public String getUsername() {
        return username;
    }

    // Setter-Methode
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public class UserAuthentication {
        private String username;
        private String password;
        private boolean isLoggedIn;

        // Konstruktor
        public UserAuthentication(String username, String password) {
            this.username = username;
            this.password = password;
            this.isLoggedIn = false; // Initialer Anmeldestatus ist "ausgeloggt"
        }

        // Methode zum Einloggen
        public void logIn() {
            if (username.equals("Eingabe JavaFX") && password.equals("Eingabe JavaFX")) {
                isLoggedIn = true;
            } else {
                isLoggedIn = false; //Falsche Anmeldedaten, bitte nochmal einloggen
            }
        }

        // Methode zum Ausloggen
        public void logOut() {
            isLoggedIn = false; //  zurück zur Anmeldemaske
        }

        // Getter-Methode für den Anmeldestatus
        public boolean isUserLoggedIn() {
            return isLoggedIn;  //Anzeige in der Übersichtsmaske: Wer ist eingeloggt.
        }

    }
}
