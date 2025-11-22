package chain.challenge;

public class Main {
    public static void main(String[] args) {
        RequestValidator validator = new RequestValidator();

        validator.validate(new Request("", 100));
        validator.validate(new Request("Nancy", 7000));
        validator.validate(new Request("Saul", 500));
    }
}