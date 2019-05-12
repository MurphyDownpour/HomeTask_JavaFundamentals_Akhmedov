package by.htp.linear.main;

import java.util.Scanner;

/**
 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
 */

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Введите координаты (x1, y1, x2, y2): ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("Расстояние составляет " + distance);
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distance;
    }
}
