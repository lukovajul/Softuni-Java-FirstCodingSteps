import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        //за да задам променлива трябват нейните тип, име и стойност
        //int number = 5;
       // double decimalNumber = 5.6;
       // String name = "Julia";
        //char symbol = 'd';

        Scanner scanner = new Scanner(System.in);
        //int money = Integer.parseInt(scanner.nextLine());
        //double moneyToSend = Double.parseDouble(scanner.nextLine());
        //String firstName = scanner.nextLine();
        //?Защо някъде пишем Scanner scanner = new Scanner(System.in); а на други места пишем Scanner scan = new Scanner(System.in); ?

        String name = scanner.nextLine();
        String town = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        //I am името на човека from град and I am години years old.
        System.out.printf("I am %s from %s and I am %d years old.", name, town, age);

        // шаблони:
        //%s - string
        //%d - int
        //%f - double
        //%c - char
        //%n - newline

        //до число след запетя пишем %.2f и така числото ще е примерно >> 22.22 а без тази 2-ка ще е 22.22345 примерно

        //ако числото е дабъл но искаме да не се показват знаци след , пишем %.0f






    }
}
