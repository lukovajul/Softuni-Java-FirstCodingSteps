import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int actor = Integer.parseInt(scanner.nextLine());
        double priceOutfitActor = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double amountOutfit = actor * priceOutfitActor;
        if (actor>150){
            amountOutfit = amountOutfit - amountOutfit * 0.10;
        }
        double totalAmountFilm = decor + amountOutfit;
        double remainingAmountFilm = budget - totalAmountFilm;
        if (budget>=totalAmountFilm){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainingAmountFilm);
        }else {
            System.out.println("Not enough money!");
            double moneyNeeded = totalAmountFilm - budget;
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }
    }
    }

