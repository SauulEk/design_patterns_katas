package observer.challenge;

public class PhoneDisplay implements WeatherObserver {

    public PhoneDisplay(WeatherStation station) {
        station.registerObserver(this);
    }

    @Override
    public void updateTemperature(float temp) {
        System.out.println("Phone display: Temperature is " + temp + "°C");
    }



    
}
