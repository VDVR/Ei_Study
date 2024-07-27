package observer;

public class SmartphoneApp implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Smartphone App: Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
