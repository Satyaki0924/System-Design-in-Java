public class UserSRPB {
    private String name;
    private int age;
    UserSRPB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saveToDb() {
        System.err.println("Saving user: "+ name +" to Db");
    }

    public void notifyUser() {
        if (age > 18)
            System.err.println("Notifying " + name);
    }

    public static void main(String[] args) {
        UserSRPB user = new UserSRPB("Satyaki Sanyal", 30);
        user.saveToDb();
        user.notifyUser();
    }
}
