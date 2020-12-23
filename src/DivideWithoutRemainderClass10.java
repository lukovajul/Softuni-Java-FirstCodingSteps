import java.util.Scanner;

public class DivideWithoutRemainderClass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int divide2 = 0;
        int divide3 = 0;
        int divide4 = 0;

        for (int i = 1; i<=n; i++){
            int value = Integer.parseInt(scanner.nextLine());
            if (value%2 == 0){
                divide2+=1;
            }
            if (value%3 == 0){
                divide3+=1;
            }
            if (value%4 == 0){
                divide4+=1;
            }

        }
        double percent2 = divide2 * 1.0/n * 100;
        double percent3 = divide3*1.0/n * 100;
        double percent4 = divide4*1.0/n * 100;

        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%", percent4);
    }
}
