package strategy.challenge;

public class Main {
    public static void main(String[] args) {
        ShippingService service = new ShippingService();

        System.out.println(service.calculate("NORMAL", 2));
        System.out.println(service.calculate("EXPRESS", 2));
        System.out.println(service.calculate("INTERNATIONAL", 2));
    }
}