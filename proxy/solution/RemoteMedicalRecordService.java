package proxy.challenge;

/**
 * Servicio real que simula la consulta de expedientes médicos
 * en un servidor remoto del hospital.
 *
 * IMPORTANTE: No debe modificarse. Cualquier regla extra se agrega
 * a través del Proxy.
 */
public class RemoteMedicalRecordService implements MedicalRecordService {

    @Override
    public String getRecord(String patientId) {
        System.out.println("Fetching record from hospital server for: " + patientId);
        // Simulamos que aquí habría lógica costosa de acceso remoto
        return "Record of " + patientId + " ...";
    }
}
