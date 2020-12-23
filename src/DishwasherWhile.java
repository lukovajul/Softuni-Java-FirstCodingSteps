import java.util.Scanner;

public class DishwasherWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfBottles = Integer.parseInt(scanner.nextLine());
        int detergentQuantity = numberOfBottles*750;

        int counter = 0; //брои зарежданията
        int plates = 0;
        int pots = 0;
        int platesWashed = 0;
        int potsWashed = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")){
            int numberOfDishesToBeWashed = Integer.parseInt(command);
            counter++;

            if (counter%3==0){
                pots=numberOfDishesToBeWashed;
                potsWashed+=pots;
                detergentQuantity-=pots*15;

            }else{
                plates=numberOfDishesToBeWashed;
                platesWashed+=plates;
                detergentQuantity-=plates*5;

            }
            if (detergentQuantity<0){
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentQuantity));
                break;
            }
            command=scanner.nextLine();

            if (command.equals("End")){
                System.out.println("Detergent was enough!");
                System.out.printf("%d dishes and %d pots were washed.%n", platesWashed, potsWashed);
                System.out.printf("Leftover detergent %d ml.", Math.abs(detergentQuantity));
            }
        }


    }
}


