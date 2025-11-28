# Reto (Proxy)

## Instrucciones

Refactoriza el código para que el cliente **no acceda directamente** a `RemoteMedicalRecordService`.  
Implementa el patrón **Proxy** para:

1. Controlar acceso por permisos (solo doctores pueden ver expedientes).  
2. Cachear resultados para no consultar dos veces el mismo paciente.  
3. Mantener al cliente desacoplado del servicio real (principio de inversión de dependencias).

Tu solución debe permitir **agregar nuevas reglas de acceso o cache sin modificar** `RemoteMedicalRecordService`, aplicando el **principio abierto/cerrado (OCP)**.

---

## Código a Refactorizar

### Archivo: `challenge/MedicalRecordService.java`

```java
package proxy.challenge;

public interface MedicalRecordService {
    String getRecord(String patientId);
}
```

### Archivo: `challenge/RemoteMedicalRecordService.java`

```java
package proxy.challenge;

public class RemoteMedicalRecordService implements MedicalRecordService {
    @Override
    public String getRecord(String patientId) {
        System.out.println("Fetching record from hospital server for: " + patientId);
        return "Record of " + patientId + " ...";
    }
}
```

### Archivo: `challenge/Main.java`

```java
package proxy.challenge;

public class Main {
    public static void main(String[] args) {
        MedicalRecordService service = new RemoteMedicalRecordService();

        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P002"));
    }
}
```

---

## Tips

 **Evita tocar el servicio real**  
`RemoteMedicalRecordService` simula una clase externa o de un tercero.  
No debes modificarla, solo envolverla con un Proxy.

 **El cliente debe depender de una abstracción**  
`Main` solo debería conocer `MedicalRecordService`, no la clase concreta.  
Así podrás cambiar entre servicio real y proxy sin modificar el cliente.

 **Piensa en el Proxy como un “guardia + memoria”**

- **Guardia:** valida permisos (rol del usuario).  
- **Memoria:** cachea resultados para no repetir consultas al servidor.

---

## Recursos adicionales

### ¿Cuándo usar Proxy?

- Acceso a recursos **remotos o costosos**  
- **Validación de permisos**  
- **Cache / lazy loading**  
- **Logging y auditoría**  

🧠 **Idea clave:**  
El Proxy **implementa la misma interfaz** que el servicio real,  
así el cliente no nota la diferencia y puedes agregar lógica extra sin modificar clases existentes.



## Challenge

Para poner en práctica el patrón State, consulta el **README del challenge** que contiene un ejercicio práctico donde deberás refactorizar un sistema lleno de condicionales para que cada estado esté completamente encapsulado.

---

## Recursos Adicionales

- [Refactoring Guru – proxy Pattern](https://refactoring.guru/design-patterns/proxy)  
- [Source Making – proxy Pattern](https://sourcemaking.com/design_patterns/proxy)
