import java.util.Scanner;

public class CleverLilyFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int moneyYears = 0;
        int moneyBrother = 0;
        int toyCount = 0;
        int saved = 0;

        for (int i = 1; i<=age; i++){
            if (i%2==0){
                money+=10;
                saved = saved + money;
                moneyYears++;
                moneyBrother=moneyYears * 1;
            }else if (i%2!=0){
                toyCount+=1;
            }

        }
        int sumToys = toyCount * priceToy;
        int totalMoneySaved = saved + sumToys - moneyBrother;
        double diff = totalMoneySaved-priceWashingMachine;
        if (totalMoneySaved>=priceWashingMachine){
            System.out.printf("Yes! %.2f",Math.abs(diff));
        }else if (priceWashingMachine>totalMoneySaved){
            System.out.printf("No! %.2f", Math.abs(diff));
        }
    }
}
