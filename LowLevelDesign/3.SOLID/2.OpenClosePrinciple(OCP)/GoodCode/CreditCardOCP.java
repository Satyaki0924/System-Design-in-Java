public class CreditCardOCP implements PaymentMethodOCP {
    @Override
    public void pay(double amount) {
        System.err.println(String.format("Paying %s through Credit Card", amount));
    }
}
