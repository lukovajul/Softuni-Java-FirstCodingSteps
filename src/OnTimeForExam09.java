import java.util.Scanner;

public class OnTimeForExam09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //всички часове първо да се превърнат в минути
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int totalExamTime = hourExam * 60 + minutesExam;
        int totalArriveTime = hourArrive * 60 + minuteArrive;

        if (totalArriveTime > totalExamTime){
            System.out.println("Late");
            int lateMinutes = totalArriveTime - totalExamTime;
            if (lateMinutes <60){
                System.out.printf("%d minutes after the start", lateMinutes);
            }else{
                int hour = lateMinutes / 60;
                int minutes = lateMinutes % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }else if (totalArriveTime == totalExamTime || totalExamTime - totalArriveTime <=30){
            System.out.println("On time");
            int onTime = totalExamTime - totalArriveTime;
            if (onTime <=30 && totalArriveTime != totalExamTime){
                System.out.printf("%d minutes before the start", onTime);

            }

        }else if (totalExamTime - totalArriveTime>30){
            System.out.println("Early");
            int earlyMinutes = totalExamTime - totalArriveTime;
            if (earlyMinutes <60){
                System.out.printf("%d minutes before the start", earlyMinutes);

            }else{ //earlyMinutes >=60
                int hours = earlyMinutes / 60;
                int minutes = earlyMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }






    }
}
