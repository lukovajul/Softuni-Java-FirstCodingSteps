import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interestPerYear = depositSum * (percent / 100); //натрупаната лихва за година в процент, трябва да се дели на 100
        double interestMonth = interestPerYear / 12;
        double sum = depositSum + months * interestMonth;
        System.out.println(sum);

    }
}
