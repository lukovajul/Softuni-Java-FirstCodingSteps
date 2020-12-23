import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCampaign = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffle = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());

        double incomeCakes = cakes * 45;
        double incomeWaffle = waffle * 5.80;
        double incomePancakes = pancake * 3.20;
        double incomePerDay = (incomeCakes + incomeWaffle + incomePancakes) * confectioner;
        double incomePerCampaign = daysCampaign * incomePerDay;
        double finalSum = incomePerCampaign - incomePerCampaign / 8;
        System.out.printf("%.2f", finalSum);



    }
}
