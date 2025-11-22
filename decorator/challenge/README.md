Reto (Decorator)
Instrucciones
Refactoriza el código para permitir agregar extras a un café (leche, chocolate, canela) sin crear una clase por cada combinación.
Implementa el patrón Decorator para envolver dinámicamente el objeto base.
Tu solución debe permitir agregar nuevos toppings sin modificar Coffee, aplicando OCP.
Código a Refactorizar
Archivo: challenge/Coffee.java
package decorator.challenge;

public class Coffee {
    public String getDescription() {
        return "Simple coffee";
    }

    public double cost() {
        return 20.0;
    }
}
Archivo: challenge/Main.java
package decorator.challenge;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

    }
}
Tips
 Piensa en “envolver”
Un Decorator recibe un Coffee dentro y le agrega algo.
 Interfaz común
Todos los decoradores deben responder igual que Coffee (mismos métodos).
 Composición sobre herencia
No hagas “CoffeeWithMilkWithChocolate”.
Haz decoradores combinables.
Recursos adicionales
¿Cuándo usar Decorator?
Cuando necesitas agregar funcionalidades opcionales
Cuando no quieres explotar la jerarquía de herencia
Cuando quieres combinar extras en runtime
Idea clave:
Decorator no reemplaza al objeto, lo extiende envolviéndolo.