import java.util.HashMap;

public class PaymentService {

    private HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<String, PaymentMethod>();
    }

    public void addPaymentService(String serviceNickName, PaymentMethod method) {
        paymentMethods.put(serviceNickName, method);
    }

    public void makePayment(String serviceNickName) {
        PaymentMethod method = paymentMethods.get(serviceNickName);
        if (method == null) {
            System.out.println("No paymentMethods found with the nickname: " + serviceNickName);
            return;
        }
        method.pay();
    }
    
}
