import java.util.Scanner;

public class HalfSumElementClass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sumAll = 0;

        for (int i = 1; i<=n; i++){
            int value = Integer.parseInt(scanner.nextLine());
            sumAll = sumAll + value;
            if (value > max){
                max = value;
            }

        }
        int sumOthers = sumAll - max;
        if (max == sumOthers){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sumOthers));
        }
    }
}
