package by.htp.loops.main;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А
 * программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= a; i++) {
            result += i;
        }

        System.out.println("Результат: " + result);
    }
}
