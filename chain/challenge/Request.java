package chain.challenge;

public class Request {
    private String user;
    private double amount;

    public Request(String user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() { return user; }
    public double getAmount() { return amount; }
}