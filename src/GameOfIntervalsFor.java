import java.util.Scanner;

public class GameOfIntervalsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double finalScore = 0;

        double score9 = 0;
        double score19 = 0;
        double score29 = 0;
        double score39 = 0;
        double score50 = 0;
        double invalidNumbers = 0;

        for (int i=1; i<=moves; i++){
            double numberIntervals = Double.parseDouble(scanner.nextLine());

            if (numberIntervals>=0 && numberIntervals<=9){
                score9++;
                finalScore+=numberIntervals*0.2;
            }else if (numberIntervals>=10 && numberIntervals<=19){
                score19++;
                finalScore+=numberIntervals*0.3;
            }else if (numberIntervals>=20 && numberIntervals<=29){
                score29++;
                finalScore+=numberIntervals*0.4;
            }else if (numberIntervals>=30 && numberIntervals<=39){
                score39++;
                finalScore+=50;
            }else if (numberIntervals>=40 && numberIntervals<=50){
                score50++;
                finalScore+=100;
            }else{ //invalid number
                finalScore=finalScore/2;
                invalidNumbers++;
            }
        }

        double lowTotal = (score9/moves)*100;
        double midTotal = (score19/moves)*100;
        double averageTotal = (score29/moves)*100;
        double highTotal = (score39/moves)*100;
        double aboveTotal= (score50/moves)*100;
        double invalidTotal = (invalidNumbers/moves)*100;

        System.out.printf("%.2f%n", finalScore);
        System.out.printf("From 0 to 9: %.2f%%%n",lowTotal);
        System.out.printf("From 10 to 19: %.2f%%%n",midTotal);
        System.out.printf("From 20 to 29: %.2f%%%n",averageTotal);
        System.out.printf("From 30 to 39: %.2f%%%n",highTotal);
        System.out.printf("From 40 to 50: %.2f%%%n",aboveTotal);
        System.out.printf("Invalid numbers: %.2f%%%n",invalidTotal);


    }
}
