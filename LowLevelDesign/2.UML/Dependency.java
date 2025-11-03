class PaymentGateway {
    public enum TransactionType {
        CREDIT_CARD, DEBIT_CARD, UPI
    }
    public void doUpiTransaction() {
        System.err.println("Transacting through UPI");
    }
    public void doCreditCardTransaction() {
        System.err.println("Transacting through Credit Card");
    }
    public void doDebitCardTransaction() {
        System.err.println("Transacting through Debit Card");
    }
}

class Order {
    private PaymentGateway gateway;
    Order(PaymentGateway gateway) {
        this.gateway = gateway;
    }
    public void executeOrder(int cartId, PaymentGateway.TransactionType type) {
        switch (type) {
            case CREDIT_CARD:
                gateway.doCreditCardTransaction();
                break;
            case DEBIT_CARD:
                gateway.doDebitCardTransaction();
                break;
            case UPI:
                gateway.doUpiTransaction();
                break;
            default:
                System.err.println("Payment not recognized.");
                break;
        }
    }
}

public class Dependency {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        Order order = new Order(gateway);
        order.executeOrder(1, PaymentGateway.TransactionType.CREDIT_CARD);
    }
}
