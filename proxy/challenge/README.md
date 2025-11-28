# Kata: Proxy

##  Contexto

Estás trabajando en un sistema de **expedientes médicos** donde el cliente se conecta a un servicio remoto llamado `RemoteMedicalRecordService`.  
Ese servicio se encarga de **consultar los expedientes** desde el servidor del hospital.

Actualmente:

- El cliente crea directamente una instancia de `RemoteMedicalRecordService`.
- Cada llamada hace una consulta “remota” costosa.
- No hay **control de acceso** ni **cache**.

Tu objetivo es aplicar el patrón **Proxy** para solucionar estos problemas.

---

## Objetivo del Reto

Refactorizar el código para que el cliente **no acceda directamente** al `RemoteMedicalRecordService`, sino a través de un **Proxy** que:

1. **Controle el acceso por permisos**
2. **Implemente cache de resultados**
3. **Desacople al cliente del servicio concreto**

Además, la solución debe permitir agregar nuevas reglas sin modificar el servicio real (**OCP**).

---

##  Código Base

### `MedicalRecordService.java`
```java
public interface MedicalRecordService {
    String getRecord(String patientId);
}
```

### `RemoteMedicalRecordService.java`
```java
public class RemoteMedicalRecordService implements MedicalRecordService {
    @Override
    public String getRecord(String patientId) {
        System.out.println("Fetching record from hospital server for: " + patientId);
        return "Record of " + patientId + " ...";
    }
}
```

### `Main.java`
```java
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

##  Lo que debes hacer

1. Crear el **Proxy**  
2. Agregar **control de acceso**  
3. Implementar **cache interno**  
4. Refactorizar `Main` para usar el Proxy  
5. No modificar `RemoteMedicalRecordService`

---

## ¿Cuándo usar Proxy?

- Acceso remoto o costoso  
- Cache o lazy loading  
- Control de permisos  
- Logging y auditoría  
