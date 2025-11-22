package observer.challenge;

public class WebDisplay implements WeatherObserver {

    public WebDisplay(WeatherStation station) {
        station.registerObserver(this);
    }

    @Override
    public void updateTemperature(float temp) {
        System.out.println("Web display: Temperature is " + temp + "°C");
    }
}
