import java.util.Scanner;

public class RectangleOfNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i<=n; i++){
            for (int y = 1; y<=n; y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
