public class Coached extends User {

    public Coached(String name, String lastName, String username, String password ) {
        super(name, lastName, username, password);
    }

    @Override
    public boolean isCoach() {
        return false;
    }

}
