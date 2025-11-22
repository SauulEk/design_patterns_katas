package observer.challenge;

public class TabletDisplay implements WeatherObserver {

    public TabletDisplay(WeatherStation station) {
        station.registerObserver(this);
    }

    @Override
    public void updateTemperature(float temp) {
        System.out.println("Tablet display: Temperature is " + temp + "°C");
    }

}
