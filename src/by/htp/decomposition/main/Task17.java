package by.htp.decomposition.main;

import java.util.Scanner;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

public class Task17 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        findArmstrongNumbers(a);
    }

    public static void findArmstrongNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            int sum = 0;
            int temp = i;

            for (int j = 1; j <= digitCount(i); j++) {
                sum += temp % 10;
                temp /= 10;
            }

            if (Math.pow(sum, digitCount(i)) == i) {
                System.out.println(i);
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
