package by.htp.branching.main;

import java.util.Scanner;

/**
 * Написать программу, которая по заданным трем числам определяет,
 * является ли сумма каких-либо двух из них положительной.
 */

public class Task32 {
    public static void main(String[] args) {
        System.out.print("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > 0 || b + c > 0 || a + c > 0) {
            System.out.println("Да!");
        } else {
            System.out.println("Нет.");
        }
    }
}
