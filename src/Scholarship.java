import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = minimalSalary * 0.35;
        double excellentScholarship = averageGrade * 25;
        if (income > minimalSalary) {
            if (averageGrade >= 5.50) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));

            } else {
                System.out.printf("You cannot get a scholarship!");

            }
        } else {
            if (averageGrade >= 5.50) {
                if (socialScholarship > excellentScholarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));

                } else {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
                }
            } else if (averageGrade < 4.50) {
                System.out.println("You cannot get a scholarship!");
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));

            }

        }
    }

    }