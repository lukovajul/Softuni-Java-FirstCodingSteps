import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        double numberInMeters = 0;
        double numberInCentimeters = 0;
        double numberInMillimeters = 0;

        if (input.equals("m")){
            numberInCentimeters = number * 100;
            numberInMillimeters = number * 1000;
        }else if (input.equals("cm")){
            numberInMeters = number / 100;
            numberInMillimeters = number * 10;
        }else if (input.equals("mm")){
            numberInMeters = number / 1000;
            numberInCentimeters = number / 10;
        }
        if (output.equals("m")){
            System.out.printf("%.3f", numberInMeters);
        }else if (output.equals("cm")){
            System.out.printf("%.3f", numberInCentimeters);
        }else if (output.equals("mm")){
            System.out.printf("%.3f", numberInMillimeters);
        }



    }
}