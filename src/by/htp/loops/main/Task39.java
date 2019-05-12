package by.htp.loops.main;

/**
 * В трехзначном числе зачеркнули старшую цифру.
 * Когда полученное число умножили на 7, то получили исходное число. Найти это число.
 */

public class Task39 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if ((i % 100) / 10 == 0) {
                continue;
            }

            int number = i % 100;

            if (number * 7 == i) {
                System.out.println(i);
            }
        }
    }
}
