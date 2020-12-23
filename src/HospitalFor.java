import java.util.Scanner;

public class HospitalFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i<=period; i++){
            int patientsPerDay = Integer.parseInt(scanner.nextLine());
            if (i%3 == 0 && untreatedPatients > treatedPatients){
                doctors++;
            }

            if (patientsPerDay<doctors){
                int patients = 0;
                patients = patientsPerDay;
                treatedPatients = treatedPatients + patients;
            }else{
                treatedPatients = treatedPatients + doctors;
            }
            if (patientsPerDay>doctors){
                untreatedPatients = untreatedPatients + (patientsPerDay - doctors);
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

    }
}
