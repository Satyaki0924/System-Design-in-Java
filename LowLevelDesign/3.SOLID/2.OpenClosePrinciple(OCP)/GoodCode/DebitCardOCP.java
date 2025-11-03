public class DebitCardOCP implements PaymentMethodOCP {

    @Override
    public void pay(double amount) {
        System.err.println(String.format("Paying %s through Debit Card", amount));
    }
    
}
