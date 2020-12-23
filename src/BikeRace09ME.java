import java.util.Scanner;

public class BikeRace09ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double taxJunior = 0;
        double taxSenior = 0;
        switch (trace){
            case "trail":
                taxJunior = juniorBikers * 5.50;
                taxSenior = seniorBikers * 7;
                break;
            case "cross-country":
                taxJunior = juniorBikers * 8;
                taxSenior = seniorBikers * 9.50;
                if (juniorBikers + seniorBikers>=50) {
                    taxJunior = taxJunior * 0.75;
                    taxSenior = taxSenior * 0.75;
                }
                break;
            case "downhill":
                taxJunior = juniorBikers * 12.25;
                taxSenior = seniorBikers * 13.75;
                break;
            case "road":
                taxJunior = juniorBikers * 20;
                taxSenior = seniorBikers * 21.50;
                break;
            }
            double amount = taxJunior + taxSenior;
        double donatedAmount = amount * 0.95;
        System.out.printf("%.2f", donatedAmount);
        }
    }

