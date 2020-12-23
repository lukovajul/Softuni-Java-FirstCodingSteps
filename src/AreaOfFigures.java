import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
        if(shape.equals("square")){
            double squareSide = Double.parseDouble(scanner.nextLine());
            area = squareSide * squareSide;
        } else if (shape.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        } else if (shape.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
        } else if (shape.equals("triangle")){
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());
            area = triangleHeight * triangleSide / 2;
        }

        System.out.printf("%.3f", area);
    }
}
