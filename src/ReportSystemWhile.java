import java.util.Scanner;

public class ReportSystemWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int transactionCash = 0;
        int transactionCard = 0;
        int totalCash = 0;
        int totalCard = 0;
        int totalAmountSold = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int priceProduct = Integer.parseInt(command);
            count++;

            if (count % 2 != 0 && priceProduct <= 100) {
                transactionCash++;
                totalCash += priceProduct;
                System.out.println("Product sold!");
            } else if (count % 2 == 0 && priceProduct >= 10) {
                transactionCard++;
                totalCard += priceProduct;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }


            totalAmountSold = totalCash + totalCard;
            double averageCash = totalCash*1.0/transactionCash;
            double averageCard = totalCard*1.0/transactionCard;
            if (totalAmountSold >= amount) {
                System.out.printf("Average CS: %.2f%n", averageCash);
                System.out.printf("Average CC: %.2f", averageCard);
                break;
            }

            command = scanner.nextLine();

        }
        if (command.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}