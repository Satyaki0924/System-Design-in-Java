public class MainSRP {
    public static void main(String[] args) {
        UserSRP user = new UserSRP("Satyaki Sanyal", 30);

        DatabaseAccessSRP databaseAccess = new DatabaseAccessSRP();
        databaseAccess.saveToDb(user);

        NotificationServiceSRP notificationService = new NotificationServiceSRP();
        notificationService.notifyUser(user);
    }
}
