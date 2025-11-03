public class NotificationServiceSRP {
    public void notifyUser(UserSRP user) {
        if (user.getAge() > 18) {
            System.err.println("Notifying User: " + user.getName());
        }
    }
}
