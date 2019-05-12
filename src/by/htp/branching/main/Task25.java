package by.htp.branching.main;

import java.util.Scanner;

/**
 * Написать программу — модель анализа пожарного датчика в помещении,
 * которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.
 */

public class Task25 {
    public static void main(String[] args) {
        System.out.print("Введите температуру: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp <= 60) {
            System.out.println("Всё в порядке");
        } else {
            System.out.println("Пожароопасная ситуация");
        }
    }
}
