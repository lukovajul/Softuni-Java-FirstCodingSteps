import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int lorries = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double lorriesPrice = lorries * 2;

        double amountToys = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + lorriesPrice;
        int sumToys = puzzles + dolls + bears + minions + lorries;

        if (sumToys >= 50){
            amountToys = amountToys - amountToys * 0.25;
        }
       double moneyForRent = amountToys * 0.10;
        double profit = amountToys - moneyForRent;
        if (profit >= excursionPrice){
            double moneyLeft = profit - excursionPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }
        else{
            double missingMoney = excursionPrice - profit;
            System.out.printf("Not enough money! %.2f lv needed.", missingMoney);

        }
        }


    }

