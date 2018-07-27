package assignment;

public abstract class User {

    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private Account mAccount;

    public User(String firstName, String lastName, String email,
            Account account) {
        mFirstName = firstName;
        mLastName = email;
        mEmail = email;
        mAccount = account;
    }

    public abstract void welocmeUserMessage();

    public User() {
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getUsername() {
        return mAccount.getUsername();
    }

    public String getPassword() {
        return mAccount.getPassword();
    }

    public String getUserRole() {
        return mAccount.getUserRole();
    }

}
