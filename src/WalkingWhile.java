import java.util.Scanner;

public class WalkingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int totalSteps = 0;

        while (!command.equals("Going home")){
            int steps = Integer.parseInt(command);
            totalSteps+=steps;
            if (totalSteps>=10000){
                break;
            }

            command = scanner.nextLine();

        }
        if (command.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalSteps+=stepsToHome;
        }
        if (totalSteps>=10000) {
            System.out.println("Goal reached! Good job!");
            int moreSteps = totalSteps - 10000;
            System.out.printf("%d steps over the goal!", moreSteps);
        }else{
            int diffSteps = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.",diffSteps);
        }


        // стоп: стъпки >=10000
        // стоп: ако получим команда Going home
        // командата е или число или стринг going home
    }
}

// втори вариант:
// while (totalSteps<10000){
//String command = scanner.nextLine();
//if (command.equals("Going home")){
//int stepsToHome = Integer.parseInt(scanner.nextLine));
//totalSteps+=stepsToHome;
//break;
//} else{
//int steps = Integer.parseInt(command);
//totalSteps += steps;
//}
//}
//if (totalSteps>=10000) {
//            System.out.println("Goal reached! Good job!");
//            int moreSteps = totalSteps - 10000;
//            System.out.printf("%d steps over the goal!", moreSteps);
//        }else{
//            int diffSteps = 10000 - totalSteps;
//            System.out.printf("%d more steps to reach goal.",diffSteps);
//        }