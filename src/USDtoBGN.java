import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);

        //1. първо се прави променлива за доларите, щом конвертираме долари към лева
        //2. след това се определя валутния курс 1 usd = 1.79549 bng
        //3. трябва да се създаде променлива за лева = долари * курс /може и без променлива за лева, а да се принтира директно умножението
        //4. да се принтират доларите в лева

        //Scanner scanner = new Scanner(System.in);
        //double usd = Double.parseDouble(scanner.nextLine());
        //System.out.println(usd * 1.79549);

    }
}
