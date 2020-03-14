package homework.baramiya.Class.Java;

import java.util.Scanner;

public class Core {
    public static void main(String[] args) {

        byte a = 2;
        short b = 3;
        int c = 500;
        long d = 3500l;
        float e = 3.231f;
        double f = 35.231;
        char g = '?';
        boolean i = true;
        System.out.println (a * (b + (c / d)));

        if ((a + b >= 10) && (a + b <= 20)) {
        System.out.println("Сумма a и b в пределах от 10 до 20");
        }
        else {
            System.out.println ("Сумма a и b меньше 10 или выше 20");
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println ("Введите целое число: ");
        int argument1 = userInput.nextInt();
        userInput.close();

        if ( argument1 % 1 == 0 ) {
            System.out.println (argument1 + " целое число");
        }
        if (argument1 * 1 == argument1) {
            System.out.println(argument1 + " положительное число");
        }
        if (argument1 * -1 == argument1) {
            System.out.println (argument1 + " отрицательное число") ;
        }

    }
}
