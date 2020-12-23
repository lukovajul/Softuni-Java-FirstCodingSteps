import java.util.Scanner;

public class FoodDeliveryExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegMenus = Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenus * 10.35;
        double priceFish = fishMenus * 12.40;
        double priceVeg = vegMenus * 8.15;

        double totalPriceMenus = priceChicken + priceFish + priceVeg;
        double dessertPrice = totalPriceMenus * 0.2;
        double delivery = 2.50;

        double totalOrder = totalPriceMenus + dessertPrice + delivery;

        System.out.printf("Total: %.2f", totalOrder);
    }
}
