import java.util.Scanner;

public class Exam01CatExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double catBed = Double.parseDouble(scanner.nextLine());
        double catToiletMonth = Double.parseDouble(scanner.nextLine());

        double foodMonth = catToiletMonth + catToiletMonth*0.25;
        double toysMonth = foodMonth*0.5;
        double vetMonth = toysMonth + toysMonth*0.1;

        double totalMonth = catToiletMonth+foodMonth+toysMonth+vetMonth;
        double unforeseenExpenses = totalMonth*0.05;
        double totalYear = catBed+12*totalMonth+12*unforeseenExpenses;

        System.out.printf("%.2f lv.", totalYear);

    }
}
