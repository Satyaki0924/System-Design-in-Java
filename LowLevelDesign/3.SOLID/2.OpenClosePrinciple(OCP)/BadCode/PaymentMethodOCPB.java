public class PaymentMethodOCPB {
    enum PaymentMethodType {
        CREDIT_CARD, DEBIT_CARD, UPI
    }
    public void pay(PaymentMethodType method, double amount) {
        switch (method) {
            case CREDIT_CARD:
                System.err.println(String.format("Paying %s through Credit Card", amount));
                return;
            case DEBIT_CARD:
                System.err.println(String.format("Paying %s through Debit Card", amount));
                return;
            case UPI:
                System.err.println(String.format("Paying %s through UPI", amount));
                return;
        }
    }

    public static void main(String[] args) {
        PaymentMethodOCPB payment = new PaymentMethodOCPB();
        payment.pay(PaymentMethodType.CREDIT_CARD, 100);
    }
}
