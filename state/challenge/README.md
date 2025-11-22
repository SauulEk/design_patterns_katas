Reto (State)
Instrucciones
Refactoriza el código para eliminar los condicionales basados en estado dentro de Order.
Implementa el patrón State para que:
Cada estado del pedido tenga su propia clase.
Order delegue el comportamiento al estado actual.
Puedas agregar nuevos estados sin modificar Order (OCP).
Código a Refactorizar
Archivo: challenge/Order.java
package state.challenge;

public class Order {
    private String status = "NEW";

    public void next() {
        if (status.equals("NEW")) {
            System.out.println("Order is now COOKING");
            status = "COOKING";
        } else if (status.equals("COOKING")) {
            System.out.println("Order is now ON_THE_WAY");
            status = "ON_THE_WAY";
        } else if (status.equals("ON_THE_WAY")) {
            System.out.println("Order is now DELIVERED");
            status = "DELIVERED";
        } else {
            System.out.println("Order already finished.");
        }
    }

    public void cancel() {
        if (status.equals("DELIVERED")) {
            System.out.println("You can't cancel a delivered order");
        } else {
            System.out.println("Order cancelled");
            status = "CANCELLED";
        }
    }

    public void printStatus() {
        System.out.println("Current status: " + status);
    }
}
Archivo: challenge/Main.java
package state.challenge;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.printStatus();
        order.next();
        order.printStatus();
        order.next();
        order.printStatus();
        order.cancel();
        order.printStatus();
    }
}
Tips
 Muchos if-else por estado = señal de State
Cada estado debe encapsular su propio comportamiento.
 Crea una interfaz común
Algo como OrderState con métodos next(Order) y cancel(Order).
 El contexto no decide
Order no debe saber “qué sigue”, solo delega.
Recursos adicionales
¿Cuándo usar State?
Cuando un objeto cambia comportamiento según su estado.
Cuando hay condicionales enormes por “modo/estado”.
Cuando necesitas agregar estados sin tocar la clase principal.