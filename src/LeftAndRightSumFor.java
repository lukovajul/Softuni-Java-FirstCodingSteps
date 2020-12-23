import java.util.Scanner;

public class LeftAndRightSumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 1; i<=n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum+=currentNum;
        }
        for (int i = 1; i<=n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum+=currentNum;
        }
        if (leftSum==rightSum){
            System.out.println("Yes, sum = " + leftSum);
        }else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
