import java.util.Scanner;

public class PishtovDemonstration {
    public static void main(String[] args) {
        //Scanner използва се за въвеждане на променливи от конзолата
        Scanner myScanner = new Scanner(System.in);

        // тип, име, стойност на променлива
        String firstName = myScanner.nextLine();
        //double myBgMark = 5.2;
       // int teamMembers = 13;
        System.out.println(firstName);
    }
}
//String text = "Softuni";
//int length = text.length(); числото int = броя букви  в стринга софтуни
//String text = "Softuni";
//char letter = text.charAt(4); - показва 4-ти символ/буква от стринга text, в случаая Softuni
// когато броим символи в стрингове, първият символ/буква е със стойност 0. Така че 4-ти символ/буква от Softuni е u.
//char currentChar = input.charAt(i); - променливата currentChar е равна на символът i, който разглеждаме
// i<input.length(); - i е по-малки от дължината на въведеният input
//char a = scanner.nextLine().charAt(0) - въвежда произволен чар от конзолата; "въвеждам текст и искам да му взема първия символ"; нула е понеже текстове се борят от нула
// с горния пример ако въведем в конзолата текст или символ с повече от 1 букви/символи, ще отпечата само първият, защото сме въвели 0 = първи символ;

//System.out.printf("Apartment: %.2f lv. %n", apartmentPrice); - с %n се указва да бъде принтираното на отделен ред
//        System.out.printf("Studio: %.2f lv.", studioPrice );
//www.stackoverflow.com - сайт за въпроси и отговори при програмиране