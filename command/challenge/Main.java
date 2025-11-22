package command.challenge;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.pressButton("LIGHT_ON");
        remote.pressButton("MUSIC_PLAY");
    }
}