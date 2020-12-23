import java.util.Scanner;

public class HotelRoom09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                if (overnights>7 && overnights <=14){
                    studioPrice = overnights * 50 * 0.95;
                } else if (overnights>14) {
                    studioPrice = overnights * 50 * 0.7;
                }else{
                    studioPrice = overnights * 50;
                }
                if (overnights>14){
                    apartmentPrice = overnights * 65 * 0.9;
                }
                else{
                    apartmentPrice = overnights * 65;
                }
                break;
            case "June":
            case "September":
                if (overnights>14){
                    studioPrice = overnights * 75.20 * 0.8;
                }else{
                    studioPrice = overnights * 75.20;
                }
                if (overnights>14){
                    apartmentPrice = overnights * 68.70 * 0.9;
                }
                else{
                    apartmentPrice = overnights * 68.70;
                }
                break;
            case "July":
            case "August":
                    studioPrice = overnights * 76;
                if (overnights>14){
                    apartmentPrice = overnights * 77 * 0.9;
                }
                else{
                    apartmentPrice = overnights * 77;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice );


    }

}
