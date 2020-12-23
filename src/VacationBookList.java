import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. да прочетем входните данни на задачата и да ги съхраним в променливи
        //2. за колко часа трябва да прочете книгата = бр. страници / страници за час
        //3. колко часа на ден = за колко часа трябва да прочете книгата / дни
        //4. печатаме получените часове

        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursToRead = pagesBook / pagesPerHour; //колко часа отмена книгата
        int hoursPerDay = hoursToRead / daysToRead;
        System.out.println(hoursPerDay);




    }
}
