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
            if (username "Eingabe" && password = "Eingabe"; isLoggedIn = true ;isLoggedIn = false)  // Eingabe aus JavaFX
   
        }

        // Methode zum Ausloggen
        public void logOut() {
            isLoggedIn = false;
        }

        // Getter-Methode für den Anmeldestatus
        public boolean isUserLoggedIn() {
            return isLoggedIn;
        }

    }
}
