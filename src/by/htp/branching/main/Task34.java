package by.htp.branching.main;

import java.util.Scanner;

/**
 * Составить программу, реализующую эпизод применения компьютера в книжном магазине.
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
 * если сдачи не требуется, печатает на экране «спасибо»;
 * если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи;
 * если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */

public class Task34 {
    public static void main(String[] args) {
        System.out.print("Введите стоимость книг: ");
        Scanner sc = new Scanner(System.in);

        double booksPrice = sc.nextDouble();

        System.out.print("Внесите сумму денег: ");

        double money = sc.nextDouble();

        checkout(booksPrice, money);

    }

    public static void checkout(double price, double money) {
        if (money < price) {
            System.out.println("Недостаточно средств. Необходимо ещё " + (price - money));
        } else if (money > price) {
            System.out.println("Возьмите сдачу " + (money - price));
        } else {
            System.out.println("Спасибо!");
        }
    }
}
