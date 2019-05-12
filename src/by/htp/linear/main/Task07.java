package by.htp.linear.main;

import java.util.Scanner;

/**
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */

public class Task07 {
    public static void main(String[] args) {
        System.out.print("Укажите длину прямоугольника: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int area = calculateArea(length);

        System.out.println("Площадь составляет " + area);
    }

    public static int calculateArea(int length) {
        int width = length / 2;

        return width * length;
    }
}
