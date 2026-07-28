// Interfaces for smart device capabilities.
interface WiFiEnabled {
    void connectToWiFi();
}

interface VoiceControlled {
    void activateVoiceCommand();
}

interface MusicPlayer {
    void playMusic();
}

interface VideoStreaming {
    void streamVideo();
}

interface TemperatureMonitor {
    void showTemperature();
}
