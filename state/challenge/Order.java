package state.challenge;

public class Order {
    private String status = "NEW";

    public void next() {
        if (status.equals("NEW")) {
            System.out.println("Order is now COOKING");
            status = "COOKING";
        } else if (status.equals("COOKING")) {
            System.out.println("Order is now ON_THE_WAY");
            status = "ON_THE_WAY";
        } else if (status.equals("ON_THE_WAY")) {
            System.out.println("Order is now DELIVERED");
            status = "DELIVERED";
        } else {
            System.out.println("Order already finished.");
        }
    }

    public void cancel() {
        if (status.equals("DELIVERED")) {
            System.out.println("You can't cancel a delivered order");
        } else {
            System.out.println("Order cancelled");
            status = "CANCELLED";
        }
    }

    public void printStatus() {
        System.out.println("Current status: " + status);
    }
}