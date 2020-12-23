import java.util.Scanner;

public class FootballLeagueFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numberOfAllFans = Integer.parseInt(scanner.nextLine());

        int fansSectorA = 0;
        int fansSectorB = 0;
        int fansSectorV = 0;
        int fansSectorG = 0;

        for (int i = 1; i<=numberOfAllFans; i++){
            String sector = scanner.nextLine();
            //char sec = scanner.next().charAt(0);
            if (sector.equals("A")){
                fansSectorA++;
            }else if (sector.equals("B")){
                fansSectorB++;
            }else if (sector.equals("V")){
                fansSectorV++;
            }else if (sector.equals("G")){
                fansSectorG++;
            }
        }

        double percentSectorA = fansSectorA*1.0/numberOfAllFans*100;
        double percentSectorB = fansSectorB*1.0/numberOfAllFans*100;
        double percentSectorV = fansSectorV*1.0/numberOfAllFans*100;
        double percentSectorG = fansSectorG*1.0/numberOfAllFans*100;
        double percentAllFans = numberOfAllFans*1.0/stadiumCapacity*100;

        System.out.printf("%.2f%%%n", percentSectorA);
        System.out.printf("%.2f%%%n", percentSectorB);
        System.out.printf("%.2f%%%n", percentSectorV);
        System.out.printf("%.2f%%%n", percentSectorG);
        System.out.printf("%.2f%%%n", percentAllFans);


    }
}
