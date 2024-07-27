import observer.*;

public class MainObserver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer smartphoneApp = new SmartphoneApp();
        Observer desktopApp = new DesktopApp();
        Observer webDashboard = new WebDashboard();

        weatherStation.addObserver(smartphoneApp);
        weatherStation.addObserver(desktopApp);
        weatherStation.addObserver(webDashboard);

        weatherStation.setMeasurements(25.0f, 65.0f, 1013.0f);
        weatherStation.setMeasurements(30.0f, 70.0f, 1012.0f);
    }
}
