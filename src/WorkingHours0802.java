import java.util.Scanner;

public class WorkingHours0802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour>=10 && hour<=18){
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                    break;
                }
                break;
            default:
                System.out.println("closed");
                break;

        }

        }


    }






