public class EmailServiceDIP implements NotificationDIP {

    @Override
    public void send(String msg) {
        System.err.println("Email: " + msg);
    }
    
}
