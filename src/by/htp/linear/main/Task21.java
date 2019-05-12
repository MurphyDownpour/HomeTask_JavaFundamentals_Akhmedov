package by.htp.linear.main;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 */

public class Task21 {
    public static void main(String[] args) {
        System.out.print("Введите действительное число: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double result = replaceDouble(number);

        System.out.println("Ответ: " + result);
    }

    public static double replaceDouble(double number) {
        int integerValue = (int) (number * 1000);
        int lastDigits = integerValue % 1000;
        int firstDigits = integerValue / 1000;

        double result = Double.parseDouble(lastDigits + "." + firstDigits);

        return result;
    }
}
