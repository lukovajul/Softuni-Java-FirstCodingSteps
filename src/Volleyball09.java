import java.util.Scanner;

public class Volleyball09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHomeTown = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - weekendsHomeTown;
        double gamesSofia = weekendsInSofia * (3.0 / 4);
        int gamesHomeTown = weekendsHomeTown;
        double gamesHolidays = holidays * (2.0 / 3);
        double allGames = gamesSofia + gamesHomeTown + gamesHolidays;
        if (year.equals("leap")) {
            allGames = allGames * 1.15;
        }else{
            allGames = allGames * 1;
        }
        System.out.println(Math.floor(allGames));

    }
}