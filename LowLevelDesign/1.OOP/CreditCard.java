public class CreditCard extends Card{

    public CreditCard(String userName, int cardNumber) {
        super(userName, cardNumber);
    }

    @Override
    public void pay() {
        System.err.println(String.format("Paying through card number: %s for User: %s", GetCardNumber(), GetUserName()));
        modeOfTransaction();
    }

    @Override
    public void modeOfTransaction() {
        System.err.println("Mode of transaction for this card is Credit");
    }
    
}
