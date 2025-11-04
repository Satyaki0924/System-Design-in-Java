public class NotificationServiceDIP {

    public void notify(NotificationDIP notification, String msg) {
        notification.send(msg);
    }
    
}
