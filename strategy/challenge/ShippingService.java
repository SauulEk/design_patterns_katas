package strategy.challenge;

public class ShippingService {
    public double calculate(String type, double weightKg) {
        if (type.equals("NORMAL")) {
            return weightKg * 10;
        } else if (type.equals("EXPRESS")) {
            return weightKg * 20 + 50;
        } else if (type.equals("INTERNATIONAL")) {
            return weightKg * 30 + 100;
        }
        return 0;
    }
}