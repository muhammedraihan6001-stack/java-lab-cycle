public class SmartDeviceDemo {
    public static void main(String[] args) {
        WiFiEnabled[] wifiDevices = {new SmartSpeaker(), new SmartTV(), new Thermostat(), new SmartPhone(), new SmartCar()};
        VoiceControlled[] voiceDevices = {new SmartSpeaker(), new SmartTV(), new SmartPhone(), new SmartCar()};
        MusicPlayer[] musicDevices = {new SmartSpeaker(), new SmartPhone(), new SmartCar()};
        VideoStreaming[] videoDevices = {new SmartTV(), new SmartPhone(), new SmartCar()};
        TemperatureMonitor[] temperatureDevices = {new Thermostat()};

        System.out.println("=== Smart Device Control System ===");

        for (WiFiEnabled device : wifiDevices) {
            device.connectToWiFi();
        }

        for (VoiceControlled device : voiceDevices) {
            device.activateVoiceCommand();
        }

        for (MusicPlayer device : musicDevices) {
            device.playMusic();
        }

        for (VideoStreaming device : videoDevices) {
            device.streamVideo();
        }

        for (TemperatureMonitor device : temperatureDevices) {
            device.showTemperature();
        }
    }
}
