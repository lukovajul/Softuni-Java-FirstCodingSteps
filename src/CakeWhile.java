import java.util.Scanner;

public class CakeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int numberOfPieces = cakeLength * cakeWidth;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            numberOfPieces -= piecesTaken;

            if (numberOfPieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(numberOfPieces));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP") && numberOfPieces > 0) {
            System.out.printf("%d pieces are left.", numberOfPieces);

        }


    }
}
