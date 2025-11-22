package command.challenge;

public class RemoteControl {
    private Light light = new Light();
    private MusicPlayer music = new MusicPlayer();

    public void pressButton(String action) {
        if (action.equals("LIGHT_ON")) light.on();
        if (action.equals("LIGHT_OFF")) light.off();
        if (action.equals("MUSIC_PLAY")) music.play();
        if (action.equals("MUSIC_STOP")) music.stop();
    }
}