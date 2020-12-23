import java.util.Scanner;

public class Exam06PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCompanies = Integer.parseInt(scanner.nextLine());
        int sumPassengersAllFlights = 0;
        int countFlights = 0;

        int maxNumber = Integer.MIN_VALUE;

        while (true){
            String nameCompany = scanner.nextLine();
            if (nameCompany.equals("Finish")){
                break;
            }

            int sumPassengersPerFlight = 0;

            for (int i = 1; i<=numberCompanies; i++){
                int numberPassengersFlight = Integer.parseInt(scanner.nextLine());
                sumPassengersPerFlight+=numberPassengersFlight;
                sumPassengersAllFlights+=numberPassengersFlight;
                countFlights++;

            }
            int averagePerFlight = sumPassengersPerFlight/countFlights;
            System.out.printf("%s: %d%n passengers.", nameCompany, averagePerFlight);

            if (averagePerFlight==maxNumber){
                System.out.printf("%s has most passengers per flight: %d%n", nameCompany,maxNumber);
            }
        }



    }
}
