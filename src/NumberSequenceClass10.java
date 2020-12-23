import java.util.Scanner;

public class NumberSequenceClass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE; //Дава максималната възможна стойност на integer; търсим най-малкото число от въведените от потребителя, което винаги ще е по-малко от максималната възможна стойност на integer
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber<min){
                min = currentNumber;
            }
            if (currentNumber>max){
                max = currentNumber;
            }

        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
