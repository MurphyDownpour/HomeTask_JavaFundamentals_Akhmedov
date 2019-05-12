package by.htp.one_dimensional_arrays_pt1.main;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */

public class Task12 {
    public static void main(String[] args) {
        double[] arr = {0.1, 4.21, 5.4, 23.54, 33.21, 3.11, 77.56};
        double result = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (!isCompositeNumber(i)) {
                result += arr[i];
            }
        }

        System.out.println("Сумма: " + result);
    }

    public static boolean isCompositeNumber(int number) {
        int dividersCount = 1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                dividersCount++;
            }
        }

        if (dividersCount > 2) {
            return true;
        } else {
            return false;
        }
    }
}
