import java.util.Scanner;

public class Sequence2KWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        while (currentNumber<=n){
            System.out.println(currentNumber);
            currentNumber = currentNumber * 2 + 1;
        }

    }
}
