import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // време за плуване = разстояния * времето за 1 метър
        // време за забавяне = колко пъти се забавя (разстоянието /15 )* 12,5 и закръгляме надолу
        //времето на Иван = време за плуване + време забявяне
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance * timePerMeter;
        double delayTime = Math.floor(distance / 15) * 12.5;
        double totalTime = swimmingTime + delayTime;

        if (totalTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else{
            double needSeconds = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needSeconds);
        }

    }
}
