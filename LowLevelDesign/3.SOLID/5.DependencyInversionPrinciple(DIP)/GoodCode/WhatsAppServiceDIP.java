public class WhatsAppServiceDIP implements NotificationDIP {
    
    @Override
    public void send(String msg) {
        System.err.println("WhatsApp: " + msg);
    }

}
