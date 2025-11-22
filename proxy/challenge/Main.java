package proxy.challenge;

public class Main {
    public static void main(String[] args) {
        MedicalRecordService service = new RemoteMedicalRecordService();

        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P001"));
        System.out.println(service.getRecord("P002"));
    }
}