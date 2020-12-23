import java.util.Scanner;

public class SumOfTwoNumbersNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false; // в началото е фолс, защото още не е намерена такава комбинация

        for (int firstNumber = start; firstNumber<=end; firstNumber++ ){
            for (int secondNumber = start; secondNumber<=end; secondNumber++){
                count++;
                if (firstNumber+secondNumber==magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",count, firstNumber, secondNumber, magicNumber);
                    break;

                }

            }
            if (isFound){
                break;
            }

        }
        if (isFound==false){
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);

        }
    }
}
