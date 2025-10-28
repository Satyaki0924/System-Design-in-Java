public class Client {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        PaymentMethod creditCard = new CreditCard("Satyaki Sanyal", 1234);
        service.addPaymentService("satyCredit1", creditCard);

        PaymentMethod debitCard = new DebitCard("Satyaki Sanyal", 6789);
        service.addPaymentService("satyDebit1", debitCard);

        PaymentMethod upi = new Upi("upi@upi.com");
        service.addPaymentService("satyUpi1", upi);

        service.makePayment("satyDebit1");
        service.makePayment("satyUpi1");
        service.makePayment("satyCredit1");
        service.makePayment("satyCredit12");
    }
}
