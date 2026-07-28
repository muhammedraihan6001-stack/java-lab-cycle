// Thermostat supports Wi-Fi and temperature monitoring.
class Thermostat implements WiFiEnabled, TemperatureMonitor {
    public void connectToWiFi() {
        System.out.println("Thermostat connected to Wi-Fi.");
    }

    public void showTemperature() {
        System.out.println("Current room temperature is 24°C.");
    }
}
