import java.util.Scanner;

public class MobileOperatorExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String termContract = scanner.nextLine();
        String contractType = scanner.nextLine();
        String  mobileNet = scanner.nextLine();

        int months = Integer.parseInt(scanner.nextLine());
        double monthTax = 0;

        switch (termContract){
            case "one":
                if (contractType.equals("Small")){
                    monthTax = 9.98;
            }else if (contractType.equals("Middle")){
                    monthTax = 18.99;
                }else if (contractType.equals("Large")){
                    monthTax = 25.98;
                }else if (contractType.equals("ExtraLarge")){
                    monthTax = 35.99;
                }
                break;
            case "two":
                if (contractType.equals("Small")){
                    monthTax = 8.58;
                }else if (contractType.equals("Middle")){
                    monthTax = 17.09;
                }else if (contractType.equals("Large")){
                    monthTax = 23.59;
                }else if (contractType.equals("ExtraLarge")){
                    monthTax = 31.79;
                }
                break;
        }

        //double sumMonths = monthTax * months;
        if (mobileNet.equals("yes") && monthTax<=10.00){
            monthTax = monthTax + 5.50;
        }else if (mobileNet.equals("yes") && monthTax<=30.00){
            monthTax = monthTax + 4.35;
        }else if (mobileNet.equals("yes") && monthTax>30.00){
            monthTax = monthTax + 3.85;
        }

        double sumMonths = monthTax * months;

        if (termContract.equals("two")){
            sumMonths = sumMonths - sumMonths * 0.0375;
        }

        System.out.printf("%.2f lv.", sumMonths);

    }
}
