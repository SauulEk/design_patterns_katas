Reto (Builder)
Instrucciones
Refactoriza la creación de paquetes turísticos para evitar constructores gigantes.
Implementa Builder para construir objetos paso a paso con métodos encadenables.
Tu solución debe permitir agregar nuevos campos sin romper constructores existentes.
Código a Refactorizar
Archivo: challenge/TravelPackage.java
package builder.challenge;

public class TravelPackage {
    private String hotel;
    private int nights;
    private boolean breakfastIncluded;
    private boolean airportTransfer;
    private String tour;

    public TravelPackage(String hotel, int nights, boolean breakfastIncluded,
                         boolean airportTransfer, String tour) {
        this.hotel = hotel;
        this.nights = nights;
        this.breakfastIncluded = breakfastIncluded;
        this.airportTransfer = airportTransfer;
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Hotel: " + hotel + ", Nights: " + nights +
                ", Breakfast: " + breakfastIncluded +
                ", Transfer: " + airportTransfer +
                ", Tour: " + tour;
    }
}
Archivo: challenge/Main.java
package builder.challenge;

public class Main {
    public static void main(String[] args) {
        TravelPackage pkg = new TravelPackage(
                "Sensira", 4, true, true, "Chichen Itza"
        );

        System.out.println(pkg);

        // Pero quiero poder armar paquetes flexibles:
        // solo hotel+nights, o agregar extras opcionales.
    }
}
Tips
 Constructor gigante = señal de Builder
Si hay muchos parámetros opcionales, Builder es ideal.
 Encadenamiento fluido
hotel().nights().transfer().build()
 Objeto inmutable al final
Una vez construido, ya no cambia.
Recursos adicionales
¿Cuándo usar Builder?
Cuando un objeto tiene muchos parámetros opcionales
Cuando quieres construcción legible
Cuando quieres evitar errores por orden de parámetros
Si quieres, ahora te hago las soluciones completas (refactor final) de cada uno como hicimos con Factory/Observer/Adapter.