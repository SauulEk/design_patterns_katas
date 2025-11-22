package facade.challenge;

public class PaymentSystem {
    public boolean pay(String cardNumber, double amount) {
        System.out.println("Paying $" + amount + " with card " + cardNumber);
        return true;
    }
}