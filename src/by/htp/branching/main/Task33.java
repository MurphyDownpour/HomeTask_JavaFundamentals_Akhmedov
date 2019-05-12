package by.htp.branching.main;

import java.util.Scanner;

/**
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации
 * в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
 * Они имеют следующие пароли:
 * 9583, 1747 — доступны модули баз А, В, С;
 * 3331, 7922 — доступны модули баз В, С;
 * 9455, 8997 — доступен модуль базы С.
 */

public class Task33 {
    public static void main(String[] args) {
        System.out.print("Введите пароль: ");
        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        checkAccess(password);
    }

    public static void checkAccess(int password) {
        if (password == 9455 || password == 8997) {
            System.out.println("Вам доступен модуль базы С.");
        } else if (password == 3331 || password == 7922) {
            System.out.println("Вам доступны модули баз В, С.");
        } else if (password == 9583 || password == 1747) {
            System.out.println("Вам доступны модули баз A, В, С.");
        } else {
            System.out.println("У вас нет доступов.");
        }
    }
}
