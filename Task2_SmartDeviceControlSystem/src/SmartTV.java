// Smart TV supports Wi-Fi, voice control and video streaming.
class SmartTV implements WiFiEnabled, VoiceControlled, VideoStreaming {
    public void connectToWiFi() {
        System.out.println("Smart TV connected to Wi-Fi.");
    }

    public void activateVoiceCommand() {
        System.out.println("Smart TV is ready for voice commands.");
    }

    public void streamVideo() {
        System.out.println("Smart TV is streaming a movie.");
    }
}
