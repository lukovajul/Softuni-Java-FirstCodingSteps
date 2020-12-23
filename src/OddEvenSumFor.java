import java.util.Scanner;

public class OddEvenSumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;//четно
        int sumOdd = 0;

        for (int i = 1; i<=n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i%2 == 0){
                sumEven+=currentNum;
            }else{
                sumOdd+=currentNum;
            }
        }
        if (sumEven==sumOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d%n",sumEven);

        }else{
            int difference = Math.abs(sumEven-sumOdd);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }

    }
}
