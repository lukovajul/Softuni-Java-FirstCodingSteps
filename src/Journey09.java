import java.util.Scanner;

public class Journey09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacation = "";
        double moneySpent = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            System.out.printf("Somewhere in %s%n", destination);
            if (season.equals("summer")){
                vacation = "Camp";
                moneySpent = budget - 0.7 * budget;
            } else if (season.equals("winter")){
                vacation = "Hotel";
                moneySpent = budget - 0.3 * budget;
            }
            System.out.printf("%s - %.2f", vacation, moneySpent);
        } else if (budget <= 1000) {
            destination = "Balkans";
            System.out.printf("Somewhere in %s%n", destination);
            if (season.equals("summer")){
                vacation = "Camp";
                moneySpent = budget - 0.6 * budget;
            }else if (season.equals("winter")){
                vacation = "Hotel";
                moneySpent = budget - 0.2 * budget;
            }
            System.out.printf("%s - %.2f", vacation, moneySpent);
        } else if (budget > 1000) {
            destination = "Europe";
            System.out.printf("Somewhere in %s%n", destination);
            if (season.equals("summer")){
                vacation = "Hotel";
                moneySpent = budget - 0.1 * budget;
            }else if (season.equals("winter")){
                vacation = "Hotel";
                moneySpent = budget - 0.1 * budget;
            }
            System.out.printf("%s - %.2f", vacation, moneySpent);
        }
    }
}
