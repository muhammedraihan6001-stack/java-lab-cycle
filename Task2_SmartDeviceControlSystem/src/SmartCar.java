// Smart car demonstrates adding a new device without changing existing interfaces.
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    public void connectToWiFi() {
        System.out.println("Smart Car connected to Wi-Fi.");
    }

    public void activateVoiceCommand() {
        System.out.println("Smart Car is responding to voice commands.");
    }

    public void playMusic() {
        System.out.println("Smart Car is playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart Car is streaming videos to the dashboard.");
    }
}
