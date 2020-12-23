import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class SummerOutfit09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        switch (time){
            case "Morning":
                if (degree>=10 && degree<=18){
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree);
                }else if (degree>18 && degree <=24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                }else if (degree>=25){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
                }
                break;
            case "Afternoon":
                if (degree>=10 && degree<=18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                }else if (degree>18 && degree <=24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
                }else if (degree>=5){
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);
                }
                break;
            case "Evening":
                if (degree>=10 && degree<=18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                }else if (degree>18 && degree <=24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                }else if (degree>=5){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                }
                break;

        }



    }
}
