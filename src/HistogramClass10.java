import java.util.Scanner;

public class HistogramClass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;
        int countForth = 0;
        int countFifth = 0;

        for (int number = 1; number<=n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (value<200){
                countFirst+=1;
            }else if (value>= 200 && value <=399){
                countSecond+=1;
            }else if (value>=400 && value <=599){
                countThird+=1;
            }else if (value>=600 && value <=799){
                countForth+=1;
            }else if (value>=800){
                countFifth+=1;
            }

        }
        double percentFirst = countFirst * 1.0/n * 100;
        double percentSecond = countSecond * 1.0/n * 100;
        double percentThird = countThird * 1.0/n * 100;
        double percentForth = countForth * 1.0/n * 100;
        double percentFifth = countFifth * 1.0/n * 100;

        System.out.printf("%.2f%%%n", percentFirst);
        System.out.printf("%.2f%%%n", percentSecond);
        System.out.printf("%.2f%%%n", percentThird);
        System.out.printf("%.2f%%%n", percentForth);
        System.out.printf("%.2f%%", percentFifth);
    }
}
