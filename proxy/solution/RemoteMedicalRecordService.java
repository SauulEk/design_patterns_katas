package proxy.challenge;

public class RemoteMedicalRecordService implements MedicalRecordService {

    @Override
    public String getRecord(String patientId) {
        System.out.println("Fetching record from hospital server for: " + patientId);
        return "Record of " + patientId;
    }
}
