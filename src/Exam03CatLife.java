import java.util.Objects;
import java.util.Scanner;

public class Exam03CatLife {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String race = scanner.nextLine();
        //char sex = scanner.next().charAt(0);
        String sex = scanner.nextLine();
        boolean check = false;

        int years = 0;


       // switch (race){
        switch (race) {
            case "British Shorthair":

                if (sex.equals("m")) {
                    years = 13;
                } else if (sex.equals("f")) {
                    years = 14;
                }
                break;
            case "Siamese":
                if (sex.equals("m")) {
                    years = 15;
                } else if (sex.equals("f")) {
                    years = 16;
                }
                break;
            case "Persian":
                if (sex.equals("m")) {
                    years = 14;
                } else if (sex.equals("f")) {
                    years = 15;
                }
                break;
            case "Ragdoll":
                if (sex.equals("m")) {
                    years = 16;
                } else if (sex.equals("f")) {
                    years = 17;
                }
                break;
            case "American Shorthair":
                if (sex.equals("m")) {
                    years = 12;
                } else if (sex.equals("f")) {
                    years = 13;
                }
                break;
            case "Siberian":
                if (sex.equals("m")) {
                    years = 11;
                } else if (sex.equals("f")) {
                    years = 12;
                }

                break;


            default:
                System.out.printf("%s is invalid cat!%n", race);
                check = true;
                break;

        }
        if (check==false){
            int catYears = years*12/6;
            System.out.printf("%d cat months",catYears);

        }


    }
}
