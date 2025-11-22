package observer.challenge;

public class TvDisplay implements WeatherObserver {

    public TvDisplay(WeatherStation station) {
        station.registerObserver(this);
    }

    @Override
    public void updateTemperature(float temp) {
        System.out.println("TV display: Temperature is " + temp + "°C");
    }

}
