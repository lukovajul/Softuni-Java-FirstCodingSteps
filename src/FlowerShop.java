
    import java.util.Scanner;

    public class FlowerShop {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int countMagnolias = Integer.parseInt(scan.nextLine());
            int countHyacinths = Integer.parseInt(scan.nextLine());
            int countRoses = Integer.parseInt(scan.nextLine());
            int countCactus = Integer.parseInt(scan.nextLine());
            double presentPrice = Double.parseDouble(scan.nextLine());

            // Magnolias - 3.25 , Hyacinths - 4, Roses - 3.50 Cactus - 8
            double orderMagnoliasCost = countMagnolias * 3.25;
            double orderHyacinthsCost = countHyacinths * 4;
            double orderRosesCost = countRoses * 3.5;
            double orderCactusCost = countCactus * 8;

            double totalSum = orderMagnoliasCost + orderHyacinthsCost + orderRosesCost + orderCactusCost;
            //totalSum pay tax fee 5%
            double earnings = totalSum - 0.05 * totalSum;

            if (presentPrice <= earnings) {
                double leftMoney = Math.floor(earnings - presentPrice);
                System.out.printf("She is left with %.0f leva.", leftMoney);
            } else if (presentPrice > earnings) {
                double needMoney = Math.ceil(presentPrice - earnings);
                System.out.printf("She will have to borrow %.0f leva.", needMoney);
            }
        }
    }

