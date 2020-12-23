import java.util.Scanner;

public class GraduationWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int grade = 1;
        double sum = 0;
        int repetitions = 0;
        boolean isExcluded = false;

        while (grade <=12){
            double currentMark = Double.parseDouble(scanner.nextLine());
            if (currentMark<4){
                repetitions++;
                if (repetitions == 2){
                    System.out.printf("%s has been excluded at %d grade", studentName, grade);
                    isExcluded = true;
                    break;
                }
                continue;
            }
            sum +=currentMark;
            grade++;

        }
        if (!isExcluded) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, average);
        }
    }
}
