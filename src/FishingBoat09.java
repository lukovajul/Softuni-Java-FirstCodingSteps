import java.util.Scanner;

public class FishingBoat09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double rent = 0;
        switch (season){
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
        }

        if (count<=6){
            rent = rent - 0.10 * rent; //or rent = 0.9 * rent
            //rent -= 0.10 * rent

        }else if (count>=7 && count <=11){
            rent = rent - 0.15 * rent; //or rent = 0.85 * rent
            //rent -= 0.15 * rent
        }else if (count>=12){
            rent = rent - 0.25 * rent; //or rent = 0.75 * rent
            //rent -= 0.25 * rent
        }

        if (count % 2 == 0 && !season.equals("Autumn")){
            rent = rent - 0.05 * rent;
        }

        if (budget>=rent){
            double leftMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        }else {
            double needMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }

    }
}
