package by.htp.linear.main;

import java.util.Scanner;

/**
 * Найти произведение цифр заданного четырехзначного числа.
 */

public class Task16 {
    public static void main(String[] args) {
        System.out.print("Введите четырёхзначное число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = multiplyDigits(number);

        System.out.println("Ответ: " + result);
    }

    public static int multiplyDigits(int number) {
        int result = 1;

        result *= number % 10;
        result *= (number / 10) % 10;
        result *= (number / 100) % 10;
        result *= number / 1000;

        return result;
    }
}
