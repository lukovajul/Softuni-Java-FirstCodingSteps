import java.util.Scanner;

public class BillsFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double waterMonthly = 20;
        double waterAllMonths = waterMonthly*months;
        double internetMonthly = 15;
        double internetAllMonths = internetMonthly*months;

        double totalElectricity = 0;
        double othersMonthly = 0;
        double othersAllMonths = 0;

        for (int i = 1; i<=months; i++){
            double electricityMonthly = Double.parseDouble(scanner.nextLine());
            totalElectricity+=electricityMonthly;
            othersMonthly = (waterMonthly+internetMonthly+electricityMonthly)*0.2 + (waterMonthly+internetMonthly+electricityMonthly);
            othersAllMonths+=othersMonthly;
        }

        double average = (totalElectricity+waterAllMonths+internetAllMonths+othersAllMonths)/months;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", waterAllMonths);
        System.out.printf("Internet: %.2f lv%n", internetAllMonths);
        System.out.printf("Other: %.2f lv%n", othersAllMonths);
        System.out.printf("Average: %.2f lv%n", average);




    }
}
