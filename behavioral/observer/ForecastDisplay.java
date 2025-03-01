package behavioral.observer;

public class ForecastDisplay implements Observer {
    private float temperature;
    
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        forecast();
    }
    
    public void forecast() {
        System.out.println("Forecast for next hour: " + (temperature + 2) + "°C");
    }
}