import java.util.Scanner;

public class CoinsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//спираме да връщаме ресто, когато то стане <= 0
        // продължаваме да връщаме, ако нашето ресто е > 0
        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double changeInSt = Math.round(changeInLeva * 100);
        int countCoins = 0;

        while (changeInSt > 0){
            //връщам ресто ипроверка с кои монети мога да върна
            if (changeInSt>=200){
                // можем да върнем с 2 лв
                // връщаме и:
                changeInSt-=200;
                //след като сме върнали, броим монетата
                countCoins++;
            }else if (changeInSt>=100){
                //ресто м-у 100 и 199 st.
                changeInSt-=100;
                countCoins++;
            }else if (changeInSt>=50){
                //ресто между 50 и 99 ст.ct.
                changeInSt-=50;
                countCoins++;
            }else if (changeInSt>=20){
                changeInSt-=20;
                countCoins++;
            }else if (changeInSt>=10){
                changeInSt-=10;
                countCoins++;
            }else if (changeInSt>=5){
                changeInSt-=5;
                countCoins++;

            }else if (changeInSt>=2){
                changeInSt-=2;
                countCoins++;
            }else if (changeInSt>=1){
                changeInSt-=1;
                countCoins++;
            }

        }
        System.out.println(countCoins);


    }
}
