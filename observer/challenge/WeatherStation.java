package observer.challenge;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private float temperature;
    private final List<WeatherObserver> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.updateTemperature(temperature);
        }
    }
}
