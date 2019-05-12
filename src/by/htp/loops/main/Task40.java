package by.htp.loops.main;

import java.util.Scanner;

/**
 * Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
 */

public class Task40 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int reserve = i;
            int digits = digitCount(i);
            int counter = 0;

            while (reserve != 0) {
                int divider = reserve % 10;
                reserve /= 10;

                if (divider == 0) {
                    break;
                }

                if (i % divider == 0) {
                    counter++;
                    if (counter == digits) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    public static int digitCount(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
