package chain.challenge;

public class RequestValidator {

    public boolean validate(Request request) {
        if (request == null) {
            System.out.println("Rejected: null request");
            return false;
        }

        if (request.getUser() == null || request.getUser().isEmpty()) {
            System.out.println("Rejected: missing user");
            return false;
        }

        if (request.getAmount() <= 0) {
            System.out.println("Rejected: invalid amount");
            return false;
        }

        if (request.getAmount() > 5000) {
            System.out.println("Rejected: amount too high");
            return false;
        }

        System.out.println("Request accepted ");
        return true;
    }
}