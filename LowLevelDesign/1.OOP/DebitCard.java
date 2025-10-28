public class DebitCard extends Card {

    public DebitCard(String userName, int cardNumber) {
        super(userName, cardNumber);
    }
    @Override
    public void modeOfTransaction() {
       System.out.println("Mode of transaction for this card is Debit");
    }
    @Override
    public void pay() {
        System.err.println(String.format("Paying through card number: %s for User: %s", GetCardNumber(), GetUserName()));
        modeOfTransaction();
    }
}
