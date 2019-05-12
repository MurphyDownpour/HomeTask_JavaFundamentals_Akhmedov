package by.htp.loops.main;

/**
 * Даны два двузначных числа А и В.
 * Из этих чисел составили 2 четырехзначных числа:
 * первое число получили путем написания сначала числа А, затем В.
 * Для получения второго числа сначала записали число В, затем А.
 * Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.
 */

public class Task37 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if ((i % 100) / 10 == 0) {
                continue;
            }

            if (i % 49 == 0) {
                int reverse = Integer.parseInt((Integer.toString(i % 100) + Integer.toString(i / 100)));

                if (reverse % 99 == 0) {
                    System.out.println("A = " + (i % 100));
                    System.out.println("B = " + (i / 100));
                }
            }
        }
    }
}
