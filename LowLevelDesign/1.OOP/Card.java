public abstract class Card implements PaymentMethod {
    private String userName;
    private int cardNumber;
    
    public Card(String userName, int cardNumber) {
        this.userName = userName;
        this.cardNumber = cardNumber;
    }

    public String GetUserName() {
        return this.userName;
    }

    public int GetCardNumber() {
        return this.cardNumber;
    }

    public abstract void modeOfTransaction();

}