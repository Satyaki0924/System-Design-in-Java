public class MainDIP {
    public static void main(String[] args) {
        NotificationDIP whatsApp = new WhatsAppServiceDIP();
        
        NotificationServiceDIP notificationService = new NotificationServiceDIP();
        notificationService.notify(whatsApp, "Your OTP is 1234");

        NotificationDIP email = new EmailServiceDIP();
        
        notificationService.notify(email, "Reset your password");
    }
}
