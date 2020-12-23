import java.util.Scanner;

public class NewHouse09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//крайна цена
        //отстъпка
        //проверка на бюджета
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;

        switch (flowerType){
            case "Roses":
                finalPrice = flowerCount * 5;
                if (flowerCount>80){
                    finalPrice = finalPrice - 0.10 * finalPrice;
                    //finalPrice = 0.90 * finalPrice;
                }
                break;
            case "Dahlias":
                finalPrice = flowerCount * 3.80;
                if (flowerCount>90){
                    finalPrice = finalPrice - 0.15 * finalPrice;
                    //finalPrice = 0.85 * finalPrice;
                }
                break;
            case "Tulips":
                finalPrice = flowerCount * 2.80;
                if (flowerCount>80){
                    finalPrice = 0.85 * finalPrice;
                }
                break;
            case "Narcissus":
                finalPrice = flowerCount * 3;
                if (flowerCount<120){
                    finalPrice = finalPrice + 0.15 * finalPrice;
                    //finalPrice = 1.15 * finalPrice;
                }
                break;
            case "Gladiolus":
                finalPrice = flowerCount * 2.50;
                if (flowerCount<80){
                    finalPrice = 1.20 * finalPrice;
                }
                break;

        }
        if (budget>=finalPrice){
            double leftMoney = budget - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
        }else{
            double needMoney = finalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }

    }
}
