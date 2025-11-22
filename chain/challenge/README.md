Reto (Chain Of Responsibility)
Instrucciones
Refactoriza el sistema de validación de solicitudes para que no esté en un solo método gigante.
Implementa Chain Of Responsibility para que:
Cada validación sea un “handler” independiente.
La solicitud pase por una cadena de validadores.
Puedas agregar nuevas reglas sin modificar validadores existentes (OCP).
Código a Refactorizar
Archivo: challenge/RequestValidator.java
package chain.challenge;

public class RequestValidator {

    public boolean validate(Request request) {
        if (request == null) {
            System.out.println("Rejected: null request");
            return false;
        }

        if (request.getUser() == null || request.getUser().isEmpty()) {
            System.out.println("Rejected: missing user");
            return false;
        }

        if (request.getAmount() <= 0) {
            System.out.println("Rejected: invalid amount");
            return false;
        }

        if (request.getAmount() > 5000) {
            System.out.println("Rejected: amount too high");
            return false;
        }

        System.out.println("Request accepted ");
        return true;
    }
}
Archivo: challenge/Request.java
package chain.challenge;

public class Request {
    private String user;
    private double amount;

    public Request(String user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() { return user; }
    public double getAmount() { return amount; }
}
Archivo: challenge/Main.java
package chain.challenge;

public class Main {
    public static void main(String[] args) {
        RequestValidator validator = new RequestValidator();

        validator.validate(new Request("", 100));
        validator.validate(new Request("Nancy", 7000));
        validator.validate(new Request("Nancy", 500));
    }
}
Tips
 Divide reglas en clases pequeñas
Ejemplo: NullRequestHandler, UserHandler, AmountHandler, etc.
 Cada handler decide
si rechaza
o pasa al siguiente con next.handle(request).
 Cadena dinámica
El orden de reglas debe armarse desde Main o un builder.
Recursos adicionales
¿Cuándo usar Chain of Responsibility?
Validaciones paso a paso.
Pipelines configurables.
Cuando quieres evitar métodos con muchos if-else secuenciales.