import java.util.Scanner;

public class SafariExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double fuelPrice = fuelLiters * 2.10;
        double guide = 100;
        double total = fuelPrice + guide;

        if (dayOfWeek.equals("Saturday")){
            total = total*0.9;
        } else if (dayOfWeek.equals("Sunday")){
            total = total*0.8;
        }

        if (budget>=total){
            System.out.printf("Safari time! Money left: %.2f lv.", budget - total);
        } else if (budget<total){
            System.out.printf("Not enough money! Money needed: %.2f lv.", total - budget);
        }

    }
}
