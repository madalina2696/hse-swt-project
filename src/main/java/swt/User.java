package swt;

public class User {

    private int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public class UserAuthentication {
        private String username;
        private String password;
        private boolean isLoggedIn;

        public UserAuthentication(String username, String password) {
            this.username = username;
            this.password = password;
            this.isLoggedIn = false; 
        }

        public void logIn() {
            if (username.equals("Eingabe JavaFX") && password.equals("Eingabe JavaFX")) {
                isLoggedIn = true;
            } else {
                isLoggedIn = false;
            }
        }

        public void logOut() {
            isLoggedIn = false;
        }

        public boolean isUserLoggedIn() {
            return isLoggedIn; 
        }

    }
}
