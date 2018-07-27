package assignment;

public class Account {

    private String mUsername;
    private String mPassword;
    private String mUserRole;

    public Account(String username, String password, String userRole) {
        this.mUsername = username;
        this.mPassword = password;
        this.mUserRole = userRole;
    }

    public Account() {
    }

    public String getUsername() {
        return mUsername;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getUserRole() {
        return mUserRole;
    }

    public String login(String username, String password) {
        TxtFile file = new TxtFile("users");
        String role = file.verifyUserWithinFile(username, password);
        return role;
    }
}
