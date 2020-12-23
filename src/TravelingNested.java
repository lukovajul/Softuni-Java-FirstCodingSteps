import java.util.Scanner;

public class TravelingNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double allMoney = 0;

            while (minimalBudget>allMoney){
                double currentMoney = Double.parseDouble(scanner.nextLine());

                allMoney = allMoney + currentMoney;
            }

            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();


        }
    }
}
