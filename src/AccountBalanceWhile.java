import java.util.Scanner;

public class AccountBalanceWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;

        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")){
            double currentAmount = Double.parseDouble(input);
            if (currentAmount<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",currentAmount);
            totalMoney += currentAmount;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
