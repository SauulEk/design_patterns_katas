package builder.challenge;

public class TravelPackage {
    private String hotel;
    private int nights;
    private boolean breakfastIncluded;
    private boolean airportTransfer;
    private String tour;

    public TravelPackage(String hotel, int nights, boolean breakfastIncluded,
                         boolean airportTransfer, String tour) {
        this.hotel = hotel;
        this.nights = nights;
        this.breakfastIncluded = breakfastIncluded;
        this.airportTransfer = airportTransfer;
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Hotel: " + hotel + ", Nights: " + nights +
                ", Breakfast: " + breakfastIncluded +
                ", Transfer: " + airportTransfer +
                ", Tour: " + tour;
    }
}