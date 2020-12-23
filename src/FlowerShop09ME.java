import java.util.Scanner;

public class FlowerShop09ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        int amountFlowers = chrysanthemum + roses + tulips;
        double priceChrysanthemum = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double priceBouquet = 0;


        switch (season) {
            case "Spring":
                priceChrysanthemum = 2;
                priceRoses = 4.10;
                priceTulips = 2.50;
                priceBouquet  = (priceChrysanthemum * chrysanthemum) + (priceRoses * roses) + (priceTulips * tulips);
                switch (holiday) {
                    case "Y":
                        priceBouquet = priceBouquet * 1.15;
                        break;
                    case "N":
                        priceBouquet = priceBouquet * 1;
                        break;
                }
                if (tulips > 7) {
                    priceBouquet = priceBouquet * 0.95;
                }
                break;
            case "Summer":
                priceChrysanthemum = 2;
                priceRoses = 4.10;
                priceTulips = 2.50;
                priceBouquet  = (priceChrysanthemum * chrysanthemum) + (priceRoses * roses) + (priceTulips * tulips);
                switch (holiday) {
                    case "Y":
                        priceBouquet = priceBouquet * 1.15;
                        break;
                    case "N":
                        priceBouquet = priceBouquet * 1;
                        break;
                }
                break;
            case "Autumn":
                priceChrysanthemum = 3.75;
                priceRoses = 4.50;
                priceTulips = 4.15;
                priceBouquet  = (priceChrysanthemum * chrysanthemum) + (priceRoses * roses) + (priceTulips * tulips);
                switch (holiday) {
                    case "Y":
                        priceBouquet = priceBouquet * 1.15;
                        break;
                    case "N":
                        priceBouquet = priceBouquet * 1;
                        break;
                }
                break;
            case "Winter":
                priceChrysanthemum = 3.75;
                priceRoses = 4.50;
                priceTulips = 4.15;
                priceBouquet  = (priceChrysanthemum * chrysanthemum) + (priceRoses * roses) + (priceTulips * tulips);
                switch (holiday) {
                    case "Y":
                        priceBouquet = priceBouquet * 1.15;
                        break;
                    case "N":
                        priceBouquet = priceBouquet * 1;
                        break;
                }
            if (roses > 10) {
                priceBouquet = priceBouquet * 0.9;
            }
            break;

        }
        if (amountFlowers > 20) {
            priceBouquet = priceBouquet * 0.8;
        }


        System.out.printf("%.2f", priceBouquet + 2);


    }
}
