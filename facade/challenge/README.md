Reto (Facade)
Instrucciones
Refactoriza el sistema de compra para que el cliente no tenga que conocer todos los subsistemas.
Implementa Facade para:
Crear una interfaz simple ShopFacade.buy(productId, cardNumber).
Ocultar la complejidad interna (inventario, pagos, envío).
Reducir acoplamiento del cliente con subsistemas.
Código a Refactorizar
Archivo: challenge/InventorySystem.java
package facade.challenge;

public class InventorySystem {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for " + productId);
        return true;
    }
}
Archivo: challenge/PaymentSystem.java
package facade.challenge;

public class PaymentSystem {
    public boolean pay(String cardNumber, double amount) {
        System.out.println("Paying $" + amount + " with card " + cardNumber);
        return true;
    }
}
Archivo: challenge/ShippingSystem.java
package facade.challenge;

public class ShippingSystem {
    public void ship(String productId) {
        System.out.println("Shipping product " + productId);
    }
}
Archivo: challenge/Main.java
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
Tips
 El cliente no debería coordinar subsistemas
Eso es trabajo de la Facade.
 Facade no reemplaza subsistemas
Solo los agrupa con una interfaz simple.
 Un método simple para todo
buy() debe contener la orquestación.
Recursos adicionales
¿Cuándo usar Facade?
Cuando hay varios subsistemas y el cliente se acopla a todos.
Cuando quieres simplificar API para usuarios externos.
Para encapsular procesos complejos en una sola llamada.