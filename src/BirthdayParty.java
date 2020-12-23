import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = 0.2 * hallPrice;
        double drinks = 0.55 * cakePrice;
        double animator = hallPrice/3.0;

        double expenses = hallPrice + cakePrice + drinks + animator;
        System.out.println(expenses);


    }
}

