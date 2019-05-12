package by.htp.linear.main;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */
public class Task22 {
    public static void main(String[] args) {
        System.out.print("Введите количество секунд: ");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        String time = calculateTime(seconds);

        System.out.println(time);
    }

    public static String calculateTime(int seconds) {
        int sec = seconds % 60;
        seconds -= sec;

        int min = (seconds / 60) % 60;
        seconds -= min * 60;

        int hours = (seconds / 3600) % 24;

        return "Время: " + hours + ":" + min + ":" + sec;
    }
}
