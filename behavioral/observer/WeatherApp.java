package behavioral.observer;

public class  WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        // Create observers
        Observer currentDisplay = new CurrentConditionsDisplay();
        Observer forecastDisplay = new ForecastDisplay();
        
        // Register observers
        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(forecastDisplay);
        

        System.out.println("****");
        // Set a new temperature and notify observers
        weatherStation.setTemperature(25.0f);
        
        System.out.println("****");
        // Change temperature again
        weatherStation.setTemperature(30.0f);
    }
}
