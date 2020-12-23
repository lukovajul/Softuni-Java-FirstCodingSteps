import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 0; rows <n; rows++){ //тук печатаме всеки ред, очертава рамката на всеки ред
            for (int col = 1; col <n-rows; col++){ //оттук започваме да пълним редовете, за да можем да отпечатаме съдържанието им
                System.out.print(" "); //първо на реда има интервал равен на n-rows, т.е ако n е 4, интервалите ще са 3
            }
            System.out.print('*'); //след интервалите се печата *, като на първия ред винаги е 1

            for (int col = 0; col <rows; col++){ //с този цикъл добавяме на следващия ред + с интервал отпред
                System.out.print(" *");
            }
            System.out.println(); //за да се речата на нов ред всеки ред

        }

        for (int rows = 0; rows<n-1; rows++){
            for (int col = 0; col<rows+1; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i< n - rows-2; i++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
