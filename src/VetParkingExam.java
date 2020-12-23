import java.util.Scanner;

public class VetParkingExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        //double parkingCost = 0;

        double totalPrice = 0;


        for (int i = 1; i<=days; i++){
            double costDay = 0;
            for (int h = 1; h<=hours; h++){
                if (i%2==0 && h%2!=0){
                    costDay += 2.50;
                }else  if (i%2!=0 && h%2==0){
                    costDay += 1.25;
                }else {
                    costDay += 1.00;
                }

            }
            System.out.printf("Day: %d - %.2f leva%n",i, costDay);
            totalPrice+=costDay;

        }

        System.out.printf("Total: %.2f leva%n", totalPrice);

    }
}
