package proxy.challenge;

public class Main {
    public static void main(String[] args) {

        MedicalRecordService doctorService = new MedicalRecordServiceProxy(true);

        System.out.println(doctorService.getRecord("P001"));
        System.out.println(doctorService.getRecord("P001"));
        System.out.println(doctorService.getRecord("P002"));

        System.out.println("\n--- Now testing access without permissions ---\n");

        MedicalRecordService guestService = new MedicalRecordServiceProxy(false);

        System.out.println(guestService.getRecord("P001"));
    }
}
