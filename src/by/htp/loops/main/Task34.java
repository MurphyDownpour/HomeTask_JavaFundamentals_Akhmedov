package by.htp.loops.main;

/**
 * Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */

public class Task34 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int sum = (i % 10) + ((i / 10) % 10) + ((i / 100) % 10) + (i / 1000);

            if (sum == 15) {
                System.out.println(i);
            }
        }
    }
}
