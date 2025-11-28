package proxy.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Proxy que controla el acceso al RemoteMedicalRecordService y
 * agrega cache para evitar consultas repetidas costosas.
 */
public class MedicalRecordServiceProxy implements MedicalRecordService {

    private final MedicalRecordService realService;
    private final boolean isDoctor;
    private final Map<String, String> cache = new HashMap<>();

    /**
     * @param isDoctor indica si el usuario actual tiene permisos de doctor
     */
    public MedicalRecordServiceProxy(boolean isDoctor) {
        this.isDoctor = isDoctor;
        this.realService = new RemoteMedicalRecordService();
    }

    @Override
    public String getRecord(String patientId) {
        // 1. Control de acceso
        if (!isDoctor) {
            return "ACCESS DENIED: You do not have permission to view this record.";
        }

        // 2. Cache en memoria
        if (cache.containsKey(patientId)) {
            System.out.println("Returning cached record for: " + patientId);
            return cache.get(patientId);
        }

        // 3. Delegar al servicio real y guardar en cache
        String record = realService.getRecord(patientId);
        cache.put(patientId, record);
        return record;
    }
}
