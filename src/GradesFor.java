import java.util.Scanner;

public class GradesFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());
        double totalGrade = 0;
        int excellentGrade = 0;//>5
        int middleGrade = 0;//4-5
        int lowGrade = 0;//3-4
        int failGrade = 0;//<3



        for (int i = 1; i<=numberStudents; i++){
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrade +=grade;
            if (grade>=2.00 && grade<=2.99){
                failGrade++;
            }else if (grade>=3.00 && grade<=3.99){
                lowGrade++;
            }else if (grade>=4.00 && grade<=4.99){
                middleGrade ++;
            }else if (grade>=5.00){
                excellentGrade++;

            }

        }
        double percentExcellentGrade = excellentGrade*1.0/numberStudents*100;
        double percentMiddleGrade = middleGrade*1.0/numberStudents*100;
        double percentLowGrade = lowGrade*1.0/numberStudents*100;
        double percentFailGrade = failGrade*1.0/numberStudents*100;
        double averageGrade = totalGrade/numberStudents;

        System.out.printf("Top students: %.2f%%%n", percentExcellentGrade);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentMiddleGrade);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentLowGrade);
        System.out.printf("Fail: %.2f%%%n", percentFailGrade);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
