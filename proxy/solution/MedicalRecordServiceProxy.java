package proxy.challenge;

import java.util.HashMap;
import java.util.Map;

public class MedicalRecordServiceProxy implements MedicalRecordService {

    private MedicalRecordService realService;
    private boolean isDoctor;

    private Map<String, String> cache = new HashMap<>();

    public MedicalRecordServiceProxy(boolean isDoctor) {
        this.isDoctor = isDoctor;
        this.realService = new RemoteMedicalRecordService();
    }

    @Override
    public String getRecord(String patientId) {

        if (!isDoctor) {
            return "ACCESS DENIED: You do not have permission to view this record.";
        }

        if (cache.containsKey(patientId)) {
            System.out.println("Returning cached record for: " + patientId);
            return cache.get(patientId);
        }

        String record = realService.getRecord(patientId);
        cache.put(patientId, record);
        return record;
    }
}
