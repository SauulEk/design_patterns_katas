package state.challenge;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.printStatus();
        order.next();
        order.printStatus();
        order.next();
        order.printStatus();
        order.cancel();
        order.printStatus();
    }
}