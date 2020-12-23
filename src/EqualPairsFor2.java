import java.util.Scanner;

public class EqualPairsFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int lastValue = 0;
        int diff = 0;
       // int min = Integer.MAX_VALUE;
       // int max = Integer.MIN_VALUE;

        for (int i=1; i<=n; i++) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            value = first + second;

            if (i > 1) {
                diff = Math.abs(lastValue - value);
            }
            lastValue = value;
        }

            if (diff==0){
                System.out.printf("Yes, value=%d%n", lastValue);
            }else {
                System.out.printf("No, maxdiff=%d", diff);
            }


        }

    }

