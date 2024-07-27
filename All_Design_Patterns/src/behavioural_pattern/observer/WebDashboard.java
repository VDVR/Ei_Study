package observer;

public class WebDashboard implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Web Dashboard: Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
