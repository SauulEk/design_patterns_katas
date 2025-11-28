package proxy.challenge;

/**
 * Cliente que ahora trabaja únicamente con la abstracción MedicalRecordService,
 * sin conocer si está usando el servicio real o el proxy.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Doctor usando el Proxy ===\n");
        MedicalRecordService doctorService = new MedicalRecordServiceProxy(true);

        System.out.println(doctorService.getRecord("P001"));
        System.out.println(doctorService.getRecord("P001")); // Debe salir del cache
        System.out.println(doctorService.getRecord("P002"));

        System.out.println("\n=== Usuario sin permisos usando el Proxy ===\n");
        MedicalRecordService guestService = new MedicalRecordServiceProxy(false);

        System.out.println(guestService.getRecord("P001")); // ACCESS DENIED
    }
}
