public class Coach extends User {
    private String eMail;
    private String phoneNumber;


    public Coach(String name, String lastName, String username, String password, String eMail, String phoneNumber) {
        super(name, lastName, username, password);
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean isCoach() {
        return true;
    }
}
