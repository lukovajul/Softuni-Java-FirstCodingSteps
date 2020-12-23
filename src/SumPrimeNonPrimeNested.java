import java.util.Scanner;

public class SumPrimeNonPrimeNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);
            if (number < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }

            // преди да проверим дали е просто, проверяваме дали е отрицателно
// проверка дали числото е просто
            // просто число има само 2 делителя без остатък - 1 и самото число
            int count = 0;
            for (int i = 1; i <= number; i++) {
                // преминаваме през всички числа от 1 до моето
                if (number % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                // числото е просто
                sumPrime += number;
            } else if (count > 2) {
                // числото е съставно или непросто
                sumNonPrime += number;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}

