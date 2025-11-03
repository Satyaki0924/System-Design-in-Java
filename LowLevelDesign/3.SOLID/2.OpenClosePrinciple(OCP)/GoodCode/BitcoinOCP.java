public class BitcoinOCP implements PaymentMethodOCP {

    @Override
    public void pay(double amount) {
        System.err.println(String.format("Paying %s through Bitcoin", amount));
    }
    
}
