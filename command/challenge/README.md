Reto (Command)
Instrucciones
Refactoriza el control remoto para eliminar condicionales y desacoplar acciones concretas.
Implementa Command para que cada acción sea un objeto ejecutable.
Tu solución debe permitir agregar nuevos botones sin modificar RemoteControl.
Código a Refactorizar
Archivo: challenge/RemoteControl.java
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
Archivo: challenge/Light.java
package command.challenge;

public class Light {
    public void on() { System.out.println("Light ON"); }
    public void off() { System.out.println("Light OFF"); }
}
Archivo: challenge/MusicPlayer.java
package command.challenge;

public class MusicPlayer {
    public void play() { System.out.println("Music PLAY"); }
    public void stop() { System.out.println("Music STOP"); }
}
Archivo: challenge/Main.java
package command.challenge;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.pressButton("LIGHT_ON");
        remote.pressButton("MUSIC_PLAY");
    }
}
Tips
Cada botón debe ser un comando
No un string.
RemoteControl no ejecuta lógica
Solo llama execute().
Command permite historial
Luego puedes agregar undo, reintentos, colas, etc.
Recursos adicionales
¿Cuándo usar Command?
Cuando quieres tratar acciones como objetos
Cuando necesitas colas, logs, historial, undo
Cuando quieres desacoplar “invocador” y “receptor”