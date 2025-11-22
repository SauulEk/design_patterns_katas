Reto (Proxy)
Instrucciones
Refactoriza el código para que el cliente no acceda directamente a RemoteMedicalRecordService.
Implementa el patrón Proxy para:
Controlar acceso por permisos (solo doctores pueden ver expedientes).
Cachear resultados para no consultar dos veces el mismo paciente.
Mantener al cliente desacoplado del servicio real (principio de inversión de dependencias).
Tu solución debe permitir agregar nuevas reglas de acceso o cache sin modificar RemoteMedicalRecordService, aplicando OCP.
Código a Refactorizar
Archivo: challenge/MedicalRecordService.java
package proxy.challenge;

public interface MedicalRecordService {
    String getRecord(String patientId);
}
Archivo: challenge/RemoteMedicalRecordService.java
package proxy.challenge;

public class RemoteMedicalRecordService implements MedicalRecordService {
    @Override
    public String getRecord(String patientId) {
        System.out.println("Fetching record from hospital server for: " + patientId);
        return "Record of " + patientId + " ...";
    }
}
Archivo: challenge/Main.java
package proxy.challenge;

public class Main {
    public static void main(String[] args) {
        MedicalRecordService service = new RemoteMedicalRecordService();

        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P002"));
    }
}
Tips
Evita tocar el servicio real
RemoteMedicalRecordService simula una clase externa. No debes modificarla.
 El cliente debe depender de una abstracción
El Main solo debería conocer MedicalRecordService, no la clase real.
 Piensa en el Proxy como un “guardia + memoria”
Guardia: valida permisos.
Memoria: guarda resultados para no repetir consultas.
Recursos adicionales
¿Cuándo usar Proxy?
Acceso a recursos remotos o costosos
Validación de permisos
Cache / lazy loading
Logging y auditoría
Idea clave:
El Proxy implementa la misma interfaz que el servicio real, así el cliente no nota la diferencia.