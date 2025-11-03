import java.util.HashMap;
import java.util.Map;

public class MainOCP {
    public static void main(String[] args) {
        Map<String, PaymentMethodOCP> paymentAggregation = new HashMap<>();
        paymentAggregation.put("cc", new CreditCardOCP());
        paymentAggregation.put("dc", new DebitCardOCP());
        paymentAggregation.put("bc", new BitcoinOCP());

        paymentAggregation.get("bc").pay(100);
    }
}
