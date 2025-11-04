public class NotificationServiceDIPB {

    private EmailServiceDIPB emailService;
    private SMSServiceDIPB smsService;
    private WhatsAppServiceDIPB whatsAppService;

    NotificationServiceDIPB() {
        this.emailService = new EmailServiceDIPB();
        this.smsService = new SMSServiceDIPB();
        this.whatsAppService = new WhatsAppServiceDIPB();
    }

    public void notify(String msg) {
        emailService.send(msg);
        whatsAppService.send(msg);
        smsService.send(msg);
    }
    
}
