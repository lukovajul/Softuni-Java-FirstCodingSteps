import java.util.Scanner;

public class Exam05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int excursionSea = Integer.parseInt(scanner.nextLine());
        int excursionsMountain = Integer.parseInt(scanner.nextLine());

        int totalProfit = 0;
        int profitSea = 0;
        int profitMountain = 0;


        while (true) {
            String currentExcursion = scanner.nextLine();

            if (currentExcursion.equals("sea") && excursionSea > 0) {
                profitSea += 680;
                excursionSea--;
            } else if (currentExcursion.equals("mountain") && excursionsMountain > 0) {
                profitMountain += 499;
                excursionsMountain--;
            }

            if (currentExcursion.equals("Stop")) {
                break;
            }
            totalProfit = profitSea + profitMountain;



            if (excursionsMountain == 0 && excursionSea == 0) {
                System.out.println("Good job! Everything is sold.");
                System.out.printf("Profit: %d leva.", totalProfit);
            }

        }
        System.out.printf("Profit: %d leva.", totalProfit);


    }

}

