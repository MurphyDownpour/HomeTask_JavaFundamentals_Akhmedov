package by.htp.linear.main;

import java.util.Scanner;

//Составить алгоритм нахождения среднего арифметического двух чисел

public class Task05 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        double c = getAverage(a, b);

        System.out.println("Среднее арифметическое: " + c);
    }

    public static double getAverage(int a, int b) {
        return (double) ((a + b) / 2);
    }
}
