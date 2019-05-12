package by.htp.branching.main;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task27 {
    public static void main(String[] args) {
        System.out.print("Введите четыре числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int firstResult = min(a, b);
        int secondResult = min(c, d);

        int finalResult = max(firstResult, secondResult);

        System.out.println("Ответ: " + finalResult);
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
