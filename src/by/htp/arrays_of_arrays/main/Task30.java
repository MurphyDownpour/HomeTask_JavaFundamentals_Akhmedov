package by.htp.arrays_of_arrays.main;

import java.util.Random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
 * матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class Task30 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        int[] fives = new int[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                int value = rand.nextInt(16);

                if (value == 5) {
                    fives[i]++;
                }

                arr[i][j] = value;
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 0; i < fives.length; i++) {
            if (fives[i] >= 3) {
                System.out.println("Много пятёрок на строке " + i);
            }
        }
    }
}
