package builder.challenge;

public class Main {
    public static void main(String[] args) {
        TravelPackage pkg = new TravelPackage(
                "Sensira", 4, true, true, "Chichen Itza"
        );

        System.out.println(pkg);

    }
}