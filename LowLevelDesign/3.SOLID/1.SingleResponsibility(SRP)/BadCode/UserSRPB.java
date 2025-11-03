public class UserSRPB {
    private String name;
    private int age;
    UserSRPB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saveToDb(UserSRPB user) {
        System.err.println("Saving user: "+ name +" to Db");
    }

    public void notifyUser(UserSRPB user) {
        if (age > 18)
            System.err.println("Notifying " + user.name);
    }
}
