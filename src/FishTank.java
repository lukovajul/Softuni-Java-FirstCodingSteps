import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCM = Integer.parseInt(scanner.nextLine());
        int widthCM = Integer.parseInt(scanner.nextLine());
        int heightCM = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = lengthCM * heightCM * widthCM;
        double litres = volume * 0.001;
        double percentFull = percent * 0.01;
        double litresNeeded = litres * (1-percentFull);

        System.out.printf("%.2f", litresNeeded);







    }
}
