package by.htp.linear.main;

import java.util.Scanner;

/*
* Написать код для решения задачи. В n малых бидонах 80 л молока.
* Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
* */

public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введите количество малых бидонов: ");
        Scanner sc = new Scanner(System.in);
        int small = sc.nextInt();
        System.out.print("Введите количество больших бидонов: ");
        int big = sc.nextInt();

        int bigTotalMilk = calculateBigCan(small, big);

        System.out.println("Всего молока в больших бидонах: " + bigTotalMilk + " л.");
    }

    public static int calculateBigCan(int small, int big) {
        int smallTotalMilk = 80;
        int milkPerSmall = smallTotalMilk / small;

        int milkPerBig = milkPerSmall + 12;
        int bigTotalMilk = milkPerBig * big;

        return bigTotalMilk;
    }
}
