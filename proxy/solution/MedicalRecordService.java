package proxy.challenge;

/**
 * Abstracción que representa el servicio de expedientes médicos.
 * El cliente solo debe depender de esta interfaz.
 */
public interface MedicalRecordService {
    String getRecord(String patientId);
}
