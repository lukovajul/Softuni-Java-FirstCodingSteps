import java.util.Scanner;

public class AverageNumberFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i =1; i<=n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            sum+=input;
        }

        double average = sum*1.0/n;
        System.out.printf("%.2f", average);
    }
}
