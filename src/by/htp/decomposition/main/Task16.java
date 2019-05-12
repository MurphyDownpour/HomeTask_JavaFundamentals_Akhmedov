package by.htp.decomposition.main;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2
 * (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        findTwins(a);
    }

    public static void findTwins(int userInput) {
        int start = userInput;
        int end = userInput * 2;

        for (int i = start; i <= end; i++) {
            System.out.println(i + " => " + (i + 2));
        }
    }
}
