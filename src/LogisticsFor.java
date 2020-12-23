import java.util.Scanner;

public class LogisticsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLoads = Integer.parseInt(scanner.nextLine());
        double sumLoads = 0;
        double microbus = 0;
        double lorry = 0;
        double train = 0;
        int priceMicrobus = 0;
        int priceLorry = 0;
        int priceTrain = 0;
        double allTons = 0;
        double allTonsAverage = 0;

        for (int i = 1; i<=numberLoads; i++){
            int tonLoad = Integer.parseInt(scanner.nextLine());
            sumLoads += tonLoad;
            if (tonLoad<=3){
                microbus += tonLoad;
                priceMicrobus += tonLoad*200;
            }else if (tonLoad>=4 && tonLoad<=11){
                lorry += tonLoad;
                priceLorry += tonLoad*175;
            }else if (tonLoad>=12){
                train += tonLoad;
                priceTrain += tonLoad*120;
            }
            allTons = priceMicrobus + priceLorry + priceTrain;
            allTonsAverage = allTons/sumLoads;


        }
        System.out.printf("%.2f%n", allTonsAverage);
        System.out.printf("%.2f%%%n",microbus/sumLoads*100);
        System.out.printf("%.2f%%%n", lorry/sumLoads*100);
        System.out.printf("%.2f%%%n", train/sumLoads*100);
    }
}
