// Smart speaker supports Wi-Fi, voice control and music.
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    public void connectToWiFi() {
        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    public void activateVoiceCommand() {
        System.out.println("Smart Speaker listening for voice commands.");
    }

    public void playMusic() {
        System.out.println("Smart Speaker is playing music.");
    }
}
