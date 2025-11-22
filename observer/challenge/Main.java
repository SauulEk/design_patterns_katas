package observer.challenge;

public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        WebDisplay webDisplay = new WebDisplay(station);
        TvDisplay tvDisplay = new TvDisplay(station);

        System.out.println("=== Actualizando temperatura ===\n");
        station.setTemperature(25.5f);

        System.out.println("\n=== Nueva actualización ===\n");
        station.setTemperature(30.0f);

        System.out.println("\n=== Agregando un nuevo display dinámicamente ===");
        TabletDisplay tabletDisplay = new TabletDisplay(station);

        System.out.println("\n=== Nueva actualización con TabletDisplay registrado ===\n");
        station.setTemperature(27.3f);
    }
    
}
