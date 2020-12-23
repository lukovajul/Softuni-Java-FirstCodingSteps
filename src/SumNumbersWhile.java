import java.util.Scanner;

public class SumNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int requiredSum = Integer.parseInt(scanner.nextLine());
        int currentNumberSum = 0;

        while (currentNumberSum<requiredSum){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            currentNumberSum+=currentNumber;

        }
        System.out.println(currentNumberSum);
    }
}
