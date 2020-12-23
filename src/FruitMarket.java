import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double bananasKG = Double.parseDouble(scanner.nextLine());
        double orangesKG = Double.parseDouble(scanner.nextLine());
        double raspberriesKG = Double.parseDouble(scanner.nextLine());
        double strawberriesKG = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries - 0.50 * priceStrawberries;
        double priceOranges = priceRaspberries - 0.40 * priceRaspberries;
        double priceBananas = priceRaspberries - 0.80 * priceRaspberries;

        double sumStrawberries = priceStrawberries * strawberriesKG;
        double sumBananas = priceBananas * bananasKG;
        double sumOranges = priceOranges * orangesKG;
        double sumRaspberries = priceRaspberries * raspberriesKG;

        double totalAmount = sumStrawberries + sumBananas + sumOranges + sumRaspberries;

        System.out.printf("%.2f", totalAmount);


    }
}
