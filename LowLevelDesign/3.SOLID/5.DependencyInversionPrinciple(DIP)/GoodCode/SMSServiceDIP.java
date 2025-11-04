public class SMSServiceDIP implements NotificationDIP {
    
    @Override
    public void send(String msg) {
        System.err.println("SMS: " + msg);
    }

}
