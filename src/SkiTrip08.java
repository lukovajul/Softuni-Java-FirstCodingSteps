import java.util.Scanner;

public class SkiTrip08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (room) {
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                price = nights * 25;
                break;
            case "president apartment":
                price = nights * 35;
                break;

        }
        switch (room) {
            case "apartment":
                if (nights < 10) {
                    price = price - 0.3 * price;

                } else if (nights >= 10 && nights <= 15) {
                    price = price - 0.35 * price;

                } else if (nights > 15) {
                    price = price - 0.5 * price;

                }
                break;
            case "president apartment":
                if (nights < 10) {
                    price = price - 0.1 * price;

                } else if (nights >= 10 && nights <= 15) {
                    price = price - 0.15 * price;

                } else if (nights > 15) {
                    price = price - 0.2 * price;

                }
                break;

        }
        if (grade.equals("positive")){
            price = price + 0.25*price;
        }else {
            price = price - 0.1*price;
        }
        System.out.printf("%.2f", price);
    }
}
