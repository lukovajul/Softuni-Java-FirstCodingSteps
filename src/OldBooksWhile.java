import java.util.Scanner;

public class OldBooksWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String command = scanner.nextLine();
        int countCheckedBooks = 0;

        while (!command.equals("No More Books")){
            if (command.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.", countCheckedBooks);
                break;
            }else {
                countCheckedBooks++;
            }
            command = scanner.nextLine();
        }
        if (command.equals("No More Books")){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countCheckedBooks);
        }

    }
}
