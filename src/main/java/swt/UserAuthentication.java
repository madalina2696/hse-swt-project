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
        // todo
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