package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject {
    private float temperature;
    private final List<Observer> observers;
    
    public WeatherStation() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
