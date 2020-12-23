import java.util.Scanner;

public class MatchTicket09ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        switch (category){
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
        }
        double amountTickets = people * ticketPrice;
        double budgetTransport = 0;

        if (people>=1 && people<=4){
            budgetTransport = budget * 0.75;

        }else if (people>=5 && people <=9){
            budgetTransport = budget * 0.6;
        }else if (people>=10 && people<=24){
            budgetTransport = budget * 0.5;
        }else if (people>=25 && people<=49){
            budgetTransport = budget * 0.4;
        }else if (people>=50){
            budgetTransport = budget * 0.25;
        }
        double leftMoney = budget - budgetTransport;
        double leftMoneyFinal = leftMoney - amountTickets;
        double amountNeeded = amountTickets - leftMoney;
        if (leftMoney>=amountTickets){
            System.out.printf("Yes! You have %.2f leva left.", leftMoneyFinal);
        }else if (leftMoney<amountTickets){
            System.out.printf("Not enough money! You need %.2f leva.", amountNeeded);
        }
    }
}
