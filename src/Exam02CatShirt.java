import java.util.Scanner;

public class Exam02CatShirt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sizeSleeve = Double.parseDouble(scanner.nextLine());
        double sizeFront = Double.parseDouble(scanner.nextLine());
        String cloth = scanner.nextLine();
        String tie = scanner.nextLine();
        double pricePerMeter = 0;

        double sizeShirt = sizeSleeve*2 + sizeFront*2;

        sizeShirt = sizeShirt + sizeShirt*0.1;
        double sizeShirtMeters = sizeShirt/100;

        if (cloth.equals("Linen")){
            pricePerMeter = 15.00;
        }else if (cloth.equals("Cotton")){
            pricePerMeter = 12.00;
        }else if (cloth.equals("Denim")){
            pricePerMeter = 20.00;
        }else if (cloth.equals("Twill")){
            pricePerMeter = 16.00;
        }else if (cloth.equals("Flannel")){
            pricePerMeter= 11.00;
        }

        double priceShirt = pricePerMeter*sizeShirtMeters + 10;

        if (tie.equals("Yes")){
            priceShirt = priceShirt + priceShirt*0.2;
        }

        System.out.printf("The price of the shirt is: %.2flv.",priceShirt);





    }
}
