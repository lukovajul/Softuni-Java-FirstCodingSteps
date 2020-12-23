public class Demo {
    public static void main(String[] args) {

        byte num1 = 10;
        short num2 = 1;
        int num3 = 1000;
        long num4 = 50000L + 10L * (num1 + num2 + num3);

        System.out.println(num4);

        char myChar = 'M';
        char myUnicodeChar = '\u004D'; // така се вкарват символи от unicode - www.unicode-table.com
        System.out.println(myUnicodeChar);
        System.out.println(myChar);

        int result = 4;
        result = result/3;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien==true){
            System.out.println("This is not an alien!");
        }




    }
}
