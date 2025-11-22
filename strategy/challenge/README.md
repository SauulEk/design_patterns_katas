Reto (Strategy)
Instrucciones
Refactoriza el código para eliminar condicionales al calcular el costo de envío.
Implementa Strategy para que cada tipo de envío sea una estrategia intercambiable.
Tu solución debe permitir agregar nuevos tipos de envío sin modificar ShippingService, aplicando OCP.
Código a Refactorizar
Archivo: challenge/ShippingService.java
package strategy.challenge;

public class ShippingService {
    public double calculate(String type, double weightKg) {
        if (type.equals("NORMAL")) {
            return weightKg * 10;
        } else if (type.equals("EXPRESS")) {
            return weightKg * 20 + 50;
        } else if (type.equals("INTERNATIONAL")) {
            return weightKg * 30 + 100;
        }
        return 0;
    }
}
Archivo: challenge/Main.java
package strategy.challenge;

public class Main {
    public static void main(String[] args) {
        ShippingService service = new ShippingService();

        System.out.println(service.calculate("NORMAL", 2));
        System.out.println(service.calculate("EXPRESS", 2));
        System.out.println(service.calculate("INTERNATIONAL", 2));
    }
}
Tips
 Cada algoritmo = una estrategia
NORMAL, EXPRESS, INTERNATIONAL no son “tipos”, son formas distintas de calcular.
 Servicio sin decisiones
ShippingService solo debe ejecutar una estrategia, no decidir cuál.
 Registro de estrategias
Puedes usar un Map<String, ShippingStrategy> para registrar nuevas sin editar clases.
Recursos adicionales
¿Cuándo usar Strategy?
Cuando tienes varios algoritmos intercambiables
Cuando el código está lleno de if-else por “tipo”
Cuando quieres cambiar comportamiento en runtime