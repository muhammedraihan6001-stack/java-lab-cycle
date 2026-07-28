// Smartphone supports Wi-Fi, voice control, music and video streaming.
class SmartPhone implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    public void connectToWiFi() {
        System.out.println("Smart Phone connected to Wi-Fi.");
    }

    public void activateVoiceCommand() {
        System.out.println("Smart Phone is accepting voice commands.");
    }

    public void playMusic() {
        System.out.println("Smart Phone is playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart Phone is streaming a video.");
    }
}
