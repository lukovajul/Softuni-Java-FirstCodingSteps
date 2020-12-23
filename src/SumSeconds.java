import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = firstTime + secondTime + thirdTime;
        int timeInMinutes = totalTimeSeconds / 60;
        int timeInSeconds = totalTimeSeconds % 60;
        if (timeInSeconds < 10){
            System.out.println(timeInMinutes + ":0" + timeInSeconds);
        } else{
            System.out.println(timeInMinutes + ":" + timeInSeconds);
        }
// друг вариант: System.out.printf("%d:0%d", minutes, seconds) или System.out.printf("%d:%02d", minutes, seconds)
        // else System.out.printf("%d:%d", minutes, seconds)

    }
}
