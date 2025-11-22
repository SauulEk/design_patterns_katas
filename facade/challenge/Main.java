
package facade.challenge;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();
        PaymentSystem payment = new PaymentSystem();
        ShippingSystem shipping = new ShippingSystem();

        String productId = "P100";
        String card = "1234-5678";
        double price = 250;

        if (inventory.checkStock(productId)) {
            if (payment.pay(card, price)) {
                shipping.ship(productId);
                System.out.println("Purchase completed ");
            }
        }
    }
}