public class Upi implements PaymentMethod {

    private String upiId;

    public Upi(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.err.println(String.format("Paying through Upi Id: %s", this.upiId));
    }
    
}
