package observer;

public class DesktopApp implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Desktop App: Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
