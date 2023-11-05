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
}
