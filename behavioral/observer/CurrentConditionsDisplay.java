package behavioral.observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }
    
    public void display() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}

