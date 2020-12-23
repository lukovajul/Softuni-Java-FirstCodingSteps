import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double P1Hours = P1 * H;
        double P2Hours = P2 * H;
        double totalFill = P1Hours + P2Hours;
        double totalFillPercent = totalFill / V * 100;
        double P1Percent = P1Hours / totalFill * 100;
        double P2Percent = P2Hours / totalFill * 100;
        double overflow = totalFill - V;
        if (totalFill <= V) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalFillPercent, P1Percent, P2Percent);
        } else {
            System.out.printf("For %.02f hours the pool overflows with %.02f liters.", H, overflow);
        }

    }
}
