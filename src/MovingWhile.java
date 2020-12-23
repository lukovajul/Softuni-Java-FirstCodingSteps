import java.util.Scanner;

public class MovingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space= width * length * height;


        while (true){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                System.out.println(space + "Cubic meters left.");
                break;
            }
            int box = Integer.parseInt(input);
            space-=box;
            if (space<0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
                break;
            }

        }
    }
}
