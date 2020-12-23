import java.util.Scanner;

public class StreamOfLettersWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
       // String letter = "";

        //булевите променливи помнят дали даден символ е срещан вече веднъж

        boolean o = false;
        boolean c = false;
        boolean n = false;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            char valid = input.charAt(0);

            if ((valid >= 'a' && valid <= 'z') || (valid >= 'A' && valid <= 'Z')) { // така се проверява дали са част от латинската забука и се игнорират другите символи
                // когато има о c n влиза в дадения кейс
                switch (input) {
                    case "o":
//    при първо среща на 'о' променливата о=false и не влиза в if след което о=true и при следваща среща о=true
//    и вече влиза в if и се преибавя към текущата дума
                        if (o) {
                            word += input;
                        }
                        o = true;
                        break;

                    case "c":
                        if (c) {
                            word += input;
                        }
                        c = true;
                        break;

                    case "n":
                        if (n) {
                            word += input;
                        }
                        n = true;
                        break;

                    default:
                        word += input;
                        break;
                }
            }
            input = scanner.nextLine();

//       когато сме срещнали и трите символа по веднъв влиза в if където печата и отново 'o'=false 'c'=false 'n'=false
            if (o && c && n) {
                System.out.print(word + " ");
                o = false;
                c = false;
                n = false;
//                    letter = "";
                word = "";
            }
        }

    }


}


