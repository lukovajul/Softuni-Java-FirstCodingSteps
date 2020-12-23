import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour= Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());

        int startTimeMinutes = startHour * 60 + startMinutes;
        int timeAfter15Minutes = startTimeMinutes + 15; //времето в минути след добавянето

        int finalHour = timeAfter15Minutes / 60;
        int finalMinutes = timeAfter15Minutes % 60;

        if (finalHour == 24){
            finalHour = 0;
        }
        System.out.printf("%d:%02d", finalHour, finalMinutes);

    }
}
